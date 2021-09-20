package com.instacart.android.challenges;

import com.instacart.android.challenges.network.DeliveryItem;
import com.instacart.android.challenges.network.OrderResponse;
import com.instacart.android.challenges.network.OrdersResponse;

import java.util.List;

public class ItemListViewState {
    List<ItemRow> items;
    String toolbarTitle;
    OrderResponse orderResponse;



    List<DeliveryItem> deliveryItems;

    public OrderResponse getOrderResponse() {
        return orderResponse;
    }



    public void setOrderResponse(OrderResponse orderResponse) {
        this.orderResponse = orderResponse;
    }
    public List<DeliveryItem> getDeliveryItems() {
        return deliveryItems;
    }

    public void setDeliveryItems(List<DeliveryItem> deliveryItems) {
        this.deliveryItems = deliveryItems;
    }

    public String getToolbarTitle() {
        return toolbarTitle;
    }

    public void setToolbarTitle(String toolbarTitle) {
        this.toolbarTitle = toolbarTitle;
    }

    public List<ItemRow> getItems() {
        return items;
    }

    public void setItems(List<ItemRow> items) {
        this.items = items;
    }

    /*public ItemListViewState(String toolbarTitle, List<ItemRow> items) {
        this.toolbarTitle = toolbarTitle;
        this.items = items;
    }*/




}

