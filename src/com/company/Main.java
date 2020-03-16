package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Prenda unaPrenda = new Prenda("alguna marca", "medias");
        Prenda otraPrenda = new Prenda("otra marca", "remera");
        Prenda otraMas = new Prenda("alguna otra marca", "buzo");

        GuardaRopa unGuardaRopa = new GuardaRopa();
        List<Prenda> listaDePrendas = new ArrayList<>();
        listaDePrendas.add(unaPrenda);
        listaDePrendas.add(otraMas);
        listaDePrendas.add(otraPrenda);
        unGuardaRopa.guardarPrendas(listaDePrendas);
        unGuardaRopa.mostrarPrendas();

    }
}
