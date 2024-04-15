/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;
import java.util.Scanner;
/**
 *
 * @author Lucas Palomeque
 */
public class Ejercicio1 {
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la nota del alumno");
        double nota = scanner.nextDouble();
        
        if (nota < 4){
            System.out.println("El alumno esta desaprobado");
        }else if (nota < 10){
            System.out.println("El alumno esta aprobado");
        }else if (nota == 10){
            System.out.println("El alumno fue sobresaliente");
        }else {
            System.out.println("La nota que ingreso no es valida");
            
        }
        scanner.close();
        }
}
