/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicamvc411;

import controlador.ControladorEstudiante;
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
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Pepito");
        estudiante1.setEdad(17);
        
        // Inicializamos la vista
        VistaEstudiante vista = new VistaEstudiante();
        
        ControladorEstudiante controlador = new ControladorEstudiante(estudiante1, vista);
        
        controlador.actualizarVista();
    
    }
    
}
