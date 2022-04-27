/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package otros;

/**
 *
 * @author morti
 */
public class Universidad {
    
    private String nombre;
    private String rector;
    private int numeroEstudiantes;
    private int numeroCarreras;
    private Carrera [] carreraList;

    public Universidad(String nombre) {
        this.nombre = nombre;
    }
    
    public Universidad(String nombre, String rector) {
        this.nombre = nombre;
        this.rector = rector;
    }

    public Universidad(String nombre, String rector, int numeroEstudiantes, 
            int numeroCarreras) {
        this.nombre = nombre;
        this.rector = rector;
        this.numeroEstudiantes = numeroEstudiantes;
        this.numeroCarreras = numeroCarreras;
    }
    
    
    public Universidad(String nombre, String rector, int numeroEstudiantes, 
            int numeroCarreras, Carrera[] carreraList) {
        this.nombre = nombre;
        this.numeroEstudiantes = numeroEstudiantes;
        this.numeroCarreras = numeroCarreras;
        this.rector = rector;
        this.carreraList = carreraList;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroEstudiantes() {
        return numeroEstudiantes;
    }

    public void setNumeroEstudiantes(int numeroEstudiantes) {
        this.numeroEstudiantes = numeroEstudiantes;
    }

    public int getNumeroCarreras() {
        return numeroCarreras;
    }

    public void setNumeroCarreras(int numeroCarreras) {
        this.numeroCarreras = numeroCarreras;
    }

    public String getRector() {
        return rector;
    }

    public void setRector(String rector) {
        this.rector = rector;
    }

    public Carrera[] getCarreraList() {
        return carreraList;
    }

    public void setCarreraList(Carrera[] carreraList) {
        this.carreraList = carreraList;
    }

    @Override
    public String toString() {
        String retorno= "La Universidad se llama: "+this.nombre+"\n"+
                "Su rector es: "+this.rector+" tiene "+this.numeroEstudiantes+
                " estudiantes y cuenta con : "+this.numeroCarreras+
                " carreras ";        
        return retorno;
    }

    

}
