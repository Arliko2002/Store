package com.example.store;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.w3c.dom.Text;

public class MenuLeftDrawerActivity extends AppCompatActivity {
    private TextView nameTextView;
    private TextView emailTextView;
    private FirebaseDatabase database;
    private DatabaseReference userRef;
    private static final String USER = "users";
    String email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_left_drawer);
        Intent intent = getIntent();
        email = intent.getStringExtra("email");

        nameTextView = findViewById(R.id.name);
        emailTextView = findViewById(R.id.email);

        database = FirebaseDatabase.getInstance();
        userRef = database.getReference(USER);

        userRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot ds: snapshot.getChildren()){
                    if(ds.child("email").getValue().equals(email)){
                        nameTextView.setText(ds.child("fullName").getValue(String.class));
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

}
