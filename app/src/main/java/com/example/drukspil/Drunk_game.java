package com.example.drukspil;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class Drunk_game extends AppCompatActivity implements View.OnClickListener {
ArrayList<String> namesArr = new ArrayList<>();
Button button_yes, button_no, button_add, button_challange, button_konsekvens, button_start, button_nextplayer;
TextView textView_overskrift, textView_konsekvens_udfordring, textView_completed;
EditText editText_addNames;
int spiller = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drunk_game);

        button_add = findViewById(R.id.button_add);
        button_add.setOnClickListener(this);

        button_challange = findViewById(R.id.button_challange);
        button_challange.setOnClickListener(this);
        button_challange.setVisibility(View.INVISIBLE);

        button_nextplayer = findViewById(R.id.button__nextPlayer);
        button_nextplayer.setOnClickListener(this);
        button_nextplayer.setVisibility(View.INVISIBLE);

        button_konsekvens = findViewById(R.id.button_konsekvens);
        button_konsekvens.setOnClickListener(this);
        button_konsekvens.setVisibility(View.INVISIBLE);

        button_no = findViewById(R.id.button_no);
        button_no.setOnClickListener(this);
        button_no.setVisibility(View.INVISIBLE);

        button_start = findViewById(R.id.button_start);
        button_start.setOnClickListener(this);

        button_yes = findViewById(R.id.button_yes);
        button_yes.setOnClickListener(this);
        button_yes.setVisibility(View.INVISIBLE);

        textView_konsekvens_udfordring = findViewById(R.id.tekst_konsekvens_udfordring);
        textView_konsekvens_udfordring.setVisibility(View.INVISIBLE);

        textView_completed = findViewById(R.id.tekst_challange_completed);
        textView_completed.setVisibility(View.INVISIBLE);

        textView_overskrift = findViewById(R.id.tekst_overskrift);
        textView_overskrift.setVisibility(View.INVISIBLE);

        editText_addNames = findViewById(R.id.edittext_addnames);

    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {

        if (v == button_no){
            textView_overskrift.setText("BUND DIN DRIK omgående");
            button_yes.setVisibility(View.INVISIBLE);

        }

        if (v == button_add){
            String name = editText_addNames.getText().toString();
            namesArr.add(name);
        }

        if (v == button_challange){
            textView_completed.setVisibility(View.VISIBLE);
            button_yes.setVisibility(View.VISIBLE);
            button_no.setVisibility(View.VISIBLE);
            textView_konsekvens_udfordring.setText("Din udfordring: "+
                    udfordringer().get(terningUdfordring()).toString());
        }

        if (v == button_konsekvens){
            textView_konsekvens_udfordring.setText("Din konsekvens: "+
                    konsekvenser().get(terningKonsekvens()).toString());
            button_nextplayer.setVisibility(View.VISIBLE);

        }

        if (v == button_start){
            textView_overskrift.setText(namesArr.get(spiller)+ " tur vælg konsekvens eller udfordring!");
            button_add.setVisibility(View.INVISIBLE);
            editText_addNames.setVisibility(View.INVISIBLE);
            button_konsekvens.setVisibility(View.VISIBLE);
            button_challange.setVisibility(View.VISIBLE);
        }

        if (v == button_nextplayer || v == button_yes){
            spiller++;
            textView_overskrift.setText(namesArr.get(spiller)+" tur vælg konsekvens eller udfordring");
            button_challange.setVisibility(View.VISIBLE);
            button_konsekvens.setVisibility(View.VISIBLE);

        }


    }

    private int terningUdfordring(){

        int terning = (int) (Math.random()*udfordringer().size());

        return terning;
    }

    private int terningKonsekvens(){

        int terning = (int) (Math.random()*konsekvenser().size());

        return terning;
    }


    private ArrayList<String>udfordringer(){
        ArrayList<String> arr = new ArrayList<>();

        arr.add(0,"Find på et jeg har aldrig spørgsmål,\nhvor mindst 3 drikker.");
        arr.add(1, "fordel 4 tåre");

        return arr;
    }

    private ArrayList<String>konsekvenser(){
        ArrayList<String>arr = new ArrayList<>();

        arr.add(0,"Bund dit glas");
        return arr;
    }
}
