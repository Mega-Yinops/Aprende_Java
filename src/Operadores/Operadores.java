/*
Los operadores aritmeticos son simbolos que se utilizan para realizar operaciones
+ suma
- resta
* multiplicaion
/ division
% resto o residuo
 */
package Operadores;
import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float n1, n2, suma, resta, mult, div, rest;

        System.out.println("Ingresa 2 numeros cualquiera, explicar los operadores aritmeticos");
        System.out.println("Ingresa el primer numero: ");
        n1 = entrada.nextFloat();

        System.out.println("Ingresa el segundo numero: ");
        n2 = entrada.nextFloat();

        suma = n1 + n2;
        resta = n1 - n2;
        mult = n1 * n2;
        div = n1/n2;
        rest = n1 % n2;

        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("La resta de los numeros " + resta);
        System.out.println("La multriplicacion de los numeros es: " + mult);
        System.out.println("La division de los numeros es: " + div);
        System.out.println("El residuo de los numeros es: " + rest);
    }
}

