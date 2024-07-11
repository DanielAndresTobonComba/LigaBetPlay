package Jugador.Application;

import Jugador.Domain.Services.ServiciosJugador;

public class EliminarJugador {

    private final ServiciosJugador eliminarJugador;

   public EliminarJugador(ServiciosJugador eliminarJugador) {
       this.eliminarJugador = eliminarJugador;
   }


   public void ejecutarELiminarJugador (Integer id){
       eliminarJugador.eliminarJugadorDB(id);

   }
}
