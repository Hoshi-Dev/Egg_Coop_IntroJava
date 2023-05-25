package Guia4_Subprogramas;

import java.util.Scanner;

/*
 * @author Andrea Báez

Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”.

 */
public class Ejercicio2 {

    static Scanner read = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        int edad = 0;
        String nombres = "",
                opciones = "";

        do {

            mostrarInfo(edad, nombres, opciones);
            
            System.out.println("¿Desea continuar? (si/no)");
            opciones = read.next();

        } while (!opciones.equalsIgnoreCase("no"));
        
        System.out.println("[Saliendo...]");

    }

    public static void mostrarInfo(int edad, String nombres, String opciones) {

        System.out.println("Ingrese el nombre de la persona:");
        nombres = read.next();
        
        System.out.println("Ingrese la edad:");
        edad = read.nextInt();

        if (edad >= 18) {
            System.out.println(nombres + " con " + edad + " años es mayor de edad.");
        } else {
            System.out.println(nombres + " con " + edad + " años es menor de edad.");
        }

    }
}
