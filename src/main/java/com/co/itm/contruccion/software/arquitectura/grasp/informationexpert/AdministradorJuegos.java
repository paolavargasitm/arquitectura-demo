package com.co.itm.contruccion.software.arquitectura.grasp.informationexpert;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AdministradorJuegos {
    private List<Juego> juegos;

    public AdministradorJuegos() {
        this.juegos = new ArrayList<>();
    }

    //Añadir un juego
    public void anadirJuego(Juego juego) {

        juegos.add(juego);
        System.out.println("Juego agregado: " + juego);
    }

    // Buscar un juego por ID
    public Optional<Juego> buscarJuegoPorId(String id) {
        return juegos.stream()
                .filter(juego -> juego.obtenerId().equalsIgnoreCase(id))
                .findFirst();
    }

    // Eliminar un juego por ID con validación
    public void removerJuego(String id) {
        juegos.removeIf(g -> g.obtenerId().equals(id));
    }
}
