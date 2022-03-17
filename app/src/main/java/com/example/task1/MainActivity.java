package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity /*implements View.OnClickListener*/ {
    private Button black,green,red,yellow,purple,pink,blue,orange;
    private String button="",color="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initial();
        black.setOnClickListener(View->{
            button="Black";
            color="#000000";
            activity();
        });
        green.setOnClickListener(View->{
            button="Green";
            color="#00FF00";
            activity();
        });
        red.setOnClickListener(View->{
            button="Red";
            color="#FF0000";
            activity();
        });
        yellow.setOnClickListener(View->{
            button="Yellow";
            color="#FFFF00";
            activity();
        });
        purple.setOnClickListener(View->{
            button="Purple";
            color="#A020F0";
            activity();
        });
        pink.setOnClickListener(View->{
            button="Pink";
            color="#FFC0CB";
            activity();
        });
        blue.setOnClickListener(View->{
            button="Blue";
            color="#0000FF";
            activity();
        });
        orange.setOnClickListener(View->{
            button="Orange";
            color="#FFA500";
            activity();
        });
    }

    private void initial() {
        black=findViewById(R.id.Black);
        green=findViewById(R.id.Green);
        red=findViewById(R.id.Red);
        yellow=findViewById(R.id.Yellow);
        purple=findViewById(R.id.Purple);
        pink=findViewById(R.id.Pink);
        blue=findViewById(R.id.Blue);
        orange=findViewById(R.id.Orange);
    }

    private void activity() {
        Intent intent = new Intent(MainActivity.this,Display.class);
        intent.putExtra("ButtonText",button);
        intent.putExtra("ColorCode",color);
        startActivity(intent);
    }
}