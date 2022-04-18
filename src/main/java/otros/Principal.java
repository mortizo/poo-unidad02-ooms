/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package otros;

/**
 *
 * @author morti
 */
public class Principal {
    public static void main(String [] args)
    {
        var competenciaList = new Auto[4];
        competenciaList[0]= new Auto("ABG7549","Chevrolet",2017);
        competenciaList[1]= new Auto("PYR0549","Toyota",2015);
        competenciaList[2]= new Auto("UBC9685","Jetour",2005);
        competenciaList[3]= new Auto("ADX0422","Mazda",1998);
        
        System.out.println("Los autos que competirán son");
        for(var auto:competenciaList)
            System.out.println(auto.toString());
    }
}
