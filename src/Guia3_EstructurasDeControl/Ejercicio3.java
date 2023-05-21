package Guia3_EstructurasDeControl;

import java.util.Scanner;

/*
 * @author Andrea Báez
 *
 * Realizar un programa que solo permita introducir solo frases o palabras 
 * de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo 
 * se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
 * en caso contrario, se deberá imprimir “INCORRECTO”. 
 * Nota: investigar la función Lenght() en Java.
 */
public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);

        //Declaramos variables
        String frase;

        //Pedimos datos e inicializamos variables
        System.out.println("Ingrese una frase de 8 caracteres:");
        frase = read.next();

        //Usamos un "if/else" para validar la longitud de la cadena de texto
        if (frase.length() == 8) {
            System.out.println("[CORRECTO]");
        } else {
            System.out.println("[INCORRECTO]");
        }
    }
    
}
