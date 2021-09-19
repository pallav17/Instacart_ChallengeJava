package com.instacart.android.challenges.network;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class OrdersResponse {

    @SerializedName("orders")
    private List<Long> orders;
}
