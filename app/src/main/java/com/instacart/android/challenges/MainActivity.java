package com.instacart.android.challenges;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.instacart.android.challenges.network.OrderResponse;

public class MainActivity extends AppCompatActivity {

    private OrderResponse orderResponse;
    private Toolbar toolbar;
    private RecyclerView recyclerView;
    private ItemAdapter itemAdapter;
    private MainActivityViewModel viewModel;
    public  static Context context;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        itemAdapter = new ItemAdapter();
        context = getApplicationContext();

        bindViews();


        viewModel = new MainActivityViewModel();
        viewModel.makeApicall();

        viewModel.setStateUpdateListener(new MainActivityViewModel.UpdateListener() {
            @Override
            public void onUpdate(ItemListViewState state) {

               /* if(orderResponse.getItems().size() >0){
                itemAdapter.setItems(orderResponse.getItems()); }
            }*/

                itemAdapter.update(state.getDeliveryItems());

            }

            @Override
            public void onFailure(Exception e) {

                Log.d("Failure","Log");
            }
        });

    }


    private void bindViews() {

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(itemAdapter);

    }
}


