package com.example.store;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.libraries.places.api.Places;

public class PlaceActivity extends AppCompatActivity {

    EditText editText;
    TextView textView1,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place);

        editText=findViewById(R.id.edit_text);
        textView1=findViewById(R.id.text_view1);
        textView2=findViewById(R.id.text_view2);

        Places.initialize(getApplicationContext(),"");


    }
}