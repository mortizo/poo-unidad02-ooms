/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Auto;

public interface IAutoServicio {
    
    public Auto crear(Auto auto);
    public List<Auto> listar();
    
}


