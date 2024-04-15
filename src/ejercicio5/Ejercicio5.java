/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;
import java.util.Scanner;
/**
 *
 * @author Lucas Palomeque
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingresar la coordenada x del punto: ");
        int x = scanner.nextInt();

        System.out.print("Ingresar la coordenada y del punto: ");
        int y = scanner.nextInt();
        
        String cuadrante;
        if (x > 0 && y > 0) {
            cuadrante = "en el primer cuadrante";
        } else if (x < 0 && y > 0) {
            cuadrante = "en el segundo cuadrante";
        } else if (x < 0 && y < 0) {
            cuadrante = "en el tercer cuadrante";
        } else if (x > 0 && y < 0) {
            cuadrante = " en el cuarto cuadrante";
        } else {
            cuadrante = "en el origen";
        }
        System.out.println("El punto (" + x + ", " + y + ") se encuentra " + cuadrante + ".");
    }
}
    
    


    

