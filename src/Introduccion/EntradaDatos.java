package Introduccion;
import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Entrada de dato entera
        int numero;
        System.out.print("Diguite un numero entero: ");
        numero = entrada.nextInt();

        //Entrada de dato flotante
        float numero1;
        System.out.print("Digite un numero flotante: ");
        numero1 = entrada.nextFloat();

        //Entrada de dato double
        double n2;
        System.out.print("Digite un numero double: ");
        n2 = entrada.nextDouble();

        //Entrada de cadena guardando solo la primera palabra
        String cadena;
        System.out.print("Digite una cadena: ");
        cadena = entrada.next();

        //Entrada de cadena guardando toda la palabra
        String cadena1;
        System.out.print("Digite una cadena: ");
        cadena1 = entrada.nextLine();

        //Entrada de cadena guardando solo un caracter
        char letra;
        System.out.println("Digite una letra: ");
        letra = entrada.next().charAt(0);


        //Imprecion de los tipos de datos.
        System.out.println("El  numero entero dice: " + numero);
        System.out.println("El numero flotante es: " + numero1);
        System.out.println("El numero double es: " + n2);
        System.out.println("La palabra de la cadena es: " + cadena);
        System.out.println("La palabra de la cadena es: " + cadena1);
        System.out.println("La letra es; "+ letra);
    }
}
