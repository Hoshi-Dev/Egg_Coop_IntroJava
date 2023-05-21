package Guia3_EstructurasDeControl;

import java.util.Scanner;

/*
 * @author Andrea Báez

Se dispone de un conjunto de N familias, cada una de las cuales tiene
una M cantidad de hijos. Escriba un programa que pida la cantidad de
familias y para cada familia la cantidad de hijos para averiguar la media
de edad de los hijos de todas las familias.

 */
public class Extra14 {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        int familias, hijos, edad,
                contHijos = 0,
                contEdad = 0;

        double promedioEdad = 0;

        System.out.println("Ingrese la cantidad de familias:");
        familias = read.nextInt();

        for (int i = 0; i < familias; i++) {

            System.out.println("Ingrese la cantidad de hijos de la familia " + (i + 1));
            hijos = read.nextInt();

            for (int j = 0; j < hijos; j++) {

                System.out.println("Ingrese la edad del hijo " + (j + 1));
                edad = read.nextInt();

                contHijos++;
                contEdad += edad;
            }

            promedioEdad = (double) contEdad / contHijos;
        }

        System.out.println("El promedio de edad de los hijos es de: " + promedioEdad);
    }

}
