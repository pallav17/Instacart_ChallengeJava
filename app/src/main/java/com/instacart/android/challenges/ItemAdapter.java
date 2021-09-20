package com.instacart.android.challenges;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.google.android.material.textfield.TextInputEditText;
import com.instacart.android.challenges.network.DeliveryItem;
import com.instacart.android.challenges.network.OrderResponse;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

 List<DeliveryItem> items = new ArrayList<>();
    Context context;


    public void setItems(List<DeliveryItem> items) {
        this.items = items;
    }

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

        TextView itemName;
        ImageView imageView;
        public ViewHolder(View itemView) {
            super(itemView);
            itemName = (TextView)itemView.findViewById(R.id.itemName);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
        }

        public void bind(DeliveryItem item) {

            itemName.setText(item.getName());
            Glide.with(MainActivity.context).load(item.getImageUrl()).
                    diskCacheStrategy(DiskCacheStrategy.NONE).
                    skipMemoryCache(true).
                    apply(RequestOptions.centerCropTransform()).
                    into(imageView);


    }
        }


    public void update(List<DeliveryItem> newItems) {
        items.clear();
        items.addAll(newItems);
        notifyDataSetChanged();
    }


}
