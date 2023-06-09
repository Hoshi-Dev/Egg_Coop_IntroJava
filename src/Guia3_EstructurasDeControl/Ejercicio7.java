package Guia3_EstructurasDeControl;

import java.util.Scanner;

/*
 * @author Andrea Báez

Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
este tipo de dispositivo lee cadenas enviadas por el usuario. 
Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo 
de 5 caracteres de largo, el primer carácter tiene que ser X y el último 
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, 
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), 
y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de 
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio deberá 
investigar cómo se utilizan las siguientes funciones de Java 
Substring(), Length(), equals().

 */
public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        //Declaramos variables
        String cadena;
        int corr = 0, inco = 0;
        String result;

        //El "do/while" nos permite realizar la iteracion hasta que la condicion se cumpla
        System.out.println("Ingrese una frase de 5 caracteres:");
        do {
            cadena = read.next();

            if (cadena.length() == 5 && cadena.charAt(0) == 'x' && cadena.charAt(4) == 'o') {
                corr++;
            } else {
                inco++;
            }

        } while (!"&&&&&".equals(cadena));

        System.out.println("[Cadenas correctas]: " + corr
                + "\n[Cadenas incorrectas]: " + (inco - 1));
    }

}
