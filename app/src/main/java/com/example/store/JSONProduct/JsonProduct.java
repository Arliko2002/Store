package com.example.store.JSONProduct;

import com.example.store.models.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonProduct {

    @GET("products/category/jewelery/")
    Call<List<Product>> getProductJewelery();

    @GET("products/category/electronics/")
    Call<List<Product>> getProductElectronics();

    @GET("products/category/men's clothing/")
    Call<List<Product>> getProductMensClothing();

    @GET("products/category/women's clothing/")
    Call<List<Product>> getProductWomensClothing();

    ///
}
