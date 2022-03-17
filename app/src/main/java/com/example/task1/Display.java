package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Display extends AppCompatActivity {
    private TextView display;
    private LinearLayout layout;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        initial();
        Intent intent= getIntent();
        String button=intent.getStringExtra("ButtonText");
        String color=intent.getStringExtra("ColorCode");
        display.setText("Color: "+button+"\nColor Code: "+color);
        layout.setBackgroundColor(Color.parseColor(color));
    }

    private void initial() {
        display=findViewById(R.id.Display);
        layout=findViewById(R.id.Layout);
    }
}