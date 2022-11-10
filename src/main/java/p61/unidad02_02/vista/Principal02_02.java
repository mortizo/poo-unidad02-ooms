/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad02_02.vista;

import p61.unidad02_02.modelo.Dueño;

/**
 *
 * @author morti
 */
public class Principal02_02 {
    
    public static void main(String[] args) {
        var juana = new Dueño("0104048794","Juana Moreno Dávila");
        juana.nuevoTelefono("0984357604", 0, "Móvil personal", "Bellsouth");
        juana.nuevoTelefono("072818314", 0, "Casa", "Etapa");
        juana.nuevoTelefono("0984357604", 0, "Móvil de mi esposo", "Movistar");
        
        System.out.println("juana = " + juana.toString());
    }
    
}
