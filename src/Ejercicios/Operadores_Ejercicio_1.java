package Ejercicios;
import java.util.Scanner;

/*
Hacer un pograma que calcule e imprima la suma de tres calificaciones
 */
public class Operadores_Ejercicio_1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double C1, C2, C3, Cfinal;

        System.out.println("Ingresa tres calificaciones, te dare la suma de ellas \n" +
                "Ingresa la primera calificacion");
        C1 = entrada.nextDouble();

        System.out.println("Ingresa la segunda calificacion");
        C2 = entrada.nextDouble();

        System.out.println("Ingresa la tercera calificacion");
        C3 = entrada.nextDouble();

        Cfinal = C1 + C2 + C3;

        System.out.println("La suma de estas calificaciones es: " + Cfinal);
    }
}
