/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica3;

/**
 *
 * @author andre
 */
public class Juguete {
    //atributos
    private String nombre;
    private int precio;
    private int edad_recomendada;
    
    //constructor completo
    public Juguete (String nombre, int precio, int edad_recomendada){
        this.nombre = nombre;
        this.precio = precio;
        this.edad_recomendada = edad_recomendada;
    }
    
    
    //constructor vacio
    public Juguete() {
        this.nombre = null;
        this.precio = 0;
        this.edad_recomendada = 0;
    }
    
    
    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getEdad_recomendada() {
        return edad_recomendada;
    }

    public void setEdad_recomendada(int edad_recomendada) {
        this.edad_recomendada = edad_recomendada;
    }
    
    
    //funcion toString
    @Override
    public String toString() {
        return "Juguete{" + "nombre=" + nombre + ", precio=" + precio + ", edad_recomendada=" + edad_recomendada + '}';
    }
    
}
