package com.example.drukspil;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class Swag_game extends AppCompatActivity implements View.OnClickListener {
ArrayList<String> gameArr = new ArrayList<>();
private Button button_begynd, button_next, button_svar;
private TextView tekst_svar, tekst_question, tekst_konsekvens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swag_game);

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
        int slag = 0;
        int slag1 = 0;
        if(v == button_begynd){
            button_begynd.setVisibility(View.INVISIBLE);
            slag = terning();
            tekst_question.setText("dit spørgsmål er: " + citaterhalv().get(slag));
            tekst_question.setVisibility(View.VISIBLE);
            tekst_svar.setText("svaret er: "+citaterfuld().get(slag));
            button_svar.setVisibility(View.VISIBLE);
            button_next.setVisibility(View.VISIBLE);
            Log.d("knap", "onClick: trykket");
        }

        if (v == button_svar){
            button_svar.setVisibility(View.INVISIBLE);
            //tekst_svar.setText("Svaret er: "+ citaterfuld().get(slag));
            tekst_svar.setVisibility(View.VISIBLE);
            slag1 = terningKonsekvens();
            tekst_konsekvens.setText("Din konsekvens er: " + konsekvenser().get(slag1));
            tekst_konsekvens.setVisibility(View.VISIBLE);
            Log.d("knap", "onClick: trykket");
        }
        if (v == button_next){
            tekst_svar.setVisibility(View.INVISIBLE);
            tekst_konsekvens.setVisibility(View.INVISIBLE);
            slag = terning();
            tekst_question.setText("Dit spørgsmåll er: "+ citaterhalv().get(slag));
            tekst_svar.setText("Svaret er: " +citaterfuld().get(slag));
            button_svar.setVisibility(View.VISIBLE);

            Log.d("knap", "onClick: trykket");
        }

    }

    private int terningKonsekvens(){
        int terning = (int) (Math.random() * konsekvenser().size());
        return terning;
    }

    public int terning(){
        int terning = (int) (Math.random()*citaterfuld().size());

        return terning;
    }

    public ArrayList<String> citaterfuld(){

        ArrayList<String> arrFuld = new ArrayList<>();

        arrFuld.add(0,"BYEEN");
        arrFuld.add(1,"BØV");
        arrFuld.add(2,"fedtet Rotten");
        arrFuld.add(3,"DJ SWAG");
        arrFuld.add(4,"TYLLE SNART");
        arrFuld.add(5, "TYLLE");
        arrFuld.add(6, "HOMO");
        arrFuld.add(7,"en ristet med det hele");
        arrFuld.add(8,"UD i DAG? <3");
        arrFuld.add(9,"ROOMS");
        arrFuld.add(10,"STOP AFSKY");
        arrFuld.add(11, "hånden er tilbage?");
        arrFuld.add(12, "no <3");
        arrFuld.add(13, "nej <3 why (græde tudesmiley)");
        arrFuld.add(14, "nope B <3");
        arrFuld.add(15, "the hands lærling edition");
        arrFuld.add(16, "idag");
        arrFuld.add(17,"Aarbyens");
        arrFuld.add(18,"fan luv");
        arrFuld.add(19, "lunar way");
        arrFuld.add(20, "hvor I <3");
        arrFuld.add(21, "THOT");
        arrFuld.add(22, "løs, loose, løsning");
        arrFuld.add(23, "Sry jeg ikke tog den,\n er lige i gang med noget nu <3");
        arrFuld.add(24, "Hey mate <3 kan jeg ikke låne 130kr til i morgen,\n Skal have noget og har pengene igen i morgen <3");
        arrFuld.add(25, "Nice");
        arrFuld.add(26,"xD");
        arrFuld.add(27,"VS på PS");
        arrFuld.add(28,"Uha <3");
        arrFuld.add(29, "Tørst");
        arrFuld.add(30, "nations");
        arrFuld.add(31, "kæp i øret");
        arrFuld.add(32, "have en skid på");
        arrFuld.add(33, "indens");
        arrFuld.add(34, "goodbye");
        arrFuld.add(35, "bamse rundt");
        arrFuld.add(36, "Døj comback");
        arrFuld.add(37, "Hvad så DRENGEE");
        arrFuld.add(38, "homework");
        arrFuld.add(39,"Maybe i should become a painter");
        arrFuld.add(40, "surprise");
        arrFuld.add(41, "På munden");
        arrFuld.add(42, "part 2");
        arrFuld.add(43, "hyggeligt");
        arrFuld.add(44, "You know WHO er are");
        arrFuld.add(45, "Typisk");
        arrFuld.add(46, "Typisk Seriøst/Typisk Klassisk");
        arrFuld.add(47, "So the adventure begins");
        arrFuld.add(48, "Knap");
        arrFuld.add(49, "Giv mig 10 min <3");
        arrFuld.add(50, "Only Vodka");
        arrFuld.add(51, "I am done");
        arrFuld.add(52, "ye");
        arrFuld.add(53,"hvide bukser");
        arrFuld.add(54, "kviklån");
        arrFuld.add(55, "ved ikke");
        arrFuld.add(56, "holder mig til longs");
        arrFuld.add(57, "Hugh kan gå hjem");
        arrFuld.add(58,"man down");
        arrFuld.add(59,"Fuld chauffør");




        return arrFuld;
    }
    public ArrayList<String> citaterhalv() {

        ArrayList<String> arrHalv = new ArrayList<>();

        arrHalv.add(0,"BYE__");
        arrHalv.add(1,"BØ_");
        arrHalv.add(2,"_____ Rotten");
        arrHalv.add(3,"DJ ____");
        arrHalv.add(4,"TYL__ ____");
        arrHalv.add(5, "TY___");
        arrHalv.add(6, "H___");
        arrHalv.add(7,"Synonym for ROAST");
        arrHalv.add(8,"__ i ___? <3");
        arrHalv.add(9,"stue");
        arrHalv.add(10,"STOP _____");
        arrHalv.add(11, "Hvad er tilbage?");
        arrHalv.add(12, "__ <3");
        arrHalv.add(13, "___ __ why ()");
        arrHalv.add(14, "nope _ __");
        arrHalv.add(15, "lærling");
        arrHalv.add(16, "hvornår?");
        arrHalv.add(17,"___byens");
        arrHalv.add(18,"___ luv");
        arrHalv.add(19, "skod bank");
        arrHalv.add(20, "hvor _ __");
        arrHalv.add(21, "trækker vejret");
        arrHalv.add(22, "må ikke kaldes en sm__");
        arrHalv.add(23, "er i gang med noget");
        arrHalv.add(24, "130 kr");
        arrHalv.add(25, "klunker");
        arrHalv.add(26,"x_");
        arrHalv.add(27,"hvor man finder VS");
        arrHalv.add(28,"Når man skal på tørst");
        arrHalv.add(29, "Tø___");
        arrHalv.add(30, "mange på et sted");
        arrHalv.add(31, "noget i øret");
        arrHalv.add(32, "skal være stiv");
        arrHalv.add(33, "før noget");
        arrHalv.add(34, "afsked");
        arrHalv.add(35, "bamse _____");
        arrHalv.add(36, "et stærkt comeback");
        arrHalv.add(37, "Når man hilser på drengene");
        arrHalv.add(38, "h__e__rk");
        arrHalv.add(39,"maler");
        arrHalv.add(40, "overrasket");
        arrHalv.add(41, "når man dummer sig");
        arrHalv.add(42, "part _");
        arrHalv.add(43, "Alek");
        arrHalv.add(44, "You know ___ __ are");
        arrHalv.add(45, "_yp___");
        arrHalv.add(46, "meget typisk");
        arrHalv.add(47, "når en bytur starter");
        arrHalv.add(48, "klar til at trykke på...");
        arrHalv.add(49, "giv mig __ min __");
        arrHalv.add(50, "Russer");
        arrHalv.add(51, "I __ __ne");
        arrHalv.add(52, "ja på swag sprog");
        arrHalv.add(53,"god farve på bukser");
        arrHalv.add(54, "kv___ån");
        arrHalv.add(55, "__d _ke");
        arrHalv.add(56, "vodka, gin, rom, tequila");
        arrHalv.add(57, "Hugh ___ __ ____");
        arrHalv.add(58,"man ____");
        arrHalv.add(59,"__ld __auff__");
        return arrHalv;
    }

    private ArrayList<String> konsekvenser(){

        ArrayList<String> arr = new ArrayList<>();

        arr.add(0,"På munden");
        arr.add(1,"En bunder");
        arr.add(2,"Et shot");
        arr.add(3,"En tår");
        arr.add(4,"Sig 'i dag' konstant\ni 5 min eller bund");
        arr.add(5, "Snak i Swag citater");
        arr.add(6,"Tag et shot og\nlæg på dig på gulvet");
        arr.add(7, "Drik 7 drinks på rooms");
        arr.add(8, "Skriv til swag");
        arr.add(9, "Tag på VS med PS");
        arr.add(10, "Et heart attack");
        arr.add(11, "råb som en\nsindsyg i byens");
        arr.add(12,"sig til en thot du har hør på");
        arr.add(13, "Køb en drink til\nen thot i byens");
        arr.add(14,"start et fællesskål");
        arr.add(15,"gør noget dumt");
        arr.add(16, "tag en ølbong");
        return arr;
    }

}