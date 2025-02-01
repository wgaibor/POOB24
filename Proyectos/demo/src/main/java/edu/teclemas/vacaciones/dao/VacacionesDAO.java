package edu.teclemas.vacaciones.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.teclemas.vacaciones.ConexionDB;
import edu.teclemas.vacaciones.entity.Persona;

public class VacacionesDAO {

    public ConexionDB conexionDB;

    // En este método se realiza la conexión a la base de datos y se captura cualquier excepción que se pueda presentar
    public VacacionesDAO() {
        // Captura y propaga la excepción a la clase que llama al constructor
        try {
            conexionDB = new ConexionDB();
            conexionDB.connectDatabase();
        } catch (Exception e) {
            System.out.println("Error al conectar a la base de datos: " + e);
            //Sigue propagando la excepción
            throw new RuntimeException("No se puede conectar a la base de datos", e);
        }
    }

    public boolean insertarVacaciones(Persona persona) {
        String sql = "INSERT INTO vacaciones (identificacion, feInicio, feFin) VALUES (?, ?, ?)";
        try (Connection connection = conexionDB.connection; 
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            
            // Establecer los valores en el PreparedStatement
            preparedStatement.setString(1, persona.getIdentificacion());
            preparedStatement.setDate(2, java.sql.Date.valueOf(persona.getFeInicio()));
            preparedStatement.setDate(3, java.sql.Date.valueOf(persona.getFeFin()));

            // Ejecutar la consulta
            int filasAfectadas = preparedStatement.executeUpdate();

            // Retornar true si se insertaron filas
            return filasAfectadas > 0;

        } catch (SQLException e) {
            System.err.println("Error al insertar los datos: " + e.getMessage());
            return false;
        } catch (RuntimeException ex) {
            // Propaga la excepción a la clase que llama al método insertarVacaciones
            throw new RuntimeException("No se puede insertar las vacaciones", ex);
        }
    }

    //Crea un método para listar las vacaciones
    public List<Persona> listarVacaciones() {
        List<Persona> listaVacaciones = new ArrayList<>();
        String sql = "SELECT identificacion, feInicio, feFin FROM vacaciones";
        try (Connection connection = conexionDB.connection;
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                Persona persona = new Persona();
                persona.setIdentificacion(resultSet.getString("identificacion"));
                persona.setFeInicio(resultSet.getDate("feInicio").toLocalDate());
                persona.setFeFin(resultSet.getDate("feFin").toLocalDate());
                listaVacaciones.add(persona);
            }
        } catch (SQLException e) {
            System.err.println("Error al listar los datos: " + e.getMessage());
        } catch (RuntimeException ex) {
            // Propaga la excepción a la clase que llama al método insertarVacaciones
            throw new RuntimeException("No se puede insertar las vacaciones", ex);
        }
        return listaVacaciones;
    }
}
