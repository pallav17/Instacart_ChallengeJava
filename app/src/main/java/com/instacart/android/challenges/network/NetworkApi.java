package com.instacart.android.challenges.network;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface NetworkApi {

    @GET("orders")
    Call<OrdersResponse> fetchOrders();

    @GET("orders")
    Observable<OrdersResponse> fetchOrderObservable();

    @GET("order/{order_id}")
    Call<OrderResponse> fetchOrderById(@Path("order_id") Long id);

    @GET("discount/{item_id}")
    Call<DiscountResponse> discount();

    @GET("discount/{item_id}")
    Observable<DiscountResponse> discountObservable();




}
