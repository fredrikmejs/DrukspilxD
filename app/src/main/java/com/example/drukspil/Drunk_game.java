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

public class Drunk_game extends AppCompatActivity implements View.OnClickListener {
ArrayList<String> namesArr = new ArrayList<>();
Button button_add,button_start;
TextView textView_overskrift, tekstView_addedplayers;
EditText editText_addNames;
int spiller = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drunk_game);

        button_add = findViewById(R.id.button_add);
        button_add.setOnClickListener(this);

        button_start = findViewById(R.id.button_start);
        button_start.setOnClickListener(this);

        tekstView_addedplayers = findViewById(R.id.textView_addedplayer);
        tekstView_addedplayers.setVisibility(View.INVISIBLE);

        textView_overskrift = findViewById(R.id.tekst_overskrift2);
        textView_overskrift.setVisibility(View.INVISIBLE);

        editText_addNames = findViewById(R.id.edittext_addnames);

    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {


        if (v == button_add){
            String name = editText_addNames.getText().toString();
            tekstView_addedplayers.setText(name + " er blevet tilføjet");
            //namesArr.add(name);
            namesArr.add(name); //TODO fix
            tekstView_addedplayers.setVisibility(View.VISIBLE);

        }

        if (v == button_start){
            Intent myIntent = new Intent(v.getContext(), drunk_game2.class);
            startActivityForResult(myIntent, 0);

        }
    }
    public ArrayList<String> getNamesArr() {
        return namesArr;
    }
}
