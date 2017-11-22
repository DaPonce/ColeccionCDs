package com.ponce.daniel.coleccioncds;

import java.util.Comparator;

/**
 * Created by dponce on 20/11/17.
 */

public class ComparadorPublicacion implements Comparator<Disco> {
    @Override
    public int compare(Disco disco1, Disco disco2) {
        if(disco1.getPublicacion() > disco2.getPublicacion()){
            return 1;
        } else if(disco1.getPublicacion() < disco2.getPublicacion()){
            return -1;
        } else {
            return 0;
        }
    }
}
