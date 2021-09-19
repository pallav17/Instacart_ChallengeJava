package com.instacart.android.challenges;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    ArrayList<ItemRow> items = new ArrayList<>();


    @NotNull
    @Override
    public ItemAdapter.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull @NotNull ItemAdapter.ViewHolder holder, int position) {
        holder.bind(items.get(position));


    }

    @Override
    public int getItemCount() {

        return items.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        public ViewHolder(View itemView) {
            super(itemView);
        }

        public void bind(ItemRow row) {
        }
    }

    public void update(List<ItemRow> newItems) {
        items.clear();
        items.addAll(newItems);
        notifyDataSetChanged();
    }


}
