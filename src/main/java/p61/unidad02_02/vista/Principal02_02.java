/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad02_02.vista;

import java.time.LocalDate;
import java.time.Month;
import p61.unidad02_02.modelo.Carrera;
import p61.unidad02_02.modelo.Dueño;
import p61.unidad02_02.modelo.Estudiante;
import p61.unidad02_02.modelo.Jugador;
import p61.unidad02_02.servicio.JugadorServicioImpl;

/**
 *
 * @author morti
 */
public class Principal02_02 {
    
    public static void main(String[] args) {
       /* var juana = new Dueño("0104048794","Juana Moreno Dávila");
        juana.nuevoTelefono("0984357604", 0, "Móvil personal", "Bellsouth");
        juana.nuevoTelefono("072818314", 0, "Casa", "Etapa");
        juana.nuevoTelefono("0984357604", 0, "Móvil de mi esposo", "Movistar");
        
        System.out.println("juana = " + juana.toString());
        
       var pedro= new Estudiante("0103667752", "Pedro");
       var luis= new Estudiante("0103667723", "Luis Antonio");
       
       
        var teleco = new Carrera("Ingeniería en Telecomunicación",8);
        teleco.nuevoEstudiante(pedro);
        teleco.nuevoEstudiante(luis);
      
        
        var elec = new Carrera("Ingeniería en Electrónica",8);
        elec.nuevoEstudiante(pedro);
        elec.nuevoEstudiante(luis);
        
        var com = new Carrera("Ingeniería en Computación",8);
        com.nuevoEstudiante(pedro);
        com.nuevoEstudiante(luis);

        
        System.out.println("teleco = " + teleco.toString());
        System.out.println("elec = " + elec.toString());
        System.out.println("com = " + com.toString());
*/ 
       var enner = new Jugador(10,"Enner Valencia",80,175,LocalDate.of(1998, 02, 01));
       var byron = new Jugador(20,"Byron Castillo",80,175,LocalDate.of(1998, 02, 01));
       var dominguez = new Jugador(30,"Dida Dominguez",80,175,LocalDate.of(1998, 02, 01));
       var galindez = new Jugador(40,"Ernan Galindez",80,175,LocalDate.of(1998, 02, 01));
       var galindezNuevo = new Jugador(40,"Hernán Galindez",80,175,LocalDate.of(1990, 02, 01));
       
       
       var jugadorDB = new JugadorServicioImpl();
       jugadorDB.crear(enner);
       jugadorDB.crear(byron);
       jugadorDB.crear(dominguez);
       jugadorDB.crear(galindez);
       System.out.println(jugadorDB.listar());
       jugadorDB.eliminar(20);
       jugadorDB.eliminar(30);
       System.out.println(jugadorDB.listar());
       jugadorDB.modificar(40, galindezNuevo);
       System.out.println(jugadorDB.listar());
       
        
       
       
       
        
        
    }

  
    
}
