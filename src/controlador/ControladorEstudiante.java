/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Estudiante;
import vista.VistaEstudiante;

/**
 *
 * @author g.perezmoreno
 */
public class ControladorEstudiante {

    private Estudiante modelo;
    private VistaEstudiante vista;

    public ControladorEstudiante(Estudiante modelo, VistaEstudiante vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void setNombreEstudiante(String nombre) {
        modelo.setNombre(nombre);
    }

    public String getNombreEstudiante() {
        return modelo.getNombre();
    }

    public void setEdadEstudiante(int edad) {
        modelo.setEdad(edad);
    }

    public int getEdadEstudiante() {
        return modelo.getEdad();
    }

    public void crearEstudiante(Estudiante nuevoEstudiante){
        nuevoEstudiante.insertarEstudiante(nuevoEstudiante);
        System.out.println("Estudiante creado correctamente!");
    }
    
    public void actualizarVista() {
        vista.mostrarDetallesEstudiante(modelo.getNombre(), modelo.getEdad());
    }
}
