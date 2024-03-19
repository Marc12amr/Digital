/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mmoralesdia2;

/**
 *
 * @author marco
 */
public class Avion extends Aereo{
    
    int numeroAlas;
    
    public Avion(String color, int numeroPuertas, int numeroHelices, int numeroAlas){
        super(color,numeroPuertas, numeroHelices);
        this.numeroAlas = numeroAlas;
    }
    public void setNumeroAlas(int numeroAlas){
        this.numeroAlas = numeroAlas;
    }
    public int getNumeroAlas(){
        return numeroAlas;
    }
    
    @Override
    public String Aereo(){
        return super.Aereo() + "35,000 pies";
    }
}
