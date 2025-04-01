/*
    Ciclo While

    while(condicion){
        Instrucciones;
   }

 */
package Condicionales;

import java.util.Scanner;

public class Ciclo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int i = 1;
        //Mientras i sea menor de 10 imprime i, i aumenta 1 el valor de 1
        while (i<=10){
            System.out.println(i);
            i++;
        }

        //Forma decendente de x
        int x = 10;
        while (x >= 1){
            System.out.println(x);
            x--;
        }

        //
        int contador;
        System.out.println("Cuantos numeros quieres ver en pantalla: ");
        contador = entrada.nextInt();

        while (i<=contador){
            System.out.println(i);
            i++;
        }

    }
}
