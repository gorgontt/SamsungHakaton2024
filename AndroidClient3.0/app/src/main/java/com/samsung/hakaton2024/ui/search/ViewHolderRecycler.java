package com.samsung.hakaton2024.ui.search;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.samsung.hakaton2024.R;

public class ViewHolderRecycler extends RecyclerView.ViewHolder {

    ImageView image;
    TextView background;
    public ViewHolderRecycler(@NonNull View itemView) {
        super(itemView);

        image = itemView.findViewById(R.id.imgV_recycler_search);
        background = itemView.findViewById(R.id.tv_recyclerV);

    }

}
