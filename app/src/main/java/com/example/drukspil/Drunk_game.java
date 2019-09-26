package com.example.drukspil;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Drunk_game extends AppCompatActivity implements View.OnClickListener {
    private List<String> arrKonsekvens = new ArrayList<>();
    private ArrayList<String> arrUdfordringer = new ArrayList<>();
    private Button button_yes, button_no, button_challange, button_konsekvens, button_nextplayer, button_back;
    private TextView textView_overskrift, textView_konsekvens_udfordring, textView_completed;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drunk_game);

        konsekvenser();
        udfordringer();

        button_back = findViewById(R.id.button_back);
        button_back.setOnClickListener(this);

        button_challange = findViewById(R.id.button_challange1);
        button_challange.setOnClickListener(this);


        button_nextplayer = findViewById(R.id.button__nextPlayer);
        button_nextplayer.setOnClickListener(this);
        button_nextplayer.setVisibility(View.INVISIBLE);


        button_konsekvens = findViewById(R.id.button_konsekvens);
        button_konsekvens.setOnClickListener(this);


        button_no = findViewById(R.id.button_no);
        button_no.setOnClickListener(this);
        button_no.setVisibility(View.INVISIBLE);


        button_yes = findViewById(R.id.button_yes);
        button_yes.setOnClickListener(this);
        button_yes.setVisibility(View.INVISIBLE);

        textView_konsekvens_udfordring = findViewById(R.id.tekst_konsekvens_udfordring);
        textView_konsekvens_udfordring.setVisibility(View.INVISIBLE);

        textView_completed = findViewById(R.id.tekst_challange_completed);
        textView_completed.setVisibility(View.INVISIBLE);

        textView_overskrift = findViewById(R.id.tekst_overskrift2);

        textView_overskrift.setText("Vælg mellem konsekvens eller udfordring");



    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {

        if (v == button_back){
            Intent intent = new Intent();
            setResult(RESULT_OK, intent);
            finish();
        }

        if (v == button_no) {
            textView_overskrift.setText("BUND DIN DRIK omgående");
            button_yes.setVisibility(View.INVISIBLE);
            button_nextplayer.setVisibility(View.VISIBLE);
        }


        if (v == button_challange) {
            textView_completed.setVisibility(View.VISIBLE);
            textView_completed.setText("Er udfordringen klaret?");
            button_yes.setVisibility(View.VISIBLE);
            button_no.setVisibility(View.VISIBLE);
            button_konsekvens.setVisibility(View.INVISIBLE);
            button_challange.setVisibility(View.INVISIBLE);
            textView_konsekvens_udfordring.setText("Din udfordring: " +
                    arrUdfordringer.get(terningUdfordring()));
            textView_konsekvens_udfordring.setVisibility(View.VISIBLE);
            button_nextplayer.setVisibility(View.VISIBLE);
        }

        if (v == button_konsekvens) {
            textView_konsekvens_udfordring.setText("Din konsekvens: " +
                    arrKonsekvens.get(terningKonsekvens()));
            button_nextplayer.setVisibility(View.VISIBLE);

        }


        if (v == button_nextplayer || v == button_yes) {
            textView_overskrift.setText("Vælg mellem konsekvens eller udfordring");
            button_challange.setVisibility(View.VISIBLE);
            button_konsekvens.setVisibility(View.VISIBLE);
            button_yes.setVisibility(View.INVISIBLE);
            button_no.setVisibility(View.INVISIBLE);
            button_nextplayer.setVisibility(View.INVISIBLE);

        }
    }

    private int terningUdfordring(){

        int terning = (int) (Math.random()*arrUdfordringer.size());

        return terning;
    }

    private int terningKonsekvens(){

        int terning = (int) (Math.random()*arrKonsekvens.size());

        return terning;
    }


    private ArrayList<String>udfordringer(){

        arrUdfordringer.add(0,"Find på et 'jeg har aldrig spørgsmål',\nhvor mindst 3 drikker.");
        arrUdfordringer.add(1, "Fordel 4 tåre ud");

        return arrUdfordringer;
    }


    private List<String> konsekvenser(){
        arrKonsekvens.add(0,"På munden");
        arrKonsekvens.add(1,"En bunder");
        arrKonsekvens.add(2,"Et shot");
        arrKonsekvens.add(3,"En tår");
        arrKonsekvens.add(4,"Del en bunder med en");
        arrKonsekvens.add(5, "Tag 2 shots");
        arrKonsekvens.add(6,"Tag et shot og \nlæg på dig på gulvet");
        arrKonsekvens.add(7,"Bund en øl");
        arrKonsekvens.add(8,"Drik en mejs blandingsforhold drik");
        arrKonsekvens.add(9, "Et heart attack\n(ølbong med 2 øl)");
        arrKonsekvens.add(10, "Giv en drink i byens");
        arrKonsekvens.add(11,"Start et fællesskål");
        arrKonsekvens.add(12, "Tag en ølbong");

        return arrKonsekvens;
    }
}





