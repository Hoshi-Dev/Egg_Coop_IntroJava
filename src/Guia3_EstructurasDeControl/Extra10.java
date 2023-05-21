package Guia3_EstructurasDeControl;

import java.util.Scanner;

/*
 * @author Andrea Báez

Realice un programa para que el usuario adivine el resultado de una
multiplicación entre dos números generados aleatoriamente entre 0 y 10.
El programa debe indicar al usuario si su respuesta es o no correcta. En
caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.

 */
public class Extra10 {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        int num1, num2, resultado, respuesta, intentos;

        num1 = (int) ((Math.random() * 10) + 1);
        num2 = (int) ((Math.random() * 10) + 1);
        resultado = num1 * num2;
        intentos = 0;

        System.out.println("[ADIVINA ADIVINADOR]"
                + "\nIngrese el resultado de multiplicar: " + num1 + " * " + num2);

        do {
            respuesta = read.nextInt();

            intentos++;
            
            if (resultado == respuesta) {
                System.out.println("[CORRECTO] Adivinaste");
                break;
            } else {
                System.out.println("[INCORRECTO]");
            }

        } while (intentos < 3);

        if (intentos == 3) {
            System.out.println("Se ha quedado sin intentos.");
        }

    }

}
