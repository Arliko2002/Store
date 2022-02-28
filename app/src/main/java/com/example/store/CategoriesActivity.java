//package com.example.store;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.ImageView;
//
//public class CategoriesActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.item_rv_category_page);
//
//        ImageView jewellery,electronics,mensClothing,womensClothing;
//
//        jewellery=findViewById(R.id.arrow_jewelry);
//       electronics=findViewById(R.id.arrow_electronic);
//        mensClothing=findViewById(R.id.arrow_manClothing);
//        womensClothing=findViewById(R.id.arrow_womenClothing);
//
//
//        jewellery.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(CategoriesActivity.this,ItemByCategoryActivity.class));
//                ItemByCategoryActivity.setCategory_id(1);
//            }
//        });
//
//        electronics.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(CategoriesActivity.this,ItemByCategoryActivity.class));
//                ItemByCategoryActivity.setCategory_id(2);
//            }
//        });
//        mensClothing.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(CategoriesActivity.this,ItemByCategoryActivity.class));
//                ItemByCategoryActivity.setCategory_id(3);
//            }
//        });
//        womensClothing.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(CategoriesActivity.this,ItemByCategoryActivity.class));
//                ItemByCategoryActivity.setCategory_id(4);
//            }
//        });
//    }
//}