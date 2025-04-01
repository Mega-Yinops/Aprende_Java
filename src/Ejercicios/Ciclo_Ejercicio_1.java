/*
    Ejercicio 1:
    Leer un numero y mostrar su cuadrado, repetir el proceso hasta que se introduza un numero negatico
 */

package Ejercicios;

import java.util.Scanner;

public class Ciclo_Ejercicio_1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double numero, resultado;

        System.out.println("Escribe un numero mostrara su cudrado \n " +
                "Terminara hasta que ingreses un numero negativo: ");
        numero = entrada.nextDouble();

        while (numero > 0) {
            resultado = (int) Math.pow(numero, 2);
            System.out.println("El numero que ingresaste al cuadrado es: \n" + resultado);

            System.out.print("Ingresa otro número (o un número negativo para terminar): ");
            numero = entrada.nextInt();
        }
    }
}