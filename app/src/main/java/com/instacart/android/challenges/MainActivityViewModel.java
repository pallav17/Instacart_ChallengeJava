package com.instacart.android.challenges;

import android.util.Log;

import com.instacart.android.challenges.network.NetworkService;
import com.instacart.android.challenges.network.OrderResponse;
import com.instacart.android.challenges.network.OrdersResponse;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivityViewModel
{

    OrderResponse orderResponse;
    public interface UpdateListener {

        public void onUpdate(ItemListViewState state);
        public void onFailure(Exception e);

    }

    ItemListViewState itemListViewState;
    UpdateListener listener;

      public MainActivityViewModel() {

        List<ItemRow> items = new ArrayList<>();

        items.add(new ItemRow("Cabbage"));
        items.add(new ItemRow("Apple"));
        items.add(new ItemRow("Bread"));
      //  itemListViewState = new ItemListViewState("Delivery Items", items);

            itemListViewState = new ItemListViewState();

    }

    void setStateUpdateListener(UpdateListener listener) {

        this.listener = listener;
       // listener.onUpdate(itemListViewState);
    }

    public void makeApicall(){

          NetworkService networkService = new NetworkService();
          Call<OrdersResponse> orders =  networkService.api.fetchOrders();

          orders.enqueue(new Callback<OrdersResponse>() {
              @Override
              public void onResponse(Call<OrdersResponse> call, Response<OrdersResponse> response) {
                  Log.d("Orders","total orders"+response.body().toString());
              }

              @Override
              public void onFailure(Call<OrdersResponse> call, Throwable t) {
                  Log.d("Orders","failed"+t.getMessage());


              }
          });

        Call<OrderResponse> orderResponseCall = networkService.api.fetchOrderById(Long.valueOf(2));

        orderResponseCall.enqueue(new Callback<OrderResponse>() {
            @Override
            public void onResponse(Call<OrderResponse> call, Response<OrderResponse> response) {
                Log.d("Orders by id","total orders by id"+response.body().toString());
                 orderResponse = new OrderResponse(response.body().getItems());
                itemListViewState.setDeliveryItems(orderResponse.getItems());
                 listener.onUpdate(itemListViewState);

            }

            @Override
            public void onFailure(Call<OrderResponse> call, Throwable t) {
                listener.onFailure(new Exception(t.getMessage()));
            }
        });






    }


}
