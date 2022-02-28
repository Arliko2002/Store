package com.example.store;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.store.JSONProduct.JsonProduct;
import com.example.store.adapter.CategoryAdapter;
import com.example.store.models.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/*ADAPTER NEEDS TO BE CHANGED*/
public class ItemByCategoryActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private static final String TAG = "MYLOGS";

    //private static int category_id=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_by_category);

        recyclerView=findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("https://fakestoreapi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        Log.v(TAG, "RETROFIT IS BUILD");

        JsonProduct jsonProduct=retrofit.create(JsonProduct.class);

        Call<List<Product>> call=jsonProduct.getProductJewelery();

        Log.v(TAG, "jewelry is assigned");

//        switch (category_id) {
//            case 1: call=jsonProduct.getProductJewelery();
//            case 2: call=jsonProduct.getProductElectronics();
//            case 3: call=jsonProduct.getProductMensClothing();
//            case 4: call=jsonProduct.getProductWomensClothing();
//            default:call=jsonProduct.getProductJewelery();
//        }

        call.enqueue(new Callback<List<Product>>() {
            @Override
            public void onResponse(Call<List<Product>> call, Response<List<Product>> response) {
                if(!response.isSuccessful()){
                    Toast.makeText(ItemByCategoryActivity.this,response.code(),Toast.LENGTH_SHORT).show();
                    return;
                }
                Log.v(TAG, String.valueOf(response.body()));
                List<Product> productList=response.body();
                CategoryAdapter categoryAdapter =new CategoryAdapter(ItemByCategoryActivity.this, productList);
                recyclerView.setAdapter(categoryAdapter);
                Log.v(TAG, "ADAPTER IS SET");

            }

            @Override
            public void onFailure(Call<List<Product>> call, Throwable t) {
                Toast.makeText(ItemByCategoryActivity.this,t.getMessage(),Toast.LENGTH_SHORT).show();

            }
        });
    }
//    public static void setCategory_id(int category_id) {
//        ItemByCategoryActivity.category_id = category_id;
//    }


}