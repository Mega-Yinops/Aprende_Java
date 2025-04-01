/*
    Ciclo for

    for (inicializacion; condicion; aumento o decremento){
    Instrucciones;

 */

package Condicionales;

import java.util.Scanner;

public class CicloFor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        for (int i = 10; i>0; i--){
            System.out.println(i);
        }

        int contador;
        System.out.println("Digite la cantidad de terminos: ");
        contador = entrada.nextInt();

        for (int i = 1; i <=contador; i ++){
            System.out.println(i);
        }


    }
}
