/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package otros;

/**
 *
 * @author morti
 */
public class Parqueadero {
    
    private String nombre;
    private String direccion;
    private Auto [] autoList;

    public Parqueadero(String nombre, String direccion, int dimension) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.autoList = new Auto [dimension];
    }
    
    public Auto crear(String placa, String marca, int year, int indice){
            var auto = new Auto(placa, marca, year);
            this.autoList[indice]=auto;
            return auto;
    }
       
}


