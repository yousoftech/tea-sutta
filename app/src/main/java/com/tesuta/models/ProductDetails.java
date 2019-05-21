package com.tesuta.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tesuta.models.AllProductDetailsList;
import com.tesuta.models.AllProductImage;
import com.tesuta.models.AllProductUnitDetailsList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nilay on 10/21/2017.
 */

public class ProductDetails {

    public String getOde_id() {
        return ode_id;
    }

    public void setOde_id(String ode_id) {
        this.ode_id = ode_id;
    }

    String ode_id;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<AllProductDetailsList> getData() {
        return data;
    }

    public void setData(List<AllProductDetailsList> data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @SerializedName("status")
    @Expose
    private String status;

    @SerializedName("data")
    @Expose
    private List<AllProductDetailsList> data = new ArrayList<AllProductDetailsList>();

    public List<AllProductUnitDetailsList> getProduct_data() {
        return product_data;
    }

    public void setProduct_data(List<AllProductUnitDetailsList> product_data) {
        this.product_data = product_data;
    }

    @SerializedName("product_data")
    @Expose
    private List<AllProductUnitDetailsList> product_data = new ArrayList<AllProductUnitDetailsList>();

    public List<AllProductImage> getProduct_img() {
        return product_img;
    }

    public void setProduct_img(List<AllProductImage> product_img) {
        this.product_img = product_img;
    }

    private List<AllProductImage> product_img = new ArrayList<AllProductImage>();

    @SerializedName("message")
    @Expose
    private String message;


}
