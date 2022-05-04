/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Auto;
import modelo.Estudiante;

/**
 *
 * @author morti
 */
public interface IEstudianteServicio {
    
    public Estudiante crear(Estudiante e);
    public List<Estudiante> listar();
    public Estudiante obtener(int i);
    
}
