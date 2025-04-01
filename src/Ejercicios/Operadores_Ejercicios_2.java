package Ejercicios;
/*
Hacer un programa que calcule e imprima el salario semanal de un empleado a partir de sus horas semanales trabajadas
 */

import java.util.Scanner;

public class Operadores_Ejercicios_2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double pago, Psemnal;
        int dia;

        System.out.println("Calcularemos tu slario semnal \n " +
                "Ingresa tu paga por hora");
        pago = entrada.nextDouble();

        System.out.println("Suponiendo que trabajaste 8 horas al dia \n" +
                "Cuantos dias has trabajo?");
        dia = entrada. nextInt();

        Psemnal = pago * dia;

        System.out.println("Tu paga a la semana es: " + Psemnal);
    }
}
