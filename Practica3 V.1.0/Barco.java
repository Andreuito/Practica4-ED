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
public class Barco implements Sonido {
    //atributos
    private String nombre;
    private Date fecha_construccion;
    private int num_camarotes;
    private Motor motor;
    
    //constructor completo
    public Barco(String nombre, Date fecha_construccion, int num_camarotes){
        this.nombre= nombre;
        this.fecha_construccion = fecha_construccion;
        this.num_camarotes = num_camarotes;
    }
    
    //constructor vacio y su composicion con la clase motor
    public Barco (){
        motor = new Motor();
    }
 
    
    //se implementa la interface de sonido
    @Override
    public void sonido(){
        System.out.println("El barco hace: BRUUUUUUMMMMMM!");
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
        return num_camarotes;
    }

    public void setNum_camarotes(int num_camarotes) {
        this.num_camarotes = num_camarotes;
    }
    
    //funcion toString
    @Override
    public String toString() {
        return "Barco{" + "nombre=" + nombre + ", fecha_construccion=" + fecha_construccion + ", num_camarotes=" + num_camarotes + '}';
    }
    
}
