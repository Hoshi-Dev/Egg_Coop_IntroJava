package Guia3_EstructurasDeControl;

import java.util.Scanner;

/*
 * @author Andrea Báez

Escribir un programa que lea un número entero y devuelva el número de
dígitos que componen ese número. Por ejemplo, si introducimos el
número 12345, el programa deberá devolver 5. Calcular la cantidad de
dígitos matemáticamente utilizando el operador de división. Nota:
recordar que las variables de tipo entero truncan los números o
resultados.

 */
public class Extra11 {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        int num, cont = 0;
        
        System.out.println("Ingrese un número entero:");
        num = read.nextInt();

        while (num > 0) {
            num /= 10;
            cont++;
        }

        System.out.println("El número tiene " + cont + " dígitos");
    }

}
