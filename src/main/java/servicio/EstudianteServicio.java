/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Auto;
import modelo.Estudiante;

/**
 *
 * @author morti
 */
public class EstudianteServicio implements IEstudianteServicio{

    private final List<Estudiante> estudianteList = new ArrayList<>();
    
    @Override
    public Estudiante crear(Estudiante e) {
        this.estudianteList.add(e);
        return e;
    }

    @Override
    public List<Estudiante> listar() {
        return this.estudianteList;
    }

    @Override
    public Estudiante obtener(int i) {
        return this.estudianteList.get(i);
    }
    
    
}
