/*
 La sentencia If

 if (Condicion) {
        Instruccion1;
 }
 else {
    Instruccion2;
 }
 */
package Condicionales;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, numero1, dato = 5;

        System.out.println("Diguite un numero: ");
        numero = entrada.nextInt();

        if (numero == dato){ // Si el numero es igual a 5
            System.out.println("El numero es 5");
        }
        else {
            System.out.println("El numero es diferente a 5");
        }

        System.out.println("Diguite un numero: ");
        numero1 = entrada.nextInt();

        if (numero1 != dato){ //Si el numero es diferente a 5
            System.out.println("El numero es diferen 5");
        }
        else {
            System.out.println("El numero es igual a 5");
        }
    }
}

