package Guia4_Subprogramas;

import java.util.Scanner;

/*
 * @author Andrea Báez

Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
i. * 0.86 libras es un 1 €
ii. * 1.28611 $ es un 1 €
iii. * 129.852 yenes es un 1 €


 */
public class Ejercicio3 {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        int cantidad;
        String moneda;

        System.out.println("[Bienvenido al sistema de cambio de divisas]"
                + "\nIngrese la cantidad de euros a covertir:");
        cantidad = read.nextInt();

        System.out.println("Indique a qué moneda desea covertirla: Dolares, Yenes o Libras");
        moneda = read.next().toLowerCase();

        conversor(cantidad, moneda);
    }

    public static void conversor(int cantidad, String moneda) {

        double cambio;

        switch (moneda) {
            case "dolares":
                cambio = cantidad * 1.28611;
                System.out.println("El equivalente en Dólares es: U$D" + cambio);
                break;
            case "libras":
                cambio = cantidad * 0.86;
                System.out.println("El equivalente en Libras es: £" + cambio);
                break;
            case "yenes":
                cambio = cantidad * 129.852;
                System.out.println("El equivalente en Yenes es: ¥" + cambio);
                break;
            
        }
    }
}
