package Jugador.Domain.Services;

import Jugador.Domain.Jugador;

public interface ServiciosJugador {

    void crearJugadorDB (Jugador jugador);
    void editarJuagdorDB (Jugador jugador);
    void eliminarJugadorDB (Integer id);
    void buscarJugadorPorId (Integer id);
    void buscarJugadorPorNombre (String nombre);

}
