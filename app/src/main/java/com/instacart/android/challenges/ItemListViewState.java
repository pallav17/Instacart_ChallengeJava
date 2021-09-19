package com.instacart.android.challenges;

import java.util.List;

public class ItemListViewState {
    List<ItemRow> items;
    String toolbarTitle;

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



    public ItemListViewState(String toolbarTitle, List<ItemRow> items) {
        this.toolbarTitle = toolbarTitle;
        this.items = items;
    }




}

