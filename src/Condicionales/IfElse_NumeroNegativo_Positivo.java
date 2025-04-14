package Condicionales;
/*

 */

import java.util.Scanner;

public class IfElse_NumeroNegativo_Positivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Inicializamos el scanner

        // Definición de colores
        String rojo          = "\u001b[31m";
        String verde         = "\u001b[32m";
        String amarillo      = "\u001b[33m";

        String respuesta;

        System.out.print("Por favor, introduce un número entero: ");
        int x = scanner.nextInt(); // Leemos el número entero

        if (x < 0) {
                System.out.println(rojo + "El número introducido es negativo.");
            } else {
                System.out.println(verde + "El número introducido es positivo.");
        }

        scanner.close(); // Cerramos el scanner para evitar fugas de recursos
    }
}