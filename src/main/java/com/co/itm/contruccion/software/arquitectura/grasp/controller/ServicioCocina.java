package com.co.itm.contruccion.software.arquitectura.grasp.controller;

import java.util.ArrayList;
import java.util.List;

public class ServicioCocina {
    private final List<Pizza> pedidos = new ArrayList<>();

    public Pizza prepararPizza(String tipo, String tamano) {
        Pizza pizza = new Pizza(tipo, tamano);
        pedidos.add(pizza);
        return pizza;
    }

    public List<Pizza> obtenerPedidos() {
        return pedidos;
    }
}