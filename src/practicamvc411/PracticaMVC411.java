/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicamvc411;

import controlador.ControladorEstudiante;
import java.util.List;
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
        // Inicializamos el modelo creando un nuevo estudiante
        Estudiante estudiante = new Estudiante();
        
        // Inicializamos la vista
        VistaEstudiante vista = new VistaEstudiante();
        
        ControladorEstudiante controlador = new ControladorEstudiante(estudiante, vista);
        
        estudiante.setNombre("Jorge");
        estudiante.setEdad(24);
        
        controlador.crearEstudiante(estudiante);
        
        List<Estudiante> estudiantes = controlador.obtenerEstudiantes();
    
        vista.mostrarDetallesEstudiantes(estudiantes);
        
    }
    
}
