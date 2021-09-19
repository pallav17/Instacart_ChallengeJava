package com.instacart.android.challenges.network;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class OrderResponse {

    @SerializedName("items")
    private List<DeliveryItem> items;

    public OrderResponse(List<DeliveryItem> items) {
        this.items = items;
    }

    public List<DeliveryItem> getItems() {
        return items;
    }

    public void setItems(List<DeliveryItem> items) {
        this.items = items;
    }


}
