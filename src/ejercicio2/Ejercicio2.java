/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;
import java.util.Scanner;
/**
 *
 * @author Lucas Palomeque
 */
public class Ejercicio2 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
        System.out.println("Ingrese la nota del primer parcial");
        double parcial1 = scanner.nextDouble ();
        
        System.out.println("Ingrese la nota del segundo parcial");
        double parcial2 = scanner.nextDouble ();
        
        System.out.println("Ingrese la nota del tercer parcial");
        double parcial3 = scanner.nextDouble ();
        
        double promedio = (parcial1+parcial2+parcial3) /3;
     
        if (promedio >=8){
            System.out.println("El alumno esta promocionado");
        }else{
            System.out.println("El alumno no promociono");
            
        
        }
        scanner.close();
   }
    
}


    
    
     
