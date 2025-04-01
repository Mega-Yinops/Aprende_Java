/*
La clase Math

La clase Math en Java es parte del paquete java.lang y proporciona métodos estáticos para realizar operaciones
matemáticas comunes. Esta clase incluye funciones para trigonometría, logaritmos, raíces, exponenciales y redondeo,
entre otras.

 */
package Operadores;

public class CalseMath {

    public static void main(String[] args) {
        // Constantes

        //Math.PI: Representa el valor de π (pi).
        System.out.println("Valor de PI: " + Math.PI);
        //Math.E: Representa el valor de e (la base de los logaritmos naturales).
        System.out.println("Valor de e: " + Math.E);

        // Aritmética

        //Math.abs(x): Devuelve el valor absoluto de x.
        System.out.println("Valor absoluto de -5: " + Math.abs(-5));
        //Math.max(a, b): Devuelve el valor máximo entre a y b.
        System.out.println("Máximo entre 10 y 20: " + Math.max(10, 20));
        //Math.min(a, b): Devuelve el valor mínimo entre a y b.
        System.out.println("Mínimo entre 10 y 20: " + Math.min(10, 20));
        //Math.sqrt(x): Devuelve la raíz cuadrada de x.
        System.out.println("Raíz cuadrada de 16: " + Math.sqrt(16));

        // Trigonometría
        //
        double angulo = Math.PI / 4; // 45 grados en radianes
        //Math.sin(x): Devuelve el seno de x (x en radianes).
        System.out.println("Seno de 45 grados: " + Math.sin(angulo));
        //Math.cos(x): Devuelve el coseno de x.
        System.out.println("Coseno de 45 grados: " + Math.cos(angulo));
        //Math.tan(x): Devuelve la tangente de x.
        System.out.println("Tangente de 45 grados: " + Math.tan(angulo));

        // Exponenciales y Logaritmos
        //Math.exp(x): Devuelve e elevado a la potencia de x.
        System.out.println("e^2: " + Math.exp(2));
        //Math.log(x): Devuelve el logaritmo natural de x.
        System.out.println("Logaritmo natural de 10: " + Math.log(10));
        //Math.log10(x): Devuelve el logaritmo en base 10 de x.
        System.out.println("Logaritmo en base 10 de 100: " + Math.log10(100));

        // Redondeo
        //Math.round(x): Redondea x al entero más cercano.
        System.out.println("Redondeo de 5.3: " + Math.round(5.3));
        //Math.ceil(x): Redondea x hacia arriba al entero más cercano.
        System.out.println("Ceil de 5.3: " + Math.ceil(5.3));
        //Math.floor(x): Redondea x hacia abajo al entero más cercano.
        System.out.println("Floor de 5.7: " + Math.floor(5.7));
    }
}
