package com.co.itm.contruccion.software.arquitectura.grasp.controller;

import java.util.List;

public class PizzaControlador {
    private final ServicioCocina servicioCocina = new ServicioCocina();

    public void tomarPedido(String tipo, String tamano) {
        Pizza pizza = servicioCocina.prepararPizza(tipo, tamano);
        System.out.println("Pedido recibido: " + pizza);
    }

    public void verPedidos() {
        List<Pizza> pedidos = servicioCocina.obtenerPedidos();
        System.out.println("Lista de pedidos:");
        for (Pizza pizza : pedidos) {
            System.out.println(pizza);
        }
    }
}