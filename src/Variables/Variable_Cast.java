/*
El casting explícito con (double) asegura que la división se haga en tipo flotante, preservando los decimales. Sin casting, la división entre enteros pierde los decimales.
 */
package Variables;

public class Variable_Cast {
    public static void main(String[] args) {
        int x = 2;
        int y = 9;
        double division, division1;

        division = (double)y / (double)x;
        division1 = y / x;

        // observa la diferencia.
        System.out.println("El resultado de la división es " + division);
        System.out.println("El resultado de la división casteada es " + division1);
    }
}
