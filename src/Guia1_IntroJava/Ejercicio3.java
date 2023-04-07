package Guia1_IntroJava;

import java.util.Scanner;

/*
 * @author Andrea Báez
 *
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas 
 * y después toda en minúsculas. 
 * Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        //Declaramos variable
        String frase;

        //Mostramos un mensaje e inicializamos variable
        System.out.println("Ingrese una frase:");
        frase = read.nextLine();

        //Estas funciones devuelven las cadenas de texto en minúscula o mayúscula
        System.out.println("[minúscula]: " + frase.toLowerCase()
                + "\n[MAYÚSCULA]: " + frase.toUpperCase());
    }

}
