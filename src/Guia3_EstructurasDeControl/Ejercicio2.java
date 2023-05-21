package Guia3_EstructurasDeControl;

import java.util.Scanner;

/*
 * @author Andrea Báez
 *
 * Crear un programa que pida una
 * frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de
 * Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar la
 * función equals() en Java.
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        
        //Declaramos variables
        String frase;
        
        //Pedimos datos e inicializamos variables
        System.out.println("Ingrese la frase a adivinar:");
        frase = read.next();
        
        //Usamos un "if/else" para validar.
        //La función equalsIgnoreCase() compara Strings ignorando si esta en minúscula o mayúscula
        if (frase.equalsIgnoreCase("eureka")) {
            System.out.println("[CORRECTO]");
        } else {
            System.out.println("[INCORRECTO]");
        }
    }
}
