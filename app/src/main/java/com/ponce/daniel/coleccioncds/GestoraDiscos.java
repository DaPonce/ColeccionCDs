package com.ponce.daniel.coleccioncds;

import android.content.Context;

import java.util.ArrayList;

/**
 * Created by dponce on 20/11/17.
 */

public class GestoraDiscos extends ArrayList<Disco> {

    public GestoraDiscos(Context c){
        this.add(new Disco(true,Estilo.POP,"David Bisbal","Ave María",2002));
        this.add(new Disco(true,Estilo.CLASICA,"Antonio Vivaldi","Las Cuatro Estaciones",1725));
        this.add(new Disco(true,Estilo.ROCK,"Rolling Stones","Between the Buttons",1967));
        this.add(new Disco(true,Estilo.FOLK,"Bob Dylan","Time Out of Mind",1997));
    }
}
