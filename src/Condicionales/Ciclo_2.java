/*
    Ciclo do while

    do {
            Instrucciones;
    } while (condicion);

 */
package Condicionales;

import java.util.Scanner;

public class Ciclo_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i = 1, contador;

        System.out.println("Digite la cantidad de terminos: ");
        contador = entrada.nextInt();

        do {
            System.out.println(i);
            i++;
        }while (i <= contador);

        //Aqui tenemos como podemos ver el avance de 3 en 3
        System.out.println("Ingresa la cantidad de terminos para hacer el ciclo de 3 en 3");

        int x = 0, contador1;

        System.out.println("Digite la cantidasd de terminos");
        contador1 = entrada.nextInt();

        do {
            System.out.println(x);
            x += 3;
        } while (x <= contador1);
    }
}
