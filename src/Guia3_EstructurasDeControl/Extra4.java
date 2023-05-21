
package Guia3_EstructurasDeControl;

import java.util.Scanner;

/*
 * @author Andrea Báez

Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 
y se muestre su equivalente en romano.

 */
public class Extra4 {

    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese un número del 1 al 10:");
        int num = read.nextInt();

        switch (num) {
            case 1:
                System.out.println("En romano es: I");
                break;
            case 2:
                System.out.println("En romano es: II");
                break;
            case 3:
                System.out.println("En romano es: III");
                break;
            case 4:
                System.out.println("En romano es: IV");
                break;
            case 5:
                System.out.println("En romano es: V");
                break;
            case 6:
                System.out.println("En romano es: VI");
                break;
            case 7:
                System.out.println("En romano es: VII");
                break;
            case 8:
                System.out.println("En romano es: VIII");
                break;
            case 9:
                System.out.println("En romano es: IX");
                break;
            case 10:
                System.out.println("En romano es: X");
                break;
        }
    }

}
