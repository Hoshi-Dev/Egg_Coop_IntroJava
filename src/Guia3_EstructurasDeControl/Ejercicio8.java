package Guia3_EstructurasDeControl;

import java.util.Scanner;

/*
 * @author Andrea Báez

Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *


 */
public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de los lados del cuadrado:");
        int n = read.nextInt();

        //Usamos un "for" para crear el cuadrado
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

}
