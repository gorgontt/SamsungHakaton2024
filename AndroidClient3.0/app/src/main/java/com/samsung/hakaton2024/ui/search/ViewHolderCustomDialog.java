package com.samsung.hakaton2024.ui.search;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.samsung.hakaton2024.R;

public class ViewHolderCustomDialog extends RecyclerView.ViewHolder {

    ImageView img;
    TextView text;
    public ViewHolderCustomDialog(@NonNull View itemView) {
        super(itemView);

        img = itemView.findViewById(R.id.img_recycler_custd);
        text = itemView.findViewById(R.id.tv_items_custom_dialog);

    }
}
