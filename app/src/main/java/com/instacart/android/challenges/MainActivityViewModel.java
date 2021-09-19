package com.instacart.android.challenges;
import java.util.ArrayList;
import java.util.List;

public class MainActivityViewModel {
    public interface UpdateListener {

        public void onUpdate(ItemListViewState state);
    }

    ItemListViewState itemListViewState;
    UpdateListener listener;

      public MainActivityViewModel() {

        List<ItemRow> items = new ArrayList<>();
        items.add(new ItemRow("Cabbage"));
        items.add(new ItemRow("Apple"));
        items.add(new ItemRow("Bread"));
        itemListViewState = new ItemListViewState("Delivery Items", items);

    }

    void setStateUpdateListener(UpdateListener listener) {

        this.listener = listener;
        listener.onUpdate(itemListViewState);
    }


}
