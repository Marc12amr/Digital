/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mmoralesdia2;

/**
 *
 * @author marco
 */
public class Bote extends Acuatico{
    int numeroRemos;

    
    public Bote(String color, int numeroPuertas,int numeroVelas, int numeroRemos){
        super(color,numeroPuertas, numeroVelas);
        this.numeroRemos = numeroRemos;
    }
    public int getNumeroRemos() {
        return numeroRemos;
    }

    public void setNumeroRemos(int numeroRemos) {
        this.numeroRemos = numeroRemos;
    }
    
    @Override
    public String Velocidad(){
        return super.Velocidad() + "35 kilometros por hora";
    }
    
}
