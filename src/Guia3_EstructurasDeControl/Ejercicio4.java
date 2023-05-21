
package Guia3_EstructurasDeControl;

import java.util.Scanner;

/*
 * @author Andrea Báez
 * 
 * Escriba un programa que pida una frase o palabra y valide si la primera 
 * letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
 * imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, 
 * se deberá imprimir “INCORRECTO”. 
 * Nota: investigar la función Substring y equals() de Java
 */
public class Ejercicio4 {

    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        //Declaramos variables
        String frase;
        String letra;
        
        //Pedimos datos e inicializamos variables
        System.out.println("Ingrese una frase o palabra que comience con ¨a¨ ");
        frase = read.nextLine();
        
        //Esta funcion extrae el primer carácter de la cadena
        letra = frase.substring(0, 1);
        
        //Usamos un "if/else" para validar 
        if (letra.equalsIgnoreCase("a")) {
            System.out.println("[CORRECTO]");
        } else {
            System.out.println("[INCORRECTO]");
        }
    }

}
