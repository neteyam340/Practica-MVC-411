/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author g.perezmoreno
 */
public class ConexionDatabase {
    
    private static Connection conexion;
    
    public static Connection getConnection() {
        
        if (conexion == null) {
            
            try {
                
                String url = "jdbc:mysql://localhost:3306/escuela";
                String user = "root";
                String password = "admin213";

                conexion = DriverManager.getConnection(url, user, password);
                
                System.out.println("Conexion Exitosa!");
                
            } catch (SQLException error) {
                System.out.println("Error message: " + error);
                throw new RuntimeException("Fallo la conexion a la base de datos." + error);
                // error.printStackTrace();
            }
            
        }
        
        return conexion;
    }
    
    public static void closeConnection() {
    
        if (conexion != null) {
            try {
                conexion.close();
                System.out.println("Conexion a la base de datos cerrada.");
            } catch (Exception error) {
                error.printStackTrace();
            }
        }
        
    }
    
}
