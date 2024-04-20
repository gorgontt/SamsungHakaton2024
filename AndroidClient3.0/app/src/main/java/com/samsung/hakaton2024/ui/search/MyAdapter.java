package com.samsung.hakaton2024.ui.search;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.samsung.hakaton2024.R;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<ViewHolderCustomDialog> {

    Context context;
    List<Item> items;

    public MyAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolderCustomDialog onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolderCustomDialog(LayoutInflater.from(context).inflate(R.layout.item_of_custom_dialog, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderCustomDialog holder, int position) {

        holder.text.setText(items.get(position).getGenre());
        holder.img.setImageResource(items.get(position).getImg());
    }

    @Override
    public int getItemCount() {

        return items.size();
    }
}
