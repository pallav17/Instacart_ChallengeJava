package com.instacart.android.challenges;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private RecyclerView recyclerView;
    private ItemAdapter itemAdapter;
    private MainActivityViewModel viewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
        viewModel = new MainActivityViewModel();

        viewModel.setStateUpdateListener(new MainActivityViewModel.UpdateListener() {
            @Override
            public void onUpdate(ItemListViewState state) {

            }
        });
    }

    private void bindViews() {

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        itemAdapter = new ItemAdapter();

        recyclerView.setAdapter(itemAdapter);
    }
}


