package edu.teclemas.vacaciones.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import edu.teclemas.vacaciones.ConexionDB;
import edu.teclemas.vacaciones.entity.Persona;

public class VacacionesDAO {

    public ConexionDB conexionDB;

    public VacacionesDAO() {
        this.conexionDB = new ConexionDB();
        conexionDB.connectDatabase();
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
        }
    }
}
