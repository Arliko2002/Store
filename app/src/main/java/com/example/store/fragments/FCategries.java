package com.example.store.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.store.ItemByCategoryActivity;
import com.example.store.R;


public class FCategries extends Fragment {

//    // TODO: Rename parameter arguments, choose names that match
//    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";
//
//    // TODO: Rename and change types of parameters
//    private String mParam1;
//    private String mParam2;
//
//    public FCategries() {
//        // Required empty public constructor
//    }
//
//    /**
//     * Use this factory method to create a new instance of
//     * this fragment using the provided parameters.
//     *
//     * @param param1 Parameter 1.
//     * @param param2 Parameter 2.
//     * @return A new instance of fragment FCategries.
//     */
//    // TODO: Rename and change types and number of parameters
//    public static FCategries newInstance(String param1, String param2) {
//        FCategries fragment = new FCategries();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
//        return fragment;
//    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

            CardView jewellery,electronics,mensClothing,womensClothing;


        jewellery = getView().findViewById(R.id.arrow_jewelry);
        Log.v("my logs", String.valueOf(jewellery));

        electronics = getView().findViewById(R.id.arrow_electronic);
        mensClothing = getView().findViewById(R.id.arrow_manClothing);
        womensClothing = getView().findViewById(R.id.arrow_womenClothing);

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








//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
//        CardView jewellery,electronics,mensClothing,womensClothing;
//
//        jewellery=getView().findViewById(R.id.arrow_jewelry);
//        electronics=getView().findViewById(R.id.arrow_electronic);
//        mensClothing=getView().findViewById(R.id.arrow_manClothing);
//        womensClothing=getView().findViewById(R.id.arrow_womenClothing);
//
//
//        jewellery.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(getActivity(), ItemByCategoryActivity.class));
//                ItemByCategoryActivity.setCategory_id(1);
//            }
//        });
//
//        electronics.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(getActivity(),ItemByCategoryActivity.class));
//                ItemByCategoryActivity.setCategory_id(2);
//            }
//        });
//        mensClothing.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(getActivity(),ItemByCategoryActivity.class));
//                ItemByCategoryActivity.setCategory_id(3);
//            }
//        });
//        womensClothing.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(getActivity(),ItemByCategoryActivity.class));
//                ItemByCategoryActivity.setCategory_id(4);
//            }
//        });
//    }
//
//
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.item_rv_category_page, container, false);
    }
}