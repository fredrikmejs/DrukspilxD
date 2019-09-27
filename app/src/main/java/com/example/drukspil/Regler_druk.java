package com.example.drukspil;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Regler_druk extends AppCompatActivity implements View.OnClickListener {
private Button button_startGame, button_back;
private TextView tekst_regler;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regler_druk);

        button_startGame = findViewById(R.id.button_playDruk);
        button_startGame.setOnClickListener(this);

        tekst_regler = findViewById(R.id.tekst_regler1);
        tekst_regler.setText("1. Altid have noget drikke" +
                "\n2. konsekvensen skal tages!" +
                "\n3. Du skal vælge mellem de to muligheder" +
                "\n4. Hvis udfordingen ikke gennemføres skal der bundes"+
                "\n5. Tryk spil når du har læst og forstået reglerne");

        button_back = findViewById(R.id.button_back1);
        button_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view == button_back){
            Intent intent = new Intent();
            setResult(RESULT_OK, intent);
            finish();
        }
        if (view == button_startGame){
            Intent myIntent = new Intent(view.getContext(), Drunk_game.class);
            startActivityForResult(myIntent, 0);
        }
    }
}
