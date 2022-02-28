package com.example.store.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.store.HomeActivity;
import com.example.store.ItemByCategoryActivity;
import com.example.store.R;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {
    CardView jewellery, electronics, mensClothing, womensClothing;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        jewellery = getView().findViewById(R.id.jewellery);
        Log.v("my logs", String.valueOf(jewellery));

        electronics = getView().findViewById(R.id.electronics);
        mensClothing = getView().findViewById(R.id.mensClothing);
        womensClothing = getView().findViewById(R.id.womensClothing);

        jewellery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), ItemByCategoryActivity.class));
                ItemByCategoryActivity.setCategory_id(1);
                Log.v("My logs","ItemByCategory Started");
            }
        });

        electronics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), ItemByCategoryActivity.class));
                ItemByCategoryActivity.setCategory_id(2);
            }
        });

        mensClothing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),ItemByCategoryActivity.class));
                ItemByCategoryActivity.setCategory_id(3);
            }
        });
        womensClothing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),ItemByCategoryActivity.class));
                ItemByCategoryActivity.setCategory_id(4);
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View myView = inflater.inflate(R.layout.fragment_home, container, false);
        return myView;
    }
    //
}