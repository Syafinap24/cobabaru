package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class home extends AppCompatActivity {

    private Object Intent;
    boolean iscolor = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference led1 = database.getReference("led/led1");


        Button on1 = findViewById(R.id.on1);
        Button off1 = findViewById(R.id.off1);

        on1.setOnClickListener(view -> {
            led1.setValue(1);
            if (iscolor) {
                on1.setBackgroundColor(Color.parseColor("#a0b976"));
                off1.setBackgroundColor(Color.parseColor("#75ba95"));
                iscolor = true;
            } else {
                on1.setBackgroundColor(Color.parseColor("#75ba95"));
                off1.setBackgroundColor(Color.parseColor("#a0b976"));
                iscolor = false;
            }

        });

        off1.setOnClickListener(view -> {
            led1.setValue(0);
            if (iscolor) {
                on1.setBackgroundColor(Color.parseColor("#75ba95"));
                off1.setBackgroundColor(Color.parseColor("#a0b976"));
                iscolor = true;
            } else {
                on1.setBackgroundColor(Color.parseColor("#a0b976"));
                off1.setBackgroundColor(Color.parseColor("#75ba95"));
                iscolor = false;
            }

        });
    }

    public void next(View view) {
        Intent intent = new Intent(home.this, sensor_gerak.class);
        startActivity(intent);
    }

    public void data(View view) {
    }
}