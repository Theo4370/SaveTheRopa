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
        for (Integer i = 1; i <= listaDePrendas.size(); i++) {
            identificador = i;
            prendas.put(identificador, listaDePrendas);
            System.out.println("Se guardó la prenda con identificador " + identificador);
        }
        return identificador;
    }

    public void mostrarPrendas() {
        System.out.println("Prendas guardadas:");
        for (Integer i : prendas.keySet()) {
            System.out.println(i + "-" + prendas.get(i));

        }
    }

}
