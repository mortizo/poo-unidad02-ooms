/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.List;

/**
 *
 * @author morti
 */
public abstract class AbstractService<T> {
   
    public abstract T crear(T objeto);
    public abstract List<T> listar();
    
}
