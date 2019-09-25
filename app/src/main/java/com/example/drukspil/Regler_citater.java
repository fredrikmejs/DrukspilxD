package com.example.drukspil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Regler_citater extends AppCompatActivity implements View.OnClickListener {
private Button button_play;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regler);

        button_play = findViewById(R.id.button_playDruk);
        button_play.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v == button_play){
            Intent myIntent = new Intent(v.getContext(), Swag_game.class);
            startActivityForResult(myIntent, 0);
        }
    }
}
