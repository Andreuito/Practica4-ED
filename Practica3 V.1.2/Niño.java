/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica3;

/**
 *
 * @author andre
 */
public class Niño extends Persona{
    //atributos
    private String colegio;
    private Juguete juguete;
    
    //constructor lleno
    public Niño (String nombre, String dni, int edat, String colegio){
        super(nombre, dni, edat);
        this.colegio = colegio;
    }
    
    //constructor vacio
    public Niño (){
        this.colegio = null;
        this.juguete = null;
    }
    
    
    //agregacion y ensamblador
    public void ensamblador (Juguete juguete){
        this.juguete = juguete;
    }
    
    
    //getters y setters
    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public Juguete getJuguete() {
        return juguete;
    }

    public void setJuguete(Juguete juguete) {
        this.juguete = juguete;
    }

    //funcion toString
    @Override
    public String toString() {
        return "Niño{" + "colegio=" + colegio + ", juguete=" + juguete + '}';
    } 
}
