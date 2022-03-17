/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica3;

/**
 *
 * @author andre
 */
public class Adulto extends Persona{
    //atributos
    private int nss;
    private String direccion;
    
    //constructor lleno
    public Adulto (String nombre, String dni, int edat, int nss, String direccion) {
        super(nombre, dni, edat);
        this.nss = nss;
        this.direccion = direccion;
    }
    
    
    //constructor vacío
    public Adulto () {
    }

    
    //getters y setters
    public int getNss() {
        return nss;
    }

    public void setNss(int nss) {
        this.nss = nss;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    //toString
    @Override
    public String toString() {
        return "Adulto{" + "nss=" + nss + ", direccion=" + direccion + '}';
    }
    
}
