/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mmoralesdia2;

/**
 *
 * @author marco
 */
public class Acuatico extends Transporte {
    int numeroVelas;

    
    public Acuatico(String color, int numeroPuertas, int numeroVelas){
        super(color,numeroPuertas);
        this.numeroVelas = numeroVelas;
        
    }
    public int getNumeroVelas() {
        return numeroVelas;
    }

    public void setNumeroVelas(int numeroVelas) {
        this.numeroVelas = numeroVelas;
    }
    @Override
    public String Desplazamiento(){
        return super.Desplazamiento() + "agua";
    }
    public String Velocidad(){
        return "este transporte va a una velocidad de:";
    }
}
