/*
Incremento / Decremento
 */
package Operadores;

public class Incremento_Decremento {
    public static void main(String[] args) {
        int x= 5, y = 5;

        x ++;  // x += 1; Incremnto
        y --; // x -= 1; Decremento

        System.out.println("El valor inicial es: 5 ");
        System.out.println("Con el incremto es: " + x);
        System.out.println("Con el decremento es: "+ y);
/*
Ejemplo de logica dentro del lenguaje:
*/
        int a = 10, b;

        // Sufijo - Primero asignamos el valor de 10 a 'b' y despues se crea el decremento
        //b = x ++;

        // Prefijo - Primero hacemos el aumento y despues asignamos
        b = ++x;

        System.out.println("El valor de a es: " + a );
        System.out.println("El valor de b es: " + b );

    }
}