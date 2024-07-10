package Jugador.Domain.Services;

import Jugador.Domain.Jugador;

public interface interfazJugador {

    void crearJugador (Jugador jugador);
    void editarJuagdor (Jugador jugador);
    void eliminarJugador (Integer id);
    void buscarJugadorPorId (Integer id);
    void buscarJugadorPorNombre (String nombre);

}
