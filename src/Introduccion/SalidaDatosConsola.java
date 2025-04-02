package Introduccion;

/*
 * Aquí podemos ver la salida de datos por medio de colores.
 * Esto es útil para hacer más vistosa la consola.
 * Más adelante, lo usaremos para ver los logs del proyecto por medio de colores.
 */

public class SalidaDatosConsola {
    public static void main(String[] args) {

        // Definición de colores
        String rojo          = "\u001b[31m";
        String verde         = "\u001b[32m";
        String amarillo      = "\u001b[33m";
        String azul          = "\u001b[34m";
        String morado        = "\u001b[35m";
        String cian          = "\u001b[36m";
        String blanco        = "\u001b[37m";
        String gris          = "\u001b[90m";
        String negro         = "\u001b[30m";
        String purpura       = "\u001b[95m";
        String rojoClaro     = "\u001b[91m";
        String verdeClaro    = "\u001b[92m";
        String amarilloClaro = "\u001b[93m";
        String azulClaro     = "\u001b[94m";
        String moradoClaro   = "\u001b[95m";
        String cianClaro     = "\u001b[96m";
        String blancoClaro   = "\u001b[97m";
        String reset         = "\u001b[0m"; // Para resetear el color al predeterminado

        // Ejemplos de uso de colores en la consola
        System.out.println(verde + "Este es un mensaje de información en color verde" + reset);
        System.out.println(rojo + "Este es un mensaje de información en color rojo" + reset);
        System.out.println(azul + "Este es un mensaje de información en color azul" + reset);
        System.out.println(amarillo + "Este es un mensaje de información en color amarillo" + reset);
        System.out.println(morado + "Este es un mensaje de información en color morado" + reset);
        System.out.println(cian + "Este es un mensaje de información en color cian" + reset);
        System.out.println(blanco + "Este es un mensaje de información en color blanco" + reset);
        System.out.println(gris + "Este es un mensaje de información en color gris" + reset);
        System.out.println(negro + "Este es un mensaje de información en color negro" + reset);
        System.out.println(purpura + "Este es un mensaje de información en color purpura" + reset);
        System.out.println(rojoClaro + "Este es un mensaje en rojo claro" + reset);
        System.out.println(verdeClaro + "Este es un mensaje en verde claro" + reset);
        System.out.println(amarilloClaro + "Este es un mensaje en amarillo claro" + reset);
        System.out.println(azulClaro + "Este es un mensaje en azul claro" + reset);
        System.out.println(moradoClaro + "Este es un mensaje en morado claro" + reset);
        System.out.println(cianClaro + "Este es un mensaje en cian claro" + reset);
        System.out.println(blancoClaro + "Este es un mensaje en blanco claro" + reset);
    }
}