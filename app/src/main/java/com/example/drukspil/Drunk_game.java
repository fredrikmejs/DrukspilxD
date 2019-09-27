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

    private void udfordringer(){

        arrUdfordringer.add(0,"Find på et 'jeg har aldrig spørgsmål',\nhvor mindst 3 drikker.");
        arrUdfordringer.add(1, "Fordel 4 tåre ud");
        arrUdfordringer.add(2,"Tag en tår af drikken til højre for dig");
        arrUdfordringer.add(3,"Drik i arm med personen til venstre");
        arrUdfordringer.add(4,"Alle drenge tager to tåre");
        arrUdfordringer.add(5,"Alle piger tager en tår");
        arrUdfordringer.add(6, "Slå sten, saks, papir med personen til venstre,\ntaberen drikker");
        arrUdfordringer.add(7,"start et vandfald");
        arrUdfordringer.add(8,"Fortæl en joke, mindst 3 skal grine");
        arrUdfordringer.add(9,"Lav en regel");
        arrUdfordringer.add(10, "Man må kun drikke med venstre hånd");
        arrUdfordringer.add(11,"Vælg en kategori, taberen drikker");
        arrUdfordringer.add(12,"Sæt en sang på som alle kan lide (i que)");

    }

    private int terningTåre(){

        int tåre = (int) (Math.random() * 5);
        return tåre;
    }

    private void konsekvenser(){
        arrKonsekvens.add(0,"En bunder");
        arrKonsekvens.add(1,"Et shot");
        arrKonsekvens.add(2,"En tår");
        arrKonsekvens.add(3,"Del en bunder med en");
        arrKonsekvens.add(4, "Tag 2 shots");
        arrKonsekvens.add(5,"Tag et shot og \nlæg på dig på gulvet");
        arrKonsekvens.add(6,"Bund en øl");
        arrKonsekvens.add(7,"Drik en mejs blandingsforhold drik");
        arrKonsekvens.add(8, "Giv en drink i byens");
        arrKonsekvens.add(9,"Start et fællesskål");
        arrKonsekvens.add(10, "Drik"+terningTåre() + "tåre");
        arrKonsekvens.add(11, "Drik når personen ved siden af dig drikker");

    }
}