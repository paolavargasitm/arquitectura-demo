package com.co.itm.contruccion.software.arquitectura.grasp.informationexpert;

public class Juego {
    private String id, nombre, genero;

    public Juego(String id, String nombre, String genero) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
    }

    public String obtenerId() {
        return id;
    }

    public String obtenerNombre() {
        return nombre;
    }


    @Override
    public String toString() {
        return "Juego{id='" + id + "', nombre='" + nombre + "', genero='" + genero + "'}";
    }
}