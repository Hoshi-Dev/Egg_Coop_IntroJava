package Guia2_IntroJava;

import java.util.Scanner;

/*
 * @author Andrea Báez 
 * 
 * Escribir un programa que pida tu nombre, lo guarde en una variable y 
 * lo muestre por pantalla.
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        
        //Declaramos variables
        String nombre;
        
        //Mostramos un mensaje e inicializamos variables
        System.out.println("Ingrese su nombre:");
        nombre = read.nextLine();
        
        System.out.println("Hola " + nombre);
        
    }

}
