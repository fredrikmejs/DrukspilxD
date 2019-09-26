package com.example.drukspil;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class drunk_game2 extends AppCompatActivity implements View.OnClickListener {
    Drunk_game drukspil = new Drunk_game();
    ArrayList<String> namesArr = drukspil.nameArr();

    Button button_yes, button_no, button_challange, button_konsekvens, button_nextplayer;
    TextView textView_overskrift, textView_konsekvens_udfordring, textView_completed;
    int spiller = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drunk_game2);

        button_challange = findViewById(R.id.button_challange);
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



    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {


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
                    udfordringer().get(terningUdfordring()));
            textView_konsekvens_udfordring.setVisibility(View.VISIBLE);
            button_nextplayer.setVisibility(View.VISIBLE);
        }

        if (v == button_konsekvens) {

            textView_konsekvens_udfordring.setText("Din konsekvens: " +
                    konsekvenser().get(terningKonsekvens()));
            button_nextplayer.setVisibility(View.VISIBLE);

        }


        if (v == button_nextplayer || v == button_yes) {
            if (spiller == namesArr.size() - 1) {
                spiller = 0;
            } else {
                spiller++;
            }
            textView_overskrift.setText(namesArr.get(spiller) + " tur vælg konsekvens eller udfordring");
            button_challange.setVisibility(View.VISIBLE);
            button_konsekvens.setVisibility(View.VISIBLE);
        }
    }

    private int terningUdfordring(){

        int terning = (int) (Math.random()*udfordringer().size());

        return terning-1;
    }

    private int terningKonsekvens(){

        int terning = (int) (Math.random()*konsekvenser().size());

        return terning-1;
    }


    private ArrayList<String>udfordringer(){
        ArrayList<String> arr = new ArrayList<>();

        arr.add(0,"Find på et 'jeg har aldrig spørgsmål',\nhvor mindst 3 drikker.");
        arr.add(1, "fordel 4 tåre");

        return arr;
    }

    private ArrayList<String>konsekvenser(){
        ArrayList<String>arr = new ArrayList<>();

        arr.add(0,"På munden");
        arr.add(1,"En bunder");
        arr.add(2,"Et shot");
        arr.add(3,"En tår");
        arr.add(4,"Del en bunder med en");
        arr.add(5, "tag 2 shots");
        arr.add(6,"Tag et shot og \nlæg på dig på gulvet");
        arr.add(7,"Bund en øl");
        arr.add(8,"Drik en mejs blandingsforhold drik");
        arr.add(10, "Et heart attack\n(ølbong med 2 øl)");
        arr.add(11, "Giv en drink i byens");
        arr.add(12,"start et fællesskål");
        arr.add(13, "tag en ølbong");
        return arr;
    }
}





