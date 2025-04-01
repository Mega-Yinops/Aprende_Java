/*
Se llama variable a cualquier dato que podamos modificar dentro del programa

Las constantes no cambian su valor a lo largo del programa y se inicia con final al principio
 */
package Introduccion;

public class Variable {
    public static void main(String[] args) {
         int V1 = 10; // esta es una variable
         final int V2 = 15; //Este una constante

        V1 += 20;

        System.out.println("El valor inicial de la variable es:  10 \n" + "El valor final es: " + V1);
        System.out.println("Sin embargo la constante nunca cambio su valor y siempre fue el mismo: " + V2);
    }
}
