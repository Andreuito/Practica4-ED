/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica3;
import java.util.Date;//importamos el date para poder usarlo en los atributos

/**
 *
 * @author andre
 */
public class Avion implements Sonido {
    //atributos
    private String nombre;
    private Date fecha_construccion;
    private int num_asientos;
    private Motor motor;
    
    //constructor completo
    public Avion(String nombre, Date fecha_construccion, int num_asientos){
        this.nombre= nombre;
        this.fecha_construccion = fecha_construccion;
        this.num_asientos = num_asientos;
    }
    
    //constructor vacio y su composicion con la clase motor
    public Avion (){
        motor = new Motor();
        this.fecha_construccion = null;
        this.nombre = null;
        this.num_asientos = 0;
    }
 
    
    //se implementa la interface de sonido
    @Override
    public void sonido(){
        System.out.println("El avión hace: BRUUUUUUMMMMMM!");
    }
    
    
    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_construccion() {
        return fecha_construccion;
    }

    public void setFecha_construccion(Date fecha_construccion) {
        this.fecha_construccion = fecha_construccion;
    }

    public int getNum_camarotes() {
        return num_asientos;
    }

    public void setNum_camarotes(int num_camarotes) {
        this.num_asientos = num_camarotes;
    }
    
    //funcion toString
    @Override
    public String toString() {
        return "Avion{" + "nombre=" + nombre + ", fecha_construccion=" + fecha_construccion + ", num_asientos=" + num_asientos + '}';
    }
    
}
