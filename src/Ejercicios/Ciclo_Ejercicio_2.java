/*
Leer un numero y mostrar su cuadrado, repetir el proceso hasta que se introduzca un numero negativo
 */

package Ejercicios;

import java.util.Scanner;

public class Ciclo_Ejercicio_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, resultado;

        System.out.println("Diguite un numero: ");
        numero = entrada.nextInt();

        while (numero >= 0){
            resultado = (int)Math.pow(numero,2);
            System.out.println("El numero que ingresaste al cuadrado es: \n" + resultado);

            System.out.print("Ingresa otro número (o un número negativo para terminar): ");
            numero = entrada.nextInt();
        }
    }
}
