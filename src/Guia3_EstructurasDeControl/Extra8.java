package Guia3_EstructurasDeControl;

import java.util.Scanner;

/*
 * @author Andrea Báez

 Escriba un programa que lea números enteros. Si el número es múltiplo de
 cinco debe detener la lectura y mostrar la cantidad de números leídos, la
 cantidad de números pares y la cantidad de números impares. Al igual que
 en el ejercicio anterior los números negativos no deben sumarse. 

 */
public class Extra8 {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        int n,
                contPar = 0,
                contImpar = 0,
                cont = 0;

        System.out.println("Ingrese números");

        do {
            
            n = read.nextInt();
            
            if (n > 0) {
                cont = cont + 1;
            }
            
            if (n % 2 == 0) {
                contPar += 1;
            } else {
                contImpar += 1;
            }
            
        } while (n % 5 != 0);

        System.out.println("Cantidad de números leidos: " + cont
                + "\nCantidad de números pares: " + contPar
                + "\nCantidad de números impares: " + contImpar);

    }

}
