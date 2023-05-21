package Guia3_EstructurasDeControl;

import java.util.Scanner;

/*
 * @author Andrea Báez
 *
 * Escriba un programa en el cual se ingrese un valor límite positivo, 
 * y a continuación solicite números al usuario hasta que la suma de los 
 * números introducidos supere el límite inicial.
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        //Declaramos variables
        int num, numLimite;

        //Pedimos datos e inicializamos variables
        System.out.println("Ingrese un número entero positivo límite:");
        numLimite = read.nextInt();
        num = 0;

        System.out.println("Ingrese números:");

        //Usamos un "for" para sumar los números ingresados hasta superar el límite
        for (int i = 0; num < numLimite; i++) {

            num += read.nextInt();
        }

        System.out.println("Se superó el límite " + numLimite
                + "\nLa suma total de los números es: " + num);
    }

}
