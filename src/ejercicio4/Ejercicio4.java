/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;
import java.util.Scanner;
/**
 *
 * @author Lucas Palomeque
 */
public class Ejercicio4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el dia: ");
        int dia = scanner.nextInt();

        System.out.print("Ingrese el mes: ");
        int mes = scanner.nextInt();

        System.out.print("Ingrese el año: ");
        int año = scanner.nextInt();

        int trimestre;
        if (mes >= 1 && mes <= 3) {
            trimestre = 1;
        } else if (mes >= 4 && mes <= 6) {
            trimestre = 2;
        } else if (mes >= 7 && mes <= 9) {
            trimestre = 3;
        } else {
            trimestre = 4;
        }

        System.out.println("El dia " + dia + " del mes " + mes + " del año " + año + " corresponde al trimestre"  + trimestre + "del año");
    }
}
    





    


    

