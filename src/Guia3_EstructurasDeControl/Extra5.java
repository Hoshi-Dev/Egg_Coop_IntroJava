package Guia3_EstructurasDeControl;

import java.util.Scanner;

/*
 * @author Andrea Báez

Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento 
en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento 
para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben 
descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego 
un valor real que represente el costo del tratamiento (previo al descuento) 
y determine el importe en efectivo a pagar por dicho socio.


 */
public class Extra5 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        //Declaramos variables
        int opc;
        int valor = 0, valorFinal = 0;

        
        //El "do/while" nos permite repetir el menú hasta que se cumpla la condición
        do {

            System.out.println("[MENÚ DE INGRESO DE SOCIO]"
                    + "\n[*] Indique el tipo de socio:"
                    + "\n[1] Socio tipo A."
                    + "\n[2] Socio tipo B."
                    + "\n[3] Socio tipo C."
                    + "\n=========================="
                    + "\n[4] SALIR");
            opc = read.nextInt();

            switch (opc) {

                case 1:
                   
                    System.out.println("Ingrese el valor del tratamiento: ");
                    valor=read.nextInt();
                    
                    valorFinal = valor - (valor * 50 / 100);
                    
                    System.out.println("El valor final del socia A es de: $" + valorFinal);
                    break;
                    
                case 2:
                    
                    System.out.println("Ingrese el valor del tratamiento: ");
                    valor=read.nextInt();
                    
                    valorFinal = valor - (valor * 35 / 100);
                    
                    System.out.println("El valor final del socia B es de: $" + valorFinal);
                    break;
                    
                case 3:
                    
                    System.out.println("Ingrese el valor del tratamiento: ");
                    valor=read.nextInt();
                    
                    System.out.println("El socio C no recibe descuento.");
                    break;

                default:
                    if (opc != 4) {
                    System.out.println("Ha ingresado una opción inválida.");
                        
                    }
            }

        } while (opc != 4);

        System.out.println("[SALIENDO DEL SISTEMA...]");
    }

}
