package com.example.store;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.store.JSON.JSONPlaceholder;
import com.example.store.adapter.CategoryAdapter;
import com.example.store.models.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ItemsActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.items);

        recyclerView=findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        JSONPlaceholder jsonPlaceholder=retrofit.create(JSONPlaceholder.class);
        Call<List<Product>> call=jsonPlaceholder.getProduct();
       call.enqueue(new Callback<List<Product>>() {
           @Override
           public void onResponse(Call<List<Product>> call, Response<List<Product>> response) {
              if(!response.isSuccessful()){
                  Toast.makeText(ItemsActivity.this,response.code(),Toast.LENGTH_SHORT).show();
                 return;
              }
              List<Product> productList=response.body();
              CategoryAdapter categoryAdapter =new CategoryAdapter(ItemsActivity.this, productList);
              recyclerView.setAdapter(categoryAdapter);
           }

           @Override
           public void onFailure(Call<List<Product>> call, Throwable t) {
               Toast.makeText(ItemsActivity.this,t.getMessage(),Toast.LENGTH_SHORT).show();

           }
       });
    }
}//