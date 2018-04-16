package com.example.rafaj.fragmentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    ImageView imagen;
    TextView text1;
    TextView text2;
    TextView text3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        text1 = findViewById(R.id.textId1);
        text2 = findViewById(R.id.textId2);
        text3 = findViewById(R.id.textId3);
        imagen =findViewById(R.id.img);

        Intent callingIntent = getIntent();
        String intentAction = callingIntent.getAction();
        String intentType = callingIntent.getType();

        if (Intent.ACTION_SEND.equals(intentAction) && intentType != null){
            if (intentType.equals("text/plain")){
                handleReceivedText(callingIntent);
            }
        }

    }

    private void handleReceivedText(Intent intent){

        Carro carro = (Carro) intent.getSerializableExtra("CAR");

        if (imagen != null && text1 != null && text2 != null && text3 != null){
            imagen.setImageResource(carro.getImagen());
            text1.setText(carro.getMarca());
            text2.setText(carro.getModelo());
            text3.setText(carro.getAño());
        }
    }
}
