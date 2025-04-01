/*
Operadores aritmeticos combinadaos con asignacion
 */

package Operadores;

public class OperadoresCombinados {
    public static void main(String[] args) {

        //Forma de operador combinado para la suma
        int n1 = 10;
        n1 = n1 + 10; //esto es una expresion demasiada larga
        n1 += 5; //Esto es una expresion mas sencilla a esto se llema conbinacion de operadores.

        //Forma de operador combinado para la resta
        int n2 = 5;
        n2 -= 5;

        //Forma de operador combinado para division
        int n3 = 10;
        n3 /= 2;

        //Forma de operador combinado para multiplicacion
        int n4 = 8;
        n4 *= 2;

        //Forma de operador combinado para el Resto
        int n5 = 10;
        n5 %= 2;

        System.out.println("La suma es: " + n1);
        System.out.println("La resta es: " + n2);
        System.out.println("La division es: " + n3);
        System.out.println("La multiplicacion es: " + n4);
        System.out.println("El resto es: " + n5);
    }
}
