package com.ponce.daniel.coleccioncds;

import android.support.annotation.NonNull;

import java.util.HashMap;

/**
 * Created by dponce on 20/11/17.
 */

public class Disco extends HashMap<String, Object> implements Comparable<Disco>{

    public Disco(boolean comprado, Estilo estilo, CharSequence autor, CharSequence titulo, int publicacion) {
        this.put(ClavesDisco.COMPRADO.toString(), comprado);
        this.put(ClavesDisco.ESTILO.toString(), estilo);
        this.put(ClavesDisco.AUTOR.toString(), autor);
        this.put(ClavesDisco.TITULO.toString(), titulo);
        this.put(ClavesDisco.PUBLICACION.toString(), publicacion);
    }

    public boolean getComprado(){
        return (boolean) this.get(ClavesDisco.COMPRADO.toString());
    }

    public Estilo getEstilo(){
        return (Estilo) this.get(ClavesDisco.ESTILO.toString());
    }

    public CharSequence getAutor(){
        return (CharSequence) this.get(ClavesDisco.AUTOR.toString());
    }

    public CharSequence getTitulo(){
        return (CharSequence) this.get(ClavesDisco.TITULO.toString());
    }

    public int getPublicacion(){
        return (int) this.get(ClavesDisco.PUBLICACION.toString());
    }

    @Override
    public int compareTo(@NonNull Disco d) {
        int[] criteriosOrdenacion={ Boolean.compare(d.getComprado(),this.getComprado()),
                d.getEstilo().toString().compareTo(this.getEstilo().toString()),
                d.getAutor().toString().compareTo(this.getAutor().toString()),
                d.getTitulo().toString().compareTo(this.getTitulo().toString()),
                Integer.compare(d.getPublicacion(),this.getPublicacion())};
        for (int unCriterio:criteriosOrdenacion){
            if (unCriterio!=0){
                return unCriterio;
            }
        }
        return 0;
    }
}
