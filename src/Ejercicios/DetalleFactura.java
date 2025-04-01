/*
Crear una nueva clase con el método main llamada DetalleFactura, se requiere desarrollar un programa que reciba datos de la factura utilizando la clase Scanner de la siguiente manera:

1- Reciba el nombre de la factura o descripción, utilizar método nextLine() para obtener el nombre de la factura con espacios.
2- Reciba 2 precios de productos de tipo double, utilizar método nextDouble() para obtener precios con decimales (,).
3- Calcule el total, sume ambos precios y agregue un valor de impuesto del 19%

Se pide mostrar en un solo String el nombre de la factura, el monto total bruto (antes de impuesto), el impuesto y el monto total neto incluyendo impuesto.

Por ejemplo, el resultado podría ser algo así:

La factura producto de oficina tiene un total bruto de 134.78, con un impuesto de 25.6082 y el monto después de impuesto es de 160.3882

 */
package Ejercicios;

import java.util.Scanner;

public class DetalleFactura {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Definimos las variables
        String Descripcion;
        double P1, P2, total, Impuesto;

        // Llenamos las variables
        System.out.println("Ingresa el nombre o la descripción de la factura: ");
        Descripcion = entrada.nextLine();

        System.out.println("Ingresa el valor bruto del primer producto: ");
        P1 = entrada.nextDouble();

        System.out.println("Ingresa el valor bruto del segundo producto: "); // Cambiado a "segundo"
        P2 = entrada.nextDouble();

        // Realizamos las ecuaciones necesarias
        total = P1 + P2;
        Impuesto = total * 0.19;

        // Impresión por pantalla utilizando caracteres de escape
        System.out.println("La factura: " + Descripcion + " tiene un total bruto de " + total + ", con un impuesto de " + Impuesto);

    }
}
