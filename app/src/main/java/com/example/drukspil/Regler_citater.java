package com.example.drukspil;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Regler_citater extends AppCompatActivity implements View.OnClickListener {
private Button button_play, button_back;
private TextView tekst_regler;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regler);

        button_play = findViewById(R.id.button_playDruk);
        button_play.setOnClickListener(this);

        button_back = findViewById(R.id.button_back2);
        button_back.setOnClickListener(this);

        tekst_regler = findViewById(R.id.tekst_regler1);
        tekst_regler.setText("1. Altid have noget drikke" +
                "\n2. konsekvensen skal tages!" +
                "\n3. Svaret skal siges højt" +
                "\n4. Tryk spil når du har læst og forstået reglerne" +
                "\n5. Nogle konsekvenser gælder ikke folk med kærester, \nde skal derfor tage en bunder.");
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
