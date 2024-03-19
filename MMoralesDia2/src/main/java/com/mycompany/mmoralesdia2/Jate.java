/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mmoralesdia2;

/**
 *
 * @author marco
 */
public class Jate extends Acuatico {
    int capacidadPersonas;
    
    
    public Jate(String color, int numeroPuertas,int numeroVelas, int capacidadPersonas){
        super(color,numeroPuertas, numeroVelas);
        this.capacidadPersonas = capacidadPersonas;
    }

    public int getCapacidadPersonas() {
        return capacidadPersonas;
    }

    public void setCapacidadPersonas(int capacidadPersonas) {
        this.capacidadPersonas = capacidadPersonas;
    }
    
     @Override
    public String Velocidad(){
        return super.Velocidad() + "45 kilometros por hora";
    }
}
