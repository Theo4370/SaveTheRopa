package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GuardaRopa {

    private Map<Integer, List<Prenda>> prendas;
    private Integer contador;

    public GuardaRopa() {
        this.prendas = new HashMap<>();
        this.contador = 0;
    }

    public Integer guardarPrendas(List<Prenda> listaDePrendas) {
        Integer identificador = contador;
        for (Integer i = 1; i < listaDePrendas.size(); i++) {
            prendas.put(i, listaDePrendas);
            return contador;
        }
        System.out.println("El numero de prenda es " + identificador);

        return identificador;

    }


}
