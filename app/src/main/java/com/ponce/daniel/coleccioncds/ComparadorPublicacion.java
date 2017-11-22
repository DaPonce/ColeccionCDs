package com.ponce.daniel.coleccioncds;

import java.util.Comparator;

/**
 * Created by dponce on 20/11/17.
 */

public class ComparadorPublicacion implements Comparator<Disco> {
    @Override
    public int compare(Disco d1, Disco d2) {
        return Integer.compare(d1.getPublicacion(),d2.getPublicacion());
    }
}
