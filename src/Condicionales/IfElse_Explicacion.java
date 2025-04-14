/*
if (condición) {
    instrucciones a ejecutar si la condición es verdadera
} else {
    instrucciones a ejecutar si la condición es falsa
}
*/

package Condicionales;

import java.util.Scanner;

public class IfElse_Explicacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Se utiliza Scanner para leer la entrada
        System.out.print("¿Cuál es la capital de Kiribati? ");
        String respuesta = scanner.nextLine(); // Leer la entrada del usuario
        if (respuesta.equalsIgnoreCase("Tarawa") || // Se utiliza
                respuesta.equalsIgnoreCase("South Tarawa") ||
                respuesta.equalsIgnoreCase("Bairiki")) {
            System.out.println("¡La respuesta es correcta!");
        } else {
            System.out.println("Lo siento, la respuesta es incorrecta.");
        }
        scanner.close(); // Cerramos el Scanner para liberar recursos
    }
}
