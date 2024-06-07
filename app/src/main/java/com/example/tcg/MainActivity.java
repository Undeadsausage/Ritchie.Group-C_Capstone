package com.example.tcg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button playerPlus1;
    Button playerMinus1;
    Button player2Plus1;
    Button player2Minus1;
    TextView Health1;
    TextView Health2;
    int count;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.health_tracker);

        playerPlus1 = findViewById(R.id.player1Plus);
        playerMinus1 = findViewById(R.id.player1Minus);
        player2Plus1 = findViewById(R.id.player2Plus);
        player2Minus1 = findViewById(R.id.player2Minus);
        Health1 = findViewById(R.id.Player1HP);
        Health2 = findViewById(R.id.Player2hp);
    }

    public void addHealth1() {
        playerPlus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                Health1.setText("Number id Adding"+count);


            }
        });
    }

    public void subHealth1() {
        playerMinus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                Health1.setText("number id Subtract"+count);
            }
        });
    }
    public void addhealth2() {
        player2Plus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                Health2.setText("number id Adding"+count);
            }
        });
    }
    public void subhealth2(){
        player2Minus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                Health2.setText("number id subtract"+count);
            }
        });
    }
}
