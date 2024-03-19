/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mmoralesdia2;

/**
 *
 * @author marco
 */
public class Carro extends Terrestre{
    int capacidadGasolina;

    
    public Carro(String color, int numeroPuertas, int cilindraje, int capacidadGasolina){
        super(color,numeroPuertas, cilindraje);
        this.capacidadGasolina = capacidadGasolina;
    }
    public int getCapacidadGasolina() {
        return capacidadGasolina;
    }

    public void setCapacidadGasolina(int capacidadGasolina) {
        this.capacidadGasolina = capacidadGasolina;
    }
    
    
     @Override
    public String Verificado(){
        return super.Verificado() + "esta verificado";
    }
    
}
