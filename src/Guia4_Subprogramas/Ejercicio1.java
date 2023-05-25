package Guia4_Subprogramas;

import java.util.Scanner;

/*
 * @author Andrea Báez

Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main.

 */
public class Ejercicio1 {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        int num1, num2, opc, retorno;

        System.out.println("Ingrese dos números para realizar las operaciones:");
        num1 = read.nextInt();
        num2 = read.nextInt();

        do {
            System.out.println("[*----------MENU]---------*"
                    + "\n[1] Sumar."
                    + "\n[2] Restar"
                    + "\n[3] Multiplicar."
                    + "\n[4] Dividir"
                    + "\n[5] [SALIR]");
            opc = read.nextInt();

            switch (opc) {
                case 1:
                    retorno = sumar(num1, num2);
                    System.out.println("La suma de los números es: " + retorno);
                    break;

                case 2:
                    retorno = restar(num1, num2);
                    System.out.println("La resta de los números es: " + retorno);
                    break;

                case 3:
                    retorno = multiplicar(num1, num2);
                    System.out.println("La multiplicación de los número es: " + retorno);
                    break;

                case 4:
                    retorno = dividir(num1, num2);
                    System.out.println("La división de los números es: " + retorno);
                    break;
            }
        } while (opc != 5);
        
        System.out.println("[SALIENDO DEL PROGRAMA...]");
    }
    
    //MÉTODOS-----------------------------------------------------------------------------
    public static int sumar(int num1, int num2) {
        int suma = num1 + num2;
        return suma;
    }

    public static int restar(int num1, int num2) {
        int resta = num1 - num2;
        return resta;
    }

    public static int multiplicar(int num1, int num2) {
        int mult = num1 * num2;
        return mult;
    }

    public static int dividir(int num1, int num2) {
        int div = num1 / num2;
        return div;
    }
}


