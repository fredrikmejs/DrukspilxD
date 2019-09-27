package com.example.drukspil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

private Button button_swag, button_startGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_swag = findViewById(R.id.button_swag);
        button_swag.setOnClickListener(this);

        button_startGame = findViewById(R.id.button_drink);
        button_startGame.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v == button_swag){
            Intent myIntent = new Intent(v.getContext(), Regler_citater.class);
            startActivityForResult(myIntent, 0);

        }

        if (v == button_startGame){
            Intent myIntent = new Intent(v.getContext(), Regler_druk.class);
            startActivityForResult(myIntent, 0);

        }
    }
}