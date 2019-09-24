package com.example.drukspil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

private Button button_swag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_swag = findViewById(R.id.button_swag);
        button_swag.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v == button_swag){
            Intent myIntent = new Intent(v.getContext(), regler.class);
            startActivityForResult(myIntent, 0);

        }

    }
}
