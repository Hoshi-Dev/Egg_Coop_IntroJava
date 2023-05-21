package Guia3_EstructurasDeControl;

import java.util.Scanner;

/*
 * @author Andrea Báez
 
 Realice un programa que calcule y visualice el valor máximo, el valor
 mínimo y el promedio de n números (n>0). El valor de n se solicitará al
 principio del programa y los números serán introducidos por el usuario.
 Realice dos versiones del programa, una usando el bucle “while” y otra
 con el bucle “do - while”.
 */
public class Extra7 {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        int cant, cont, n, max, min, suma;
        double promedio;

        System.out.println("[Version 1: while.]"
                + "\nIngrese la cantidad de números");
        cant = read.nextInt();

        cont = cant;
        max = Integer.MIN_VALUE; //Esta funcion te da el número máximo de un Integer
        min = Integer.MAX_VALUE; //Esta funcion te da el número mínimo de un Integer
        suma = 0;

        while (cont > 0) {

            System.out.println("Ingrese los números:");
            n = read.nextInt();
            cont -= 1;

            if (n > max) {
                max = n;
            }

            if (n < min) {
                min = n;
            }
            suma += n;
        }

        promedio = suma / cant;

        System.out.println("El numero maximo es: " + max + " El numero minimo es: " + min + " y el promedio es:" + promedio
                + "\n----------------------------------------------------------");

        //--------------------------------------------------------------------------------------------------------//
        
        int cant2, cont2, n2, max2, min2, suma2;
        double promedio2;

        System.out.println("[Version 2: do/while.]"
                + "\nIngrese la cantidad de números");
        cant2 = read.nextInt();

        cont2 = cant2;
        max2 = Integer.MIN_VALUE;
        min2 = Integer.MAX_VALUE;
        suma2 = 0;

        do {
            System.out.println("Ingrese los números:");
            n2 = read.nextInt();
            cont2 -= 1;

            if (n2 > max2) {
                max2 = n2;
            }

            if (n2 < min2) {
                min2 = n2;
            }
            suma2 += n2;

        } while (cont2 > 0);

        promedio2 = suma2 / cant2;

        System.out.println("El numero maximo es: " + max2 + " El numero minimo es: " + min2 + " y el promedio es:" + promedio2
                + "\n----------------------------------------------------------");
    }
}
