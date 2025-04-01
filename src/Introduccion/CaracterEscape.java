/*
    \t          Tabulador
    \b          Retroceso
    \n          Nueva Linea
    \r          Retorno
    \f          Salto de pagina
    \'          Comilla Simple
    \"          Comilla doble
    \\          Barra invertida
 */
package Introduccion;

public class CaracterEscape {
    public static void main(String[] args) {

        // \t abulador - da un pequeño espacio
        System.out.println("Nombre:\tJaciel");

        // \b Retroceso - elimina un caracter anterior
        System.out.println("Nombre:\b Jaciel");

        // \n Nueva Linea - imprimira en Jaciel en la linea de abajo
        System.out.println("Nombre:\n Jaciel");

        // \r Retorno - Imprimira Jaciel sobrescribiendo Nombre:
        System.out.println("Nombre:\r Jaciel");

        // \f Salto de pagina - Imprimira Nombre en una linea y jaciel en otra
        System.out.println("Nombre:\f Jaciel"); // Puede no mostrar un efecto visible en algunas consolas

        // \' Comilla simple - Imprimira Jaciel's
        System.out.println("Nombre: Jaciel\'s");

        // \" Comilla simple - Imprimira "Jaciel"
        System.out.println("Nombre: \"Jaciel\"");

        // \\ Se usa principal mente para marcar una ruta
        System.out.println("Ruta: C:\\Archivos\\MiArchivo.txt"); // Imprimirá: Ruta: C:\Archivos\MiArchivo.txt

    }
}
