/*
Leer numeros hasta que se introduzca un 0. Para cada uno indicar si es par o impar
 */
package Ejercicios;

import java.util.Scanner;

public class Ciclo_Ejercicio_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero, resultado;

        System.out.println("Escribe un numero para decirte si es par o impar \n " +
                "Terminara hasta que ingreses un numero 0: ");
        numero = entrada.nextDouble();

        while (numero != 0) { //Mientras que sea distinto de cero
            if (numero %2 == 0){ //Si el numero es par
                System.out.println("El numero" + numero +"es par");
            }
            else {
                System.out.println("El numero es impar");
            }
            
        }
    }
}
