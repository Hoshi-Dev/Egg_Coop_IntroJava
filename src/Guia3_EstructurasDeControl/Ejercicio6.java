package Guia3_EstructurasDeControl;

import java.util.Scanner;

/*
 * @author Andrea Báez

Realizar un programa que pida dos números enteros positivos por teclado 
y muestre por pantalla el siguiente menú:El usuario deberá elegir una 
opción y el programa deberá mostrar el resultado por pantalla y 
luego volver al menú. El programa deberá ejecutarse hasta que se elija 
la opción 5. Tener en cuenta que, si el usuario selecciona la opción 5,
en vez de salir del programa directamente, se debe mostrar el siguiente 
mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? 
Si el usuario selecciona el carácter ‘S’ se sale del programa, 
caso contrario se vuelve a mostrar el menú.

 */
public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        //Declaramos variables
        int n1, n2, opc;
        boolean salir = true;
        String resp;

        //Pedimos datos e inicializamos variables
        System.out.println("Ingrese dos números enteros positivos:");
        n1 = read.nextInt();
        n2 = read.nextInt();

        //Usamos un "do/while" para repetir el menú hasta que la condicion cambie
        do {
            System.out.println("Ingrese la operación que desea realizar:"
                    + "\n[1] Suma"
                    + "\n[2] Resta"
                    + "\n[3] Multiplicación"
                    + "\n[4] División"
                    + "\n[5] SALIR");
            opc = read.nextInt();

            //usamos un "switch" para realizar las operaciones segun la respuesta
            switch (opc) {
                case 1:
                    System.out.println("La suma es: " + (n1 + n2));
                    break;

                case 2:
                    System.out.println("La resta es: " + (n1 - n2));
                    break;

                case 3:
                    System.out.println("La multiplicacion es: " + (n1 * n2));
                    break;

                case 4:

                    //Anteponemos (double) ya que la división podría devolver un decimal
                    System.out.println("La division es: " + (double) n1 / n2);
                    break;
                case 5:
                    System.out.println("Estas seguro que deseas salir del programa? S/N");
                    resp = read.next();

                    //El "if"valida la respuesta y cambia "salir" a falso
                    if (resp.equalsIgnoreCase("s")) {
                        salir = false;
                        System.out.println("[SALIENDO...]");
                    }
            }
        } while (salir);

    }

}
