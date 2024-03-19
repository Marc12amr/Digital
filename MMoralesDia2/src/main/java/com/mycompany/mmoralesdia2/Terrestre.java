/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mmoralesdia2;

/**
 *
 * @author marco
 */
public class Terrestre extends Transporte {
    int cilindraje;
    
    
    public Terrestre(String color, int numeroPuertas, int cilindraje){
        super(color,numeroPuertas);
        this.cilindraje = cilindraje;
    }
    
    public void setCilindraje(int cilindraje){
        this.cilindraje = cilindraje;
    }
    
    public int getCilindraje(){
        return cilindraje;
    }
    
    public String Verificado(){
        return "mi trasporte terrestre:";
    }
    
     @Override
    public String Desplazamiento(){
        return super.Desplazamiento() + "tierra";
    }
}
