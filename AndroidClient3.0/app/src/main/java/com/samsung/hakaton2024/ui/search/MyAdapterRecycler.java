package com.samsung.hakaton2024.ui.search;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.samsung.hakaton2024.R;

import java.util.List;

public class MyAdapterRecycler extends RecyclerView.Adapter<ViewHolderRecycler> {

    Context context;
    List<ItemRecycler> itemsRecycler;

    public MyAdapterRecycler(Context context, List<Item> items) {
        this.context = context;
        this.itemsRecycler = itemsRecycler;
    }

    @NonNull
    @Override
    public ViewHolderRecycler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolderRecycler(LayoutInflater.from(context).inflate(R.layout.items_of_adapter_searchfrag, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderRecycler holder, int position) {
        holder.background.setText(itemsRecycler.get(position).getBackground());
        holder.image.setImageResource(itemsRecycler.get(position).getImage());
    }

    @Override
    public int getItemCount() {

        return itemsRecycler.size();
    }
}
