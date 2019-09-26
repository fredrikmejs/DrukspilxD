package com.example.drukspil;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Swag_game extends AppCompatActivity implements View.OnClickListener {
private Button button_begynd, button_next, button_svar, button_back;
private TextView tekst_svar, tekst_question, tekst_konsekvens;
ArrayList<String> halvArr = new ArrayList<>();
ArrayList<String> fuldArr = new ArrayList<>();
ArrayList<String> konsekvensArr = new ArrayList<>();
private int slag_spørgsmål = 0, slag_konsekvens = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swag_game);

        citaterfuld();
        citaterhalv();
        konsekvenser();

        button_back = findViewById(R.id.button_back3);
        button_back.setOnClickListener(this);

        button_begynd = findViewById(R.id.button_klar);
        button_begynd.setOnClickListener(this);


        button_next= findViewById(R.id.button_next);
        button_next.setOnClickListener(this);
        button_next.setVisibility(View.INVISIBLE);

        button_svar = findViewById(R.id.button_svar);
        button_svar.setOnClickListener(this);
        button_svar.setVisibility(View.INVISIBLE);

        tekst_konsekvens = findViewById(R.id.tekst_konsekvens);
        tekst_konsekvens.setVisibility(View.INVISIBLE);

        tekst_question = findViewById(R.id.tekst_spørgsmål);
        tekst_question.setVisibility(View.INVISIBLE);

        tekst_svar = findViewById(R.id.tekst_svar);
        tekst_svar.setVisibility(View.INVISIBLE);
    }


    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {


        if(v == button_begynd){
            button_begynd.setVisibility(View.INVISIBLE);
            slag_spørgsmål = terning();
            tekst_question.setText("Dit spørgsmål er: " + halvArr.get(slag_spørgsmål));
            tekst_question.setVisibility(View.VISIBLE);
            tekst_svar.setText("svaret er: "+fuldArr.get(slag_spørgsmål));
            button_svar.setVisibility(View.VISIBLE);
            button_next.setVisibility(View.VISIBLE);
            Log.d("knap", "onClick: trykket");
        }

        if (v == button_svar){
            button_svar.setVisibility(View.INVISIBLE);
            tekst_svar.setText("Svaret er: "+ fuldArr.get(slag_spørgsmål));
            tekst_svar.setVisibility(View.VISIBLE);
            slag_konsekvens = terningKonsekvens();
            tekst_konsekvens.setText("Din konsekvens er: " + konsekvensArr.get(slag_konsekvens));
            tekst_konsekvens.setVisibility(View.VISIBLE);
            Log.d("knap", "onClick: trykket");
        }
        if (v == button_next){
            tekst_svar.setVisibility(View.INVISIBLE);
            tekst_konsekvens.setVisibility(View.INVISIBLE);
            slag_spørgsmål = terning();
            tekst_question.setText("Dit spørgsmål er: "+ halvArr.get(slag_spørgsmål));
            tekst_svar.setText("Svaret er: " +fuldArr.get(slag_spørgsmål));
            button_svar.setVisibility(View.VISIBLE);

        if (v == button_back){
            Intent intent = new Intent();
            setResult(RESULT_OK, intent);
            finish();
        }
        }

    }

    private int terningKonsekvens(){
        int terning = (int) (Math.random()*konsekvensArr.size());
        return terning;
    }

    public int terning(){
        int terning = (int) (Math.random()*fuldArr.size());

        return terning;
    }

    public ArrayList<String> citaterfuld(){

        fuldArr.add(0,"BYENS");
        fuldArr.add(1,"BØV");
        fuldArr.add(2,"Fedtet Rotten");
        fuldArr.add(3,"DJ SWAG");
        fuldArr.add(4,"TYLLE SNART");
        fuldArr.add(5, "TYLLE");
        fuldArr.add(6, "HOMO");
        fuldArr.add(7,"En ristet med det hele");
        fuldArr.add(8,"UD i DAG? <3");
        fuldArr.add(9,"ROOMS");
        fuldArr.add(10,"STOP AFSKY");
        fuldArr.add(11, "Hånden er tilbage?");
        fuldArr.add(12, "No <3");
        fuldArr.add(13, "Nej <3 why (græde tudesmiley)");
        fuldArr.add(14, "Nope B <3");
        fuldArr.add(15, "The hands lærling edition");
        fuldArr.add(16, "I dag");
        fuldArr.add(17,"Aarbyens");
        fuldArr.add(18,"Fan luv");
        fuldArr.add(19, "Lunar way");
        fuldArr.add(20, "Hvor I <3");
        fuldArr.add(21, "THOT");
        fuldArr.add(22, "Løs, loose, løsning");
        fuldArr.add(23, "Sry jeg ikke tog den,\n er lige i gang med noget nu <3");
        fuldArr.add(24, "Hey mate <3 kan jeg ikke låne 130kr til i morgen,\n Skal have noget og har pengene igen i morgen <3");
        fuldArr.add(25, "Nice");
        fuldArr.add(26,"xD");
        fuldArr.add(27,"VS på PS");
        fuldArr.add(28,"Uha <3");
        fuldArr.add(29, "Tørst");
        fuldArr.add(30, "Nations");
        fuldArr.add(31, "Kæp i øret");
        fuldArr.add(32, "Have en skid på");
        fuldArr.add(33, "Indens");
        fuldArr.add(34, "Goodbye");
        fuldArr.add(35, "Bamse rundt");
        fuldArr.add(36, "Døj comback");
        fuldArr.add(37, "Hvad så DRENGEE");
        fuldArr.add(38, "Homework");
        fuldArr.add(39,"Maybe i should become a painter");
        fuldArr.add(40, "Surprise");
        fuldArr.add(41, "På munden");
        fuldArr.add(42, "Part 2");
        fuldArr.add(43, "Hyggeligt");
        fuldArr.add(44, "You know WHO er are");
        fuldArr.add(45, "Typisk");
        fuldArr.add(46, "Typisk Seriøst/Typisk Klassisk");
        fuldArr.add(47, "So the adventure begins");
        fuldArr.add(48, "Knap");
        fuldArr.add(49, "Giv mig 10 min <3");
        fuldArr.add(50, "Only Vodka");
        fuldArr.add(51, "I am done");
        fuldArr.add(52, "ye");
        fuldArr.add(53,"Hvide bukser");
        fuldArr.add(54, "Kviklån");
        fuldArr.add(55, "Ved ikke");
        fuldArr.add(56, "Holder mig til longs");
        fuldArr.add(57, "Hugh kan gå hjem");
        fuldArr.add(58,"Man down");
        fuldArr.add(59,"Fuld chauffør");

        return fuldArr;
    }
    public ArrayList<String> citaterhalv() {

        halvArr.add(0,"BYE__");
        halvArr.add(1,"BØ_");
        halvArr.add(2,"_____ Rotten");
        halvArr.add(3,"DJ ____");
        halvArr.add(4,"TYL__ ____");
        halvArr.add(5, "TY___");
        halvArr.add(6, "H___");
        halvArr.add(7,"Synonym for ROAST");
        halvArr.add(8,"__ i ___? <3");
        halvArr.add(9,"Stue");
        halvArr.add(10,"STOP _____");
        halvArr.add(11, "Hvad er tilbage?");
        halvArr.add(12, "__ <3");
        halvArr.add(13, "___ __ why ()");
        halvArr.add(14, "Nope _ __");
        halvArr.add(15, "Lærling");
        halvArr.add(16, "Hvornår?");
        halvArr.add(17,"___byens");
        halvArr.add(18,"___ luv");
        halvArr.add(19, "Skod bank");
        halvArr.add(20, "Hvor _ __");
        halvArr.add(21, "Trækker vejret");
        halvArr.add(22, "Må ikke kaldes en sm__");
        halvArr.add(23, "Er i gang med noget");
        halvArr.add(24, "130 kr");
        halvArr.add(25, "Klunker");
        halvArr.add(26,"x_");
        halvArr.add(27,"Hvor man finder VS");
        halvArr.add(28,"Når man skal på tørst");
        halvArr.add(29, "Tø___");
        halvArr.add(30, "Mange på et sted");
        halvArr.add(31, "Noget i øret");
        halvArr.add(32, "Skal være stiv");
        halvArr.add(33, "Før noget");
        halvArr.add(34, "Afsked");
        halvArr.add(35, "Bamse _____");
        halvArr.add(36, "Et stærkt comeback");
        halvArr.add(37, "Når man hilser på drengene");
        halvArr.add(38, "H__e__rk");
        halvArr.add(39,"Maler");
        halvArr.add(40, "Overrasket");
        halvArr.add(41, "Når man dummer sig");
        halvArr.add(42, "Part _");
        halvArr.add(43, "Alek");
        halvArr.add(44, "You know ___ __ are");
        halvArr.add(45, "_yp___");
        halvArr.add(46, "Meget typisk");
        halvArr.add(47, "Når en bytur starter");
        halvArr.add(48, "Klar til at trykke på...");
        halvArr.add(49, "Giv mig __ min __");
        halvArr.add(50, "Russer");
        halvArr.add(51, "I __ __ne");
        halvArr.add(52, "Ja på swag sprog");
        halvArr.add(53,"God farve på bukser");
        halvArr.add(54, "Kv___ån");
        halvArr.add(55, "__d _kke");
        halvArr.add(56, "Vodka, gin, rom, tequila");
        halvArr.add(57, "Hugh ___ __ ____");
        halvArr.add(58,"Man ____");
        halvArr.add(59,"__ld c_auff__");

        return halvArr;
    }

    private ArrayList<String> konsekvenser(){

        konsekvensArr.add(0,"På munden");
        konsekvensArr.add(1,"En bunder");
        konsekvensArr.add(2,"Et shot");
        konsekvensArr.add(3,"En tår");
        konsekvensArr.add(4,"Sig 'i dag' konstant\ni 5 min eller bund");
        konsekvensArr.add(5, "Snak i Swag citater");
        konsekvensArr.add(6,"Tag et shot og\nlæg på dig på gulvet");
        konsekvensArr.add(7, "Drik 7 drinks på rooms");
        konsekvensArr.add(8, "Skriv til swag");
        konsekvensArr.add(9, "Tag på VS med PS");
        konsekvensArr.add(10, "Et heart attack");
        konsekvensArr.add(11, "Råb som en\nsindsyg i byens");
        konsekvensArr.add(12,"Sig til en thot du har hør på");
        konsekvensArr.add(13, "Køb en drink til\nen thot i byens");
        konsekvensArr.add(14,"Start et fællesskål");
        konsekvensArr.add(15,"Gør noget dumt i byens");
        konsekvensArr.add(16, "Tag en ølbong");

        return konsekvensArr;
    }

}