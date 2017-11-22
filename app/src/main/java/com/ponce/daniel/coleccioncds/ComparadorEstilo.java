package com.ponce.daniel.coleccioncds;

import java.util.Comparator;

/**
 * Created by dponce on 20/11/17.
 */

public class ComparadorEstilo implements Comparator<Disco> {
    @Override
    public int compare(Disco d1, Disco d2) {
        return  d1.getEstilo().toString().compareTo(d2.getEstilo().toString());
    }
}
