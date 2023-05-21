
package Guia3_EstructurasDeControl;

import java.util.Scanner;

/*
 * @author Andrea Báez

Dado un tiempo en minutos, calcular su equivalente en días y horas. 
Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular 
su equivalente: 1 día, 2 horas.

 */
public class Extra1 {

    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        int dias, horas, min;
        
        System.out.println("Ingrese el tiempo en minutos:");
        min = read.nextInt();
        
        
        dias = min / 1440; // 1440 minutos en un día
        horas = (min % 1440) / 60; // 60 minutos en una hora
        
        
        System.out.println("El equivalente de " +min + " es: " + dias + " días y " + horas + " horas." );
    }

}
