/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;
import java.util.Scanner;

/**
 *
 * @author Lucas Palomeque
 */
public class Ejercicio3 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero positivo");
        int numero = scanner.nextInt ();
        
        if (numero >=10 && numero <=99){
            System.out.println("El numero tiene dos digitos");
        }else if (numero <9 && numero >=0){
            System.out.println("El numero tiene un digito");
        }else{
            System.out.println("El numero no es valido");
            
        }
        scanner.close();
   }
    


    
}
