package Operadores;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OpeLogicoAdivinaNum {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Definición de códigos de escape ANSI para colores en la consola
        String rojo = "\u001b[31m";
        String verde = "\u001b[32m";
        String amarillo = "\u001b[33m";

        // Número secreto que el usuario debe adivinar
        int numeroSecreto = 24, numero = 0;

        System.out.println(amarillo + "¡Bienvenido al juego de adivinar el número!");
        System.out.println("Introduce un número entre 1 y 100.");

        // Bucle para validar el rango y adivinar el número
        while (true) {
            try {
                System.out.print("Introduce un número: ");
                numero = entrada.nextInt();

                if (numero < 1 || numero > 100) {
                    System.out.println(rojo + "El número debe estar en el rango de 1 a 100. Inténtalo de nuevo.");
                } else if (numero != numeroSecreto) {
                    System.out.println(rojo + "Lo siento, ese no es el número que estoy pensando. Inténtalo de nuevo.");
                } else {
                    break; // Salir del bucle si el número es correcto
                }
            } catch (InputMismatchException e) {
                System.out.println(rojo + "Entrada no válida. Por favor, introduce un número entero.");
                entrada.nextLine(); // Limpiar el buffer
            }
        }

        System.out.println(verde + "¡En hora buena!, ¡has acertado!");
        entrada.close();
    }
}