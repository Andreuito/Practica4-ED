/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica3;

/**
 *
 * @author andre
 */
public class Tiburon extends Mascota{
    //Atributos
    private String raza;
    
    
    //constructor completo
    public Tiburon (String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }
    
    
    //constructor vacio
    public Tiburon (){
        this.raza = null;
    }
    
    
    //se implementa la interface de sonido
    @Override
    public void sonido(){
        System.out.println("El tiburón hace: Glu Glu Glu Glu!");
    }
    
    
    //getters y setters
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
    //funcion toString
    @Override
    public String toString() {
        return "Gato{" + "raza=" + raza + '}';
    }
}
