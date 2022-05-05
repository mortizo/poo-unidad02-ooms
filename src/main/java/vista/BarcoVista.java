/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.BarcoControl;
import modelo.Barco;

/**
 *
 * @author morti
 */
public class BarcoVista {
    
    public static void main(String [] args)
    {
        var barcoControl = new BarcoControl();
        barcoControl.crear(1, "Titanic", "Ecuador", "B0HC", 100, "Sparrow");
        barcoControl.crear(2, "La Pinta", "España", "B0HC", 200, "Cristobal Colón");
        
        for(Barco b: barcoControl.listar())
            System.out.println(b.toString());
    }
    
}
