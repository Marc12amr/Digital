/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mmoralesdia2;

/**
 *
 * @author marco
 */
public class Helicoptero extends Aereo {
    String tipo ;
    
    
    public Helicoptero(String color, int numeroPuertas, int numeroHelices, String tipo){
         super(color,numeroPuertas, numeroHelices);
         this.tipo = tipo;
        
    }
    
    
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return tipo;
    }
    
    @Override
    public String Aereo(){
        return super.Aereo() + "25,000 pies";
    }
    
}
