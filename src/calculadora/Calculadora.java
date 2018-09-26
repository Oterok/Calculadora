/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float primernum, segonnum, resultado = 0;
        int opcion=1;

        System.out.println("Para empezar introduzca dos numeros:");

        System.out.println("1.- : ");
        primernum = sc.nextInt();

        System.out.println("2.- : ");
        segonnum = sc.nextInt();

        while (opcion < 5) {
            System.out.println("Que quiere hacer (escriba solo el numero):\n"
                    + "0.- Salir.\n"
                    + "1.- Sumar.\n"
                    + "2.- Restar.\n"
                    + "3.- Multiplicar.\n"
                    + "4.- Dividir.\n");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    resultado = suma(primernum, segonnum);
                    break;
                case 2:
                    resultado = restar(primernum, segonnum);
                    break;
                case 3:
                    resultado = mutiplicar(primernum, segonnum);
                    break;
            }

            System.out.println("El resultado es: " + resultado);
        }

    }

    private static float suma(float a, float b) {
        return a + b;
    }

    private static float restar(float a, float b) {
        return a - b;
    }
    
    private static float mutiplicar(float a, float b) {
        return a * b;
    }

}
