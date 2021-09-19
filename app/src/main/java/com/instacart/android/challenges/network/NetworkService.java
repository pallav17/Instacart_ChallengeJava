package com.instacart.android.challenges.network;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkService {

    private Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://boiling-dusk-12902.herokuapp.com/")
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public NetworkApi api = retrofit.create(NetworkApi.class);
}
