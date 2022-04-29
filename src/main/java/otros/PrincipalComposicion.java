/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package otros;

/**
 *
 * @author morti
 */
public class PrincipalComposicion {
    
    public static void main(String [] args){
        Revista r = new Revista("Vistazo", "AblaYala","456654IASPEODK");
        r.crear("El agua es vida", 273, "Si es vida........",0);
        r.crear("El sol es vida", 3560, "Si es vida........",1);
        r.crear("La Pacha mama es vida", 1954, "Si es vida........",2);
        
        System.out.println(r);
    }
    
}
