/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad02_02.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author morti
 */
public class Carrera {
    
    private String nombre;
    private int numeroCiclos;
    private List<Estudiante> estudianteList;

    public Carrera(String nombre, int numeroCiclos) {
        this.nombre = nombre;
        this.numeroCiclos = numeroCiclos;
        this.estudianteList= new ArrayList<>();
    }
    
    public void nuevoEstudiante(Estudiante e){
        this.estudianteList.add(e);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroCiclos() {
        return numeroCiclos;
    }

    public void setNumeroCiclos(int numeroCiclos) {
        this.numeroCiclos = numeroCiclos;
    }

    @Override
    public String toString() {
        return "Carrera{" + "nombre=" + nombre + ", numeroCiclos=" 
                + numeroCiclos + ", estudianteList=" + estudianteList + '}';
    }

    
    
    
}
