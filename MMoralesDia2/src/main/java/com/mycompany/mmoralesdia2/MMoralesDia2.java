/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mmoralesdia2;
import java.util.Scanner;
/**
 *
 * @author marco
 */
public class MMoralesDia2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa el color del transporte");
        String color = sc.next();
        
        Helicoptero aereo = new Helicoptero(color,1,1,"de agua");
        Avion avion = new Avion(color,1,1,4);
        Carro carro = new Carro (color,1,1,4);
        Moto moto = new Moto (color,1,1,4);
        Bote bote = new Bote(color,1,1,4);
        Jate jate = new Jate(color,1,1,4);
        
        //clase tipo aereo
        System.out.println(aereo.Desplazamiento());
        System.out.println("transporte aereo" + aereo.getColor() + aereo.getNumeroPuertas() + aereo.getNumeroHelices());
        System.out.println("el helicoptero" + aereo.Aereo());
        System.out.println("el avion" + avion.Aereo());
        
        // clase de tipo terrestre
        System.out.println(carro.Desplazamiento());
        System.out.println("transporte terrestre" + carro.getColor() + aereo.getNumeroPuertas() + aereo.getNumeroHelices());
        System.out.println("el carro" + carro.Verificado());
        System.out.println("la moto" + moto.Verificado());
        
        // clase de tipo acuatico
         System.out.println(carro.Desplazamiento());
        System.out.println("transporte acuatico" + carro.getColor() + aereo.getNumeroPuertas() + aereo.getNumeroHelices());
        System.out.println("el bote" + bote.Velocidad());
        System.out.println("el jate" + jate.Velocidad());
    }
}
