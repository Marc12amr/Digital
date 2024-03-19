/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mmorsalesdia1;

/**
 *
 * @author marco
 */
import java.util.Scanner;
public class MMorsalesDia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa el valor del numero 1");
        double numero1 = scanner.nextDouble();
        System.out.println("Ingresa el valor del numero 2");
        double numero2 = scanner.nextDouble();
        
        System.out.println("Ingresa el valor del numero que desea conocer el factorial");
        int numero3 = scanner.nextInt();
        
        
        System.out.println("el resultado de la suma es " + Suma( numero1, numero2));               
        System.out.println("el resultado de la rest es " + Resta( numero1, numero2));               
        System.out.println("el resultado de la division es " + Division( numero1, numero2));               
        System.out.println("el resultado de la multiplicacion es " + Multiplicacion( numero1, numero2));               
        System.out.println("el resultado del factorial es " + Factorial( numero3));               
        System.out.println("el resultado del factorial recursivo es: " + FactorialRecursivo( numero3));               
       
    }
    public static double Suma(double numero1, double numero2){
            return numero1 + numero2;
     }
    
    public static double Resta(double numero1, double numero2){
            return numero1 - numero2;
     }
    
    public static double Multiplicacion(double numero1, double numero2){
            return numero1 * numero2;
     }
    public static double Division(double numero1, double numero2){
            return numero1 / numero2;
     }
    public static int Factorial(int numero3){
            int factorial = 1;
            for (int i = 1; i <= numero3; i++) {
            factorial = factorial * i;
            
}
            return factorial;
     }
    public static int FactorialRecursivo(int numero3){
              if (numero3 == 0 || numero3 == 1) {
            return 1;
        } else {
            return numero3 * FactorialRecursivo(numero3 - 1);
        }
     }
    
}
