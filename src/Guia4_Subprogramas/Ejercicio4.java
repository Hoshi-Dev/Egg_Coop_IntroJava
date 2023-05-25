package Guia4_Subprogramas;

import java.util.Scanner;

/*
 * @author Andrea Báez

Crea una aplicación que nos pida un número por teclado y con una
función se lo pasamos por parámetro para que nos indique si es o no un
número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
17 si es primo.

 */
public class Ejercicio4 {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        int num;

        System.out.println("Ingrese un número:");
        num = read.nextInt();

        if (numeroPrimo(num)) {
            System.out.println("El número es primo.");
            
        } else {
            System.out.println("El número no es primo.");
        }
    }

    public static boolean numeroPrimo(int num) {

        //Comenzamos en i=2 ya que todo número es divisible por 1 e iteramos el bucle
        //hasta la mitad del número +1, ya que si existiera otro divisor antes de la mitad, dejaría de ser primo
        for (int i = 2; i < (num / 2 + 1); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
