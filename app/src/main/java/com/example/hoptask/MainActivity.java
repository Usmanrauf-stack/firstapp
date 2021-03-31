package com.example.hoptask;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textiew;
    ImageView minus, plus1;
    Button red, green, blue, pink;
    float add;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textiew = findViewById(R.id.textview);
        minus = findViewById(R.id.minus);
        plus1 = findViewById(R.id.plus1);
        red = findViewById(R.id.red);
        green = findViewById(R.id.green);
        blue = findViewById(R.id.blue);
        pink = findViewById(R.id.pink);
        red.setOnClickListener(this);
        green.setOnClickListener(this);
        blue.setOnClickListener(this);
        pink.setOnClickListener(this);
        minus.setOnClickListener(this);
        plus1.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.red:
                textiew.setTextColor(getColor(R.color.red));
                break;

            case R.id.green:
                textiew.setTextColor(getColor(R.color.green));
                break;
            case R.id.blue:
                textiew.setTextColor(getColor(R.color.blue));
                break;
            case R.id.pink:
                textiew.setTextColor(getColor(R.color.pink));
                break;
            case R.id.minus:
                if(add==0)
                {
                    Toast.makeText(this, "We are at zero", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    add = add - 3;
                    textiew.setTextSize(add);
                }

                break;
            case R.id.plus1:
                add = add + 3;
                textiew.setTextSize(add);
                break;
        }
    }
}