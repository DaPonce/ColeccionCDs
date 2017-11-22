package com.ponce.daniel.coleccioncds;

/**
 * Created by dponce on 20/11/17.
 */

public enum Estilo {
    POP(R.string.pop_name),
    FOLK(R.string.folk_name),
    ROCK(R.string.rock_name),
    CLASICA(R.string.clasica_name);

    private int nombre;
    //private int imagen;
    Estilo(int nombre){
        this.nombre = nombre;
    }

    public int getNombre() {
        return nombre;
    }

    public Integer[] nombres(){
        Integer[] nombres = new Integer[Estilo.values().length];
        for(int i = 0; i < Estilo.values().length; i++){
            nombres[i] = Estilo.values()[i].getNombre();
        }
        return nombres;
    }
}
