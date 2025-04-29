/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author g.perezmoreno
 */
public class Estudiante {
    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public static void insertarEstudiante(Estudiante estudiante) {
        Connection conexion = ConexionDatabase.getConnection();
        
        String sql =    "INSERT INTO estudiante (nombre, edad) VALUES (?, ?)";
        
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            
            System.out.println("Nombre: " + estudiante.getNombre());
            System.out.println("Edad: " + estudiante.getEdad());
            
            statement.setString(1, estudiante.getNombre());
            statement.setInt(2, estudiante.getEdad());
            
            // INSERT, UPDATE, DELETE
            statement.executeUpdate();
            
            // SELECT
            // statement.executeQuery();
            
        } catch (Exception error) {
            error.printStackTrace();
        }
        
        
    }
    
}
