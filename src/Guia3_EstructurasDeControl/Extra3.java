
package Guia3_EstructurasDeControl;

import java.util.Scanner;

/*
 * @author Andrea Báez

Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata 
de una vocal. Caso contrario mostrar un mensaje. 
Nota: investigar la función equals() de la clase String.

 */
public class Extra3 {

    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese una letra:");
        String letra = read.next();
        
        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
            System.out.println("La letra es una vocal.");
            
        } else {
            System.out.println("La letra no es una vocal.");
        }
    }

}
