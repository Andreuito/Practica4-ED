/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica3;

/**
 *
 * @author andre
 */
public abstract class Mascota implements Sonido {
    //atributos
    private String nombre;
    private int edat;
    
    //constructor completo
    public Mascota (String nombre, int edat){
        this.nombre = nombre;
        this.edat = edat;
    }
    
    //constructor vacio
    public Mascota (){
        this.edat = 0;
        this.nombre = null;
    }
    
    
    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }
    
    
    //funcion toString
    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", edat=" + edat + '}';
    }
    
}
