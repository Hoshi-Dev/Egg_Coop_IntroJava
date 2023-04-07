package Guia1_IntroJava;

import java.util.Scanner;

/*
 * @author Andrea Báez
 *
 * Escribir un programa que pida dos números enteros por teclado 
 * y calcule la suma de los dos. 
 * El programa deberá después mostrar el resultado de la suma
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        //El Scanner nos permite introducir datos por teclado
        Scanner read = new Scanner(System.in);

        //Definimos las variables
        int num1, num2, suma;
        
        //Mostramos por pantalla un mensaje e inicializamos variables
        System.out.println("Introduce un numero");
        num1 = read.nextInt();

        System.out.println("Introduce un numero");
        num2 = read.nextInt();

        //Realizamos la suma
        suma = num2 + num1;

        //Mostramos por pantalla el resultado
        System.out.println("El resultado de la suma es: " + suma);

    }
}


