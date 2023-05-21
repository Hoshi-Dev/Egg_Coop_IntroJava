package Guia3_EstructurasDeControl;

import java.util.Scanner;

/*
 * @author Andrea Báez

Simular la división usando solamente restas. Dados dos números enteros
mayores que uno, realizar un algoritmo que calcule el cociente y el
residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
obtener un resultado menor que el divisor, este resultado es el residuo, y
el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es
3.
 */
public class Extra9 {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        int dividendo, divisor, residuo,
                cociente = 0;

        System.out.println("Ingrese el número a dividir:");
        dividendo = read.nextInt();

        System.out.println("Ahora ingrese el divisor: ");
        divisor = read.nextInt();

        //El bucle "while" seguirá iterando hasta que el dividendo sea menor al divisor.
        while (dividendo >= divisor) {
            dividendo -= divisor;
            cociente++;
        }

        residuo = dividendo;

        System.out.println("El cociente de la división es: " + cociente
                + "\nEl residuo: " + residuo);
    }

}
