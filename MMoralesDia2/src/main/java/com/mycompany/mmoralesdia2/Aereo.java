/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mmoralesdia2;

/**
 *
 * @author marco
 */
public class Aereo extends Transporte {
    int numeroHelices;
    
    public Aereo(String color, int numeroPuertas, int numeroHelices){
        super(color,numeroPuertas);
        this.numeroHelices = numeroHelices;
    }
    
    public void setNumeroHelices(int numeroHelices){
        this.numeroHelices = numeroHelices; 
        
    }
    public int getNumeroHelices(){
    return numeroHelices;
}
    
    @Override
    public String Desplazamiento(){
        return super.Desplazamiento() + "aire";
    }
    
    public String Aereo(){
        return "vuelo a una altura de:";
    }
}