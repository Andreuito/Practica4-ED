/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica3;

/**
 *
 * @author andre
 */
public class Motor {
    //atributos
    private String motor;
    private String potencia;
    private int codigo;
    
    //constructor completo
    public Motor (String motor, String potencia, int codigo){
        this.motor = motor;
        this.potencia = potencia;
        this.codigo = codigo;
    }
    
    //constructor vacio
    public Motor (){
        this.codigo = 0;
        this.motor = null;
        this.potencia = null;
    }
    
    
    //getters y setters
    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    //funcion toString
    @Override
    public String toString() {
        return "Motor{" + "motor=" + motor + ", potencia=" + potencia + ", codigo=" + codigo + '}';
    }
    
    
}
