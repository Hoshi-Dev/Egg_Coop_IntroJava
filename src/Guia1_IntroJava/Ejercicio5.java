package Guia1_IntroJava;

import java.util.Scanner;

/*
 * @author Andrea Báez

    Escribir un programa que lea un número entero por teclado y muestre 
    por pantalla el doble, el triple y la raíz cuadrada de ese número. 
    Nota: investigar la función Math.sqrt()
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        //Declaramos variables
        int num, doble, triple;
        double raiz;

        //Pedimos datos e inicializamos variables
        System.out.println("Ingrese un número:");
        num = read.nextInt();

        doble = num * 2;
        triple = num * 3;
        raiz = Math.sqrt(num);

        System.out.println("El doble de " + num + " es: " + doble
                + "\nEl triple de " + num + " es: " + triple
                + "\nLa raíz cuadrada de " + num + " es: " + raiz);
    }

}
