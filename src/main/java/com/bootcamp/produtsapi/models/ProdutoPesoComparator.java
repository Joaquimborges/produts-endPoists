package com.bootcamp.produtsapi.models;

import java.util.Comparator;

public class ProdutoPesoComparator implements Comparator<Produto> {

    @Override
    public int compare(Produto o1, Produto o2) {
        return o1.getPeso().compareTo(o2.getPeso());
    }
}
