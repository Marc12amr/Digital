/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mmoralesdia2;

/**
 *
 * @author marco
 */
public class Transporte {
    String color;
    int numeroPuertas;
    
    
    public Transporte(){
        
    }
    public Transporte(String color, int numeroPuertas){
        this.color = color;
        this.numeroPuertas = numeroPuertas;
        
    }
    public void setColor(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    
    public void setNumeroPuertas(int numeroPuertas){
        this.numeroPuertas = numeroPuertas;
    }
    public int getNumeroPuertas(){
        return numeroPuertas;
    }
    public String Desplazamiento(){
        return "me desplazo por";
    }
    
}
