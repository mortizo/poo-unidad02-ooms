/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;


import java.util.ArrayList;
import java.util.List;
import modelo.Auto;

/**
 *
 * @author morti
 */
public class AutoControl {
    
    private final List<Auto> autoList = new ArrayList<>();

    public Auto crear(String placa, String marca){
        var auto = new Auto(placa, marca);
        this.autoList.add(auto);
        return auto;
    }
    
    public List<Auto> listar(){   
        return this.autoList;
    }
    
    
}
