package Guia3_EstructurasDeControl;

import java.util.Scanner;

/*
 * @author Andrea Báez
 * Leer la altura de N personas y determinar el promedio de estaturas que
 * se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
 * general.
 */
public class Extra6 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        //Declaramos e inicializamos variables
        int pers,
                cont = 0;
        double alt,
                alTotal = 0.0,
                alTodos = 0.0;

        //Pedimos datos
        System.out.println("Ingrese la cantidad de personas a evaluar:");
        pers = read.nextInt();

        //El bucle "for" no permitira ingresar los datos de las N personas
        for (int i = 0; i < pers; i++) {

            System.out.println("Ingrese la altura de la persona:" + (i+1));
            alt = read.nextDouble();
            alTodos += alt;

            //Si ingresamos una altura menor a 1.60 el contador se incrementa en 1
            if (alt <= 1.60) {
                cont++;
                alTotal += alt;
            }
        }

        System.out.println("El promedio de estatura menor a 1,60 es de: " +  alTotal / cont);
        System.out.println("El promedio de altura general es: " +  alTodos / pers);
    }

}
