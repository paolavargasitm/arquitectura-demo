package com.co.itm.contruccion.software.arquitectura.grasp.controller;

public class Pizza {
    private String tipo;
    private String tamano;

    public Pizza(String tipo, String tamano) {
        this.tipo = tipo;
        this.tamano = tamano;
    }

    public String getTipo() { return tipo; }
    public String getTamano() { return tamano; }

    @Override
    public String toString() {
        return "Pizza{" + "tipo='" + tipo + "', tamaño='" + tamano + "'}";
    }
}