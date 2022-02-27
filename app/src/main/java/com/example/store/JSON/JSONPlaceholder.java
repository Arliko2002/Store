package com.example.store.JSON;


import com.example.store.models.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JSONPlaceholder {

    @GET("posts")
    Call<List<Product>> getProduct();
}
