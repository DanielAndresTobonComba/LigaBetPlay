package com.ligabetplay;

import Jugador.Application.CrearJugador;
import Jugador.Application.EliminarJugador;
import Jugador.Domain.Services.ServiciosJugador;
import Jugador.Infraestructure.In.ControladorCrearJugador;
import Jugador.Infraestructure.In.ControladorEliminarJugador;
import Jugador.Infraestructure.Out.JugadorRepositorio;

public class Main {
    public static void main(String[] args) {

        /*  CREAR JUGADOR
         
        ServiciosJugador servicio = new JugadorRepositorio();

        CrearJugador crearJugador = new CrearJugador(servicio);

        ControladorCrearJugador adapJugador = new ControladorCrearJugador(crearJugador);

        adapJugador.ObtenerDatosCrearJugador();
        */
        
        //ELIMINAR JUGADOR

        ServiciosJugador servicio = new JugadorRepositorio(); 

        EliminarJugador eliminarJugador = new EliminarJugador(servicio);

        ControladorEliminarJugador adaptJugador = new ControladorEliminarJugador(eliminarJugador);

        adaptJugador.ObtenerDatosEliminarJugador();

    }
}

