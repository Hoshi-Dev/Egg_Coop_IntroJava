package Guia3_EstructurasDeControl;

import java.util.Scanner;

/*
 * @author Andrea Báez
 *
 * Crear un programa que dado un número determine si es par o impar.
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        //Declaramos variables
        int num;

        //Pedimos datos e inicializamos variables
        System.out.println("Ingrese un número:");
        num = read.nextInt();

        //Usamos un "if/else" para verificar si el número es par o impar
        if (num % 2 == 0) {
            System.out.println(num + " [ES PAR]");
        } else {
            System.out.println(num + " [NO ES PAR]");
        }
    }
    

}
