package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class sensor_gerak extends AppCompatActivity {

    Toolbar toolbar;
    boolean iscolor = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sensor_gerak);

        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference led2 = database.getReference("led/led2");
        DatabaseReference led3 = database.getReference("led/led3");
        DatabaseReference led4 = database.getReference("led/led4");
        DatabaseReference led5 = database.getReference("led/led5");


        Button on5 = (Button) findViewById(R.id.on5);
        Button off5 = (Button) findViewById(R.id.off5);
        Button on2 = (Button) findViewById(R.id.on2);
        Button off2 = (Button) findViewById(R.id.off2);
        Button on3 = (Button) findViewById(R.id.on3);
        Button off3 = (Button) findViewById(R.id.off3);
        Button on4 = (Button) findViewById(R.id.on4);
        Button off4 = (Button) findViewById(R.id.off4);

        on5.setOnClickListener(view -> {
            led2.setValue(1);
            if (iscolor) {
                on5.setBackgroundColor(Color.parseColor("#a0b976"));
                off5.setBackgroundColor(Color.parseColor("#75ba95"));
                iscolor = true;
            } else {
                on5.setBackgroundColor(Color.parseColor("#75ba95"));
                off5.setBackgroundColor(Color.parseColor("#a0b976"));
                iscolor = false;
            }

        });

        off5.setOnClickListener(view -> {
            led2.setValue(0);
            if (iscolor) {
                on5.setBackgroundColor(Color.parseColor("#75ba95"));
                off5.setBackgroundColor(Color.parseColor("#a0b976"));
                iscolor = true;
            } else {
                on5.setBackgroundColor(Color.parseColor("#a0b976"));
                off5.setBackgroundColor(Color.parseColor("#75ba95"));
                iscolor = false;
            }

        });

        on2.setOnClickListener(view -> {
            led3.setValue(1);
            if (iscolor) {
                on2.setBackgroundColor(Color.parseColor("#a0b976"));
                off2.setBackgroundColor(Color.parseColor("#75ba95"));
                iscolor = true;
            } else {
                on2.setBackgroundColor(Color.parseColor("#75ba95"));
                off2.setBackgroundColor(Color.parseColor("#a0b976"));
                iscolor = false;
            }

        });

        off2.setOnClickListener(view -> {
            led3.setValue(0);
            if (iscolor) {
                on2.setBackgroundColor(Color.parseColor("#75ba95"));
                off2.setBackgroundColor(Color.parseColor("#a0b976"));
                iscolor = true;
            } else {
                on2.setBackgroundColor(Color.parseColor("#a0b976"));
                off2.setBackgroundColor(Color.parseColor("#75ba95"));
                iscolor = false;
            }

        });

        on3.setOnClickListener(view -> {
            led4.setValue(1);
            if (iscolor) {
                on3.setBackgroundColor(Color.parseColor("#a0b976"));
                off3.setBackgroundColor(Color.parseColor("#75ba95"));
                iscolor = true;
            } else {
                on3.setBackgroundColor(Color.parseColor("#75ba95"));
                off3.setBackgroundColor(Color.parseColor("#a0b976"));
                iscolor = false;
            }

        });

        off3.setOnClickListener(view -> {
            led4.setValue(0);
            if (iscolor) {
                on3.setBackgroundColor(Color.parseColor("#75ba95"));
                off3.setBackgroundColor(Color.parseColor("#a0b976"));
                iscolor = true;
            } else {
                on3.setBackgroundColor(Color.parseColor("#a0b976"));
                off3.setBackgroundColor(Color.parseColor("#75ba95"));
                iscolor = false;
            }

        });

        on4.setOnClickListener(view -> {
            led5.setValue(1);
            if (iscolor) {
                on4.setBackgroundColor(Color.parseColor("#a0b976"));
                off4.setBackgroundColor(Color.parseColor("#75ba95"));
                iscolor = true;
            } else {
                on4.setBackgroundColor(Color.parseColor("#75ba95"));
                off4.setBackgroundColor(Color.parseColor("#a0b976"));
                iscolor = false;
            }

        });

        off4.setOnClickListener(view -> {
            led5.setValue(0);
            if (iscolor) {
                on4.setBackgroundColor(Color.parseColor("#75ba95"));
                off4.setBackgroundColor(Color.parseColor("#a0b976"));
                iscolor = true;
            } else {
                on4.setBackgroundColor(Color.parseColor("#a0b976"));
                off4.setBackgroundColor(Color.parseColor("#75ba95"));
                iscolor = false;
            }

        });
    }

    public void previous(View view) {
    }
}
