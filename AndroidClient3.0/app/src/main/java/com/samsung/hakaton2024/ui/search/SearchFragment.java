package com.samsung.hakaton2024.ui.search;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.samsung.hakaton2024.R;
import com.samsung.hakaton2024.databinding.FragmentSearchBinding;

import java.util.ArrayList;
import java.util.List;

public class SearchFragment extends Fragment {

    private FragmentSearchBinding binding;
    private List<Item> itemList;
    private List<Item> itemListRecycler;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        SearchViewModel searchViewModel = new ViewModelProvider(this).get(SearchViewModel.class);

        binding = FragmentSearchBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.imgFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFilterDialog();
            }
        });

        itemList = new ArrayList<>();
        // Добавьте элементы в список itemList
        itemList.add(new Item("hghghgghgg", R.drawable.like));
        itemList.add(new Item("hghghgghgg", R.drawable.like));
        itemList.add(new Item("hghghgghgg", R.drawable.like));
        itemList.add(new Item("hghghgghgg", R.drawable.like));
        itemList.add(new Item("hghghgghgg", R.drawable.like));
        itemList.add(new Item("hghghgghgg", R.drawable.like));
        itemList.add(new Item("hghghgghgg", R.drawable.like));
        itemList.add(new Item("hghghgghgg", R.drawable.like));
        itemList.add(new Item("hghghgghgg", R.drawable.like));
        itemList.add(new Item("hghghgghgg", R.drawable.like));
        itemList.add(new Item("hghghgghgg", R.drawable.like));

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());

        View inflatedView = getLayoutInflater().inflate(R.layout.custom_dialog, null);
        RecyclerView recycler = (RecyclerView) inflatedView.findViewById(R.id.rv_customD);

        recycler.setLayoutManager(layoutManager);
        MyAdapter myAdapter = new MyAdapter(getContext(), itemList);
        recycler.setAdapter(myAdapter);

        itemListRecycler = new ArrayList<>();
        itemListRecycler.add(new Item("hgh", R.drawable.non_like));
        itemListRecycler.add(new Item("hghgh", R.drawable.non_like));
        itemListRecycler.add(new Item("22222", R.drawable.non_like));


        LinearLayoutManager layoutManager2 = new LinearLayoutManager(getContext());

        binding.rvSearchFrag.setLayoutManager(layoutManager2);
        MyAdapter myAdapter2 = new MyAdapter(getContext(), itemListRecycler);
        binding.rvSearchFrag.setAdapter(myAdapter2);
    }

    private void showFilterDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle("Выберите жанр");
        View dialogView = LayoutInflater.from(getContext()).inflate(R.layout.custom_dialog, null);
        builder.setView(dialogView);

        RecyclerView recyclerView = dialogView.findViewById(R.id.rv_customD);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        MyAdapter myAdapter = new MyAdapter(getContext(), itemList);
        recyclerView.setAdapter(myAdapter);

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        builder.create().show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
