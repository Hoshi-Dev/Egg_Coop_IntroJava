package Guia3_EstructurasDeControl;

/*
 * @author Andrea Báez

Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
números del 0-0-0 al 9-9-9, con la particularidad que cada vez que
aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.

 */
public class Extra12 {

    public static void main(String[] args) {

        String n1, n2, n3;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {

                    //El "if" Va a validar y concatenar los valores de i, j y k en las variables de tipo String
                    if (i == 3) {
                        n1 = "E";
                    } else {
                        n1 = String.valueOf(i); //usamos esta funcion para convetir un int en String
                    }

                    if (j == 3) {
                        n2 = "E";
                    } else {
                        n2 = String.valueOf(j);
                    }

                    if (k == 3) {
                        n3 = "E";
                    } else {
                        n3 = String.valueOf(k);
                    }

                    System.out.println(n1 + "-" + n2 + "-" + n3);
                }

            }
        }

    }

}
