/*
Condiciones multiples o Switch Case

switch (dato)
    case 1: Instrucciones1;
            break;
    case 2: Instrucciones2;
            break;
    .......
    case n:
            InstruccionesN;
            break;
    default: CasoContrario;
            break:
 */
package Condicionales;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dato;

        System.out.println("Digita una opcion entre 1-5");
        dato = entrada.nextInt();

        switch (dato){
            case 1:
                System.out.println("Esta opcion es la uno");
                break;
            case 2:
                System.out.println("Esta opcion es la dos");
                break;
            case 3:
                System.out.println("Esta opcion es la tres");
                break;
            case 4:
                System.out.println("Esta opcion es la cuatro");
                break;
            case 5:
                System.out.println("Esta opcion es la cinto");
                break;
            default :
                System.out.println("El numero no esta en el rango del 1 al 5");
        }
    }
}
