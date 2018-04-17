package com.example.rafaj.fragmentapp;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;

import java.io.Serializable;

public class Carro implements Serializable {


    private int imagen;
    private String marca;
    private String modelo;
    private String año;

    public Carro (Resources res, int pos) {


        switch(pos){
            case 0:
                imagen = R.drawable.audi_a4;
                marca = res.getStringArray(R.array.marca)[0];
                modelo = res.getStringArray(R.array.modelo)[0];
                año = res.getStringArray(R.array.año)[0];
                break;
            case 1:
                imagen = R.drawable.bmw_440i;
                marca = res.getStringArray(R.array.marca)[1];
                modelo = res.getStringArray(R.array.modelo)[1];
                año = res.getStringArray(R.array.año)[0];
                break;
            case 2:
                imagen = R.drawable.honda_crv_17;
                marca = res.getStringArray(R.array.marca)[2];
                modelo = res.getStringArray(R.array.modelo)[2];
                año = res.getStringArray(R.array.año)[1];
                break;
            case 3:
                imagen = R.drawable.hyundai_elantra_18;
                marca = res.getStringArray(R.array.marca)[3];
                modelo = res.getStringArray(R.array.modelo)[3];
                año = res.getStringArray(R.array.año)[0];
                break;
            case 4:
                imagen = R.drawable.jeep_cherokee_18;
                marca = res.getStringArray(R.array.marca)[4];
                modelo = res.getStringArray(R.array.modelo)[4];
                año = res.getStringArray(R.array.año)[0];
                break;
            case 5:
                imagen = R.drawable.kia_sportage;
                marca = res.getStringArray(R.array.marca)[5];
                modelo = res.getStringArray(R.array.modelo)[5];
                año = res.getStringArray(R.array.año)[0];
                break;
            case 6:
                imagen = R.drawable.mazda_3_18;
                marca = res.getStringArray(R.array.marca)[6];
                modelo = res.getStringArray(R.array.modelo)[6];
                año = res.getStringArray(R.array.año)[0];
                break;
            case 7:
                imagen = R.drawable.mb_eclass_18;
                marca = res.getStringArray(R.array.marca)[7];
                modelo = res.getStringArray(R.array.modelo)[7];
                año = res.getStringArray(R.array.año)[0];
                break;
            case 8:
                imagen = R.drawable.toyota;
                marca = res.getStringArray(R.array.marca)[8];
                modelo = res.getStringArray(R.array.modelo)[8];
                año = res.getStringArray(R.array.año)[0];
                break;
        }





    }

    public int getImagen (){
        return imagen;
    }

    public String getAño() {
        return año;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}
