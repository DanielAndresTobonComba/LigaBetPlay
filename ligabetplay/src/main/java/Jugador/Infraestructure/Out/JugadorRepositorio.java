package Jugador.Infraestructure.Out;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Jugador.Domain.Jugador;
import Jugador.Domain.Services.ServiciosJugador;
import dbConfig.DatabaseConfig;

public class JugadorRepositorio implements ServiciosJugador{

    @Override
    public void crearJugadorDB(Jugador jugador) {

        System.out.println("llegue aca crear jugador db");

        String sql = "INSERT INTO jugadores (nombre, edad , nacionalidad , estado , numCamiseta , posicion) VALUES (?, ? , ? , ? , ? , ?)";


        try (Connection connection = DatabaseConfig.gConnection();
             PreparedStatement statement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {

            statement.setString(1, jugador.getNombre());
            statement.setInt(2, jugador.getEdad());

            statement.setString(3, jugador.getNacionalidad());

            statement.setString(4, jugador.getEstado());
            
            statement.setInt(5, jugador.getNumCamiseta());

            statement.setString(6, jugador.getPosicion());


            statement.executeUpdate();

/*             try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    user.setId(generatedKeys.getLong(1));
                }
            } */


        } catch (SQLException e) {
            e.printStackTrace();
            // Aquí se debería manejar de forma más adecuada, dependiendo del contexto de tu aplicación
        }

    }

    @Override
    public void editarJuagdorDB(Jugador jugador) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'editarJuagdor'");
    }

    @Override
    public void eliminarJugadorDB(Integer id) {
        System.out.println("LLEGE A ELIMINAR JUGADAR EN DB");

        String sql = "DELETE FROM jugadores WHERE id = ?";

        try (Connection connection = DatabaseConfig.gConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
    
            statement.setLong(1, id);
            statement.executeUpdate();
    
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al intentar eliminar el usuario con ID: " + id);
            // Aquí se debería manejar de forma más adecuada, dependiendo del contexto de tu aplicación
        }
    }

    @Override
    public void buscarJugadorPorId(Integer id) {

    }

    // aca puedo sobrecargar el metodo

    @Override
    public void buscarJugadorPorNombre(String nombre) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarJugadorPorNombre'");
    }

}
