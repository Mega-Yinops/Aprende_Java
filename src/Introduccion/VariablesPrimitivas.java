/*
Estas variables solo alamcenan numero enteros
    Nombre      Tamaño    Rango
    long        64        - 9,223,372,036,,854,775,808 a 9,223,372,036,,854,775,808
    int         32        - 2,147,483,648 a 2,147,483,648
    short       16        - 32,768 a 32,768
    byte        8         - 128 a 128

Estas variable pueden almacenar numeros decimales
    Nombre     Tamaño     Rango
    doble      64         4.9e-324 a 1.8e+308
    float      32         1.4e-045 a 3.4e+038

Estas variables pueden almacenar carater
    Nombre      Tamaño   Rango
    char         1       A-Z , 0-9

Estas variables son buleanas
    Nombre      Tamaño   Rango
    boolean     1        True o false
 */

package Introduccion;

import java.sql.SQLOutput;

public class VariablesPrimitivas {
    public static void main(String[] args) {

        //Variables enteros
        long valorA = 14788152;
        System.out.println("El valor del numero long es: " + valorA);

        int valorB = 485548;
        System.out.println("El valor del numero entero es: " + valorB);

        short valorC = 1254;
        System.out.println("El valor del numero short es: " + valorC);

        byte valorD = 58;
        System.out.println("El valor del numero byte es: " + valorD);

        //Variables decimales
        float ValorD1 = 3.1416F; // Siempre agregar F al final del valor
        System.out.println("El valor del float decimal es: " + ValorD1);

        double ValorD2 = -3.1415587;
        System.out.println("El es el valor de double decimal es: " + ValorD2);

        //Variables Caracter
        char caracter = 'a';
        System.out.println("El valor del caracter es: "+ caracter);

        //Variables de tipo boleana
        boolean decision = false;
        System.out.println("La decision es: " + decision);
    }
}
