/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicamvc411;

import controlador.ControladorEstudiante;
import modelo.ConexionDatabase;
import modelo.Estudiante;
import vista.VistaEstudiante;


/**
 *
 * @author g.perezmoreno
 */
public class PracticaMVC411 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ConexionDatabase.getConnection();
        
        // Inicializamos el modelo creando un nuevo estudiante
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Pedro");
        estudiante1.setEdad(27);
        
        // Inicializamos la vista
        VistaEstudiante vista = new VistaEstudiante();
        
        ControladorEstudiante controlador = new ControladorEstudiante(estudiante1, vista);
        
        Estudiante estudiante2 = new Estudiante();
        estudiante2.setNombre("Fernando");
        estudiante2.setEdad(29);
        
        controlador.crearEstudiante(estudiante2);
        
        controlador.actualizarVista();
    
    }
    
}
