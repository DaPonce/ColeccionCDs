package com.ponce.daniel.coleccioncds;

import java.util.HashMap;

/**
 * Created by dponce on 20/11/17.
 */

public class Disco extends HashMap<String, Object> {

    public Disco(boolean comprado, Estilo estilo, CharSequence autor, CharSequence titulo, int publicacion) {
        this.put(ClavesDisco.COMPRADO.toString(), comprado);
        this.put(ClavesDisco.ESTILO.toString(), estilo);
        this.put(ClavesDisco.AUTOR.toString(), autor);
        this.put(ClavesDisco.TITULO.toString(), titulo);
        this.put(ClavesDisco.PUBLICACION.toString(), publicacion);
    }

    public boolean getComprado(){
        return (boolean) this.get(ClavesDisco.COMPRADO);
    }

    public Estilo getEstilo(){
        return (Estilo) this.get(ClavesDisco.ESTILO);
    }

    public CharSequence getAutor(){
        return (CharSequence) this.get(ClavesDisco.AUTOR);
    }

    public CharSequence getTitulo(){
        return (CharSequence) this.get(ClavesDisco.TITULO);
    }

    public int getPublicacion(){
        return (int) this.get(ClavesDisco.PUBLICACION);
    }
}
