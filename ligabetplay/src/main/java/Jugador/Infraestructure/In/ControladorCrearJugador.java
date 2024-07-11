package Jugador.Infraestructure.In;

import com.ligabetplay.Utilidades.CheckInt;
import com.ligabetplay.Utilidades.CheckString;

import Jugador.Application.CrearJugador;
import Jugador.Domain.Jugador;

public class ControladorCrearJugador {

    private CrearJugador crearJugador;

    public ControladorCrearJugador(CrearJugador crearJugador) {
        this.crearJugador = crearJugador;
    }
    

    public void ObtenerDatosCrearJugador () {

        try {
            
            System.out.println("Ingresa el nombre:");
            String nombre = CheckString.check("Digita de nuevo el dato");

            System.out.println("Ingresa la edad: ");
            int edad = CheckInt.check();

            System.out.println("Ingresa el id del equipo: ");
            int idEquipo = CheckInt.check(); 
            // FALTA VERIFICAR SI EL EQUIPO EXISTE 

            System.out.println("Ingresa la nacionalidad: ");
            String nacionalidad = CheckString.check("Digita de nuevo el dato");

            System.out.println("Ingresa el estado del jugador: ");
            String estadoJugador = CheckString.check("Digita de nuevo el dato");

            System.out.println("Ingresa el numero de la camiseta: ");
            int numCamiseta = CheckInt.check();

            System.out.println("Ingresa la posicion del jugador: ");
            String posicion = CheckString.check("Digita de nuevo el dato. "); 


            Jugador jugador = new Jugador();

            jugador.setNombre(nombre);
            jugador.setEdad(edad);
            jugador.setIdEquipo(idEquipo);
            jugador.setNacionalidad(nacionalidad);
            jugador.setEstado(estadoJugador);
            jugador.setNumCamiseta(numCamiseta);
            jugador.setPosicion(posicion);

            crearJugador.ejecutarCrearJugador(jugador);
            
        } catch (Exception e) {
            System.out.println("Error al crear al jugador " + e);
        }








        //crearJugador.ejecutarCrearJugador(Jugador);
    }
    
    

}
