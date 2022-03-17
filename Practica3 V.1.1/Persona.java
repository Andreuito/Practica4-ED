/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica3;

/**
 *
 * @author andre
 */
public abstract class Persona {
    //atributos
    private String nombre;
    private String dni;
    private int edat;
    
    //constructor lleno
    public Persona (String nombre, String dni, int edat){
        this.nombre = nombre;
        this.dni = dni;
        this.edat = edat;
    }
    
    //constructor vacio
    public Persona (){ 
        this.dni = null;
        this.edat = 0;
        this.nombre = null;
    }

    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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
        return "Persona{" + "nombre=" + nombre + ", dni=" + dni + ", edat=" + edat + '}';
    }
    
}
