package com.instacart.android.challenges.network;

import com.google.gson.annotations.SerializedName;

public class DeliveryItem {

    @SerializedName("id")
    private long id;
    @SerializedName("name")
    private String name;
    @SerializedName("imageUrl")
    private String imageUrl;
    @SerializedName("count")
    private int count;

    public DeliveryItem(long id, String name, String imageUrl, int count) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.count = count;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
