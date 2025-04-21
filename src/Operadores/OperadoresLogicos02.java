package Operadores;

/*
 * Operadores lógicos
 *
 * AND lógico: &&
 * OR lógico: ||
 * NOT lógico: !
 *
 * AND lógico: verdadero si ambos son verdaderos
 * OR lógico: verdadero si al menos uno es verdadero
 * NOT lógico: invierte el valor de verdad
 */

public class OperadoresLogicos02 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a && b = " + (a && b));
        System.out.println("a || b = " + (a || b));
        System.out.println("!a = " + !a);
        System.out.println("a || (6 > 10) = " + (a || (6 > 10)));
        System.out.println("((4 <= 4) || false) && (!a) = " + (((4 <= 4) || false) && (!a)));
    }
}

