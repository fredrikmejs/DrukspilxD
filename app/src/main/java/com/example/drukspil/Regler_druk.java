package com.example.drukspil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Regler_druk extends AppCompatActivity implements View.OnClickListener {
Button button_startGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regler_druk);

        button_startGame = findViewById(R.id.button_playDruk);
        button_startGame.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if (view == button_startGame){
            Intent myIntent = new Intent(view.getContext(), Drunk_game.class);
            startActivityForResult(myIntent, 0);
        }
    }
}
