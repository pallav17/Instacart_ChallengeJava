package com.instacart.android.challenges.network;

import com.google.gson.annotations.SerializedName;

public class DiscountResponse {

    @SerializedName("id")
    private long id;
    @SerializedName("price")
    private String price;
    @SerializedName("discount")
    private String discount;


    public DiscountResponse(long id, String price, String discount) {
        this.id = id;
        this.price = price;
        this.discount = discount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

}
