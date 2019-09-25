package com.example.drukspil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Regler_druk extends AppCompatActivity implements View.OnClickListener {
Button button_startGame;
TextView tekst_regler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regler_druk);

        button_startGame = findViewById(R.id.button_playDruk);
        button_startGame.setOnClickListener(this);

        tekst_regler = findViewById(R.id.tekst_regler1);
        tekst_regler.setText("1. Altid have noget drikke" +
                "\n2. konsekvensen skal tages!" +
                "\n3. Man skal angive sit navn" +
                "\n4. Du skal vælge mellem de to muligheder" +
                "\n5. Hvis udfordingen ikke gennemføres skal der bundes"+
                "\n6. Tryk spil når du har læst og forstået reglerne");



    }

    @Override
    public void onClick(View view) {

        if (view == button_startGame){
            Intent myIntent = new Intent(view.getContext(), Drunk_game.class);
            startActivityForResult(myIntent, 0);
        }
    }
}
