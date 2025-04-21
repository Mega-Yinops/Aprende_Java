package Operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        // Definición de colores
        String rojo          = "\u001b[31m";
        String verde         = "\u001b[32m";
        String amarillo      = "\u001b[33m";

        // Definición de variables
        boolean a = true;
        boolean b = false;

        // Operadores lógicos
        System.out.println(rojo +     "AND , a && b: " + (a && b)); // AND lógico
        System.out.println(verde +    "OR  , a || b: " + (a || b)); // OR lógico
        System.out.println(amarillo + "NOT , !a: " + (!a)); // NOT lógico
    }
}
