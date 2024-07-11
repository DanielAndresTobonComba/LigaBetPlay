package Jugador.Infraestructure.In;

import com.ligabetplay.Utilidades.CheckInt;

import Jugador.Application.EliminarJugador;

public class ControladorEliminarJugador {

    private EliminarJugador  eliminarJugador ;

    public ControladorEliminarJugador(EliminarJugador eliminarJugador) {
        this.eliminarJugador = eliminarJugador;
    }

    
    public void ObtenerDatosEliminarJugador (){
        
        try {

            System.out.println("Digita el id del jugador");
            int id = CheckInt.check();

            eliminarJugador.ejecutarELiminarJugador(id);
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
