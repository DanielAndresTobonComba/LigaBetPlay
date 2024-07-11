package Jugador.Application;

import Jugador.Domain.Jugador;
import Jugador.Domain.Services.ServiciosJugador;

public class CrearJugador {

    private final ServiciosJugador crearJugador;

    public CrearJugador(ServiciosJugador crearJugador) {
        this.crearJugador = crearJugador;
    }

    public void ejecutarCrearJugador (Jugador jugador) {
        crearJugador.crearJugadorDB(jugador);

    }

    

}
