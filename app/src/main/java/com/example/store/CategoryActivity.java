package com.example.store;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CategoryActivity extends AppCompatActivity {

    CardView jewellery, electronics,mensClothing,womensClothing;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        jewellery=findViewById(R.id.jewellery);
        electronics=findViewById(R.id.electronics);
        mensClothing=findViewById(R.id.mensClothing);
        womensClothing=findViewById(R.id.womensClothing);

        jewellery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CategoryActivity.this,ItemByCategoryActivity.class));
                ItemByCategoryActivity.setCategory_id(1);
            }
        });

        electronics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CategoryActivity.this,ItemByCategoryActivity.class));
                ItemByCategoryActivity.setCategory_id(2);
            }
        });
        mensClothing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CategoryActivity.this,ItemByCategoryActivity.class));
                ItemByCategoryActivity.setCategory_id(3);
            }
        });
        womensClothing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CategoryActivity.this,ItemByCategoryActivity.class));
                ItemByCategoryActivity.setCategory_id(4);
            }
        });

    }
    //


}