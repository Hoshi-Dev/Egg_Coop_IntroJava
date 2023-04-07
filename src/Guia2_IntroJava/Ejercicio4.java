
package Guia2_IntroJava;

import java.util.Scanner;

/*
 * @author Andrea Báez
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente 
 * en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
public class Ejercicio4 {

    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        //Declaramos variables
        int cel, far;
        
        //Pedimos datos e inicializamos variables
        System.out.println("Ingrese los grados Celsius actuales:");
        cel = read.nextInt();
        
        far = 32 + (9 * cel / 5);
        
        System.out.println("El equivalente de " + cel + "° Celsius en Fahrenheit es: " + far + "°");
    }

}
