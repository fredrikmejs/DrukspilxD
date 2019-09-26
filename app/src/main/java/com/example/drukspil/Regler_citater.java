package com.example.drukspil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Regler_citater extends AppCompatActivity implements View.OnClickListener {
private Button button_play, button_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regler);

        button_play = findViewById(R.id.button_playDruk);
        button_play.setOnClickListener(this);

        button_back = findViewById(R.id.button_back2);
        button_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v == button_back){
            Intent intent = new Intent();
            setResult(RESULT_OK, intent);
            finish();
        }

        if (v == button_play){
            Intent myIntent = new Intent(v.getContext(), Swag_game.class);
            startActivityForResult(myIntent, 0);
        }
    }
}
