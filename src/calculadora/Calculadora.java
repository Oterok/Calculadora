/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.InputMismatchException;
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
        float numero1 = 0, numero2 = 0, resultado = 0;
        int opcion = 1;

        System.out.println("Para empezar introduzca dos numeros:");

        numero1 = escribirNum();

        numero2 = escribirNum();

        while (opcion != 0) {
            System.out.println("---------------------------------\n\n"
                    + "Que quiere hacer (escriba solo el numero):\n"
                    + "0.- Salir.\n"
                    + "1.- Sumar.\n"
                    + "2.- Restar.\n"
                    + "3.- Multiplicar.\n"
                    + "4.- Dividir.\n");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    resultado = suma(numero1, numero2);
                    break;
                case 2:
                    resultado = restar(numero1, numero2);
                    break;
                case 3:
                    resultado = mutiplicar(numero1, numero2);
                    break;
                case 4:
                    resultado = dividir(numero1, numero2);
                    break;
            }
            if (opcion != 0) {
                System.out.println("El resultado es: " + resultado);
            }
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

    private static float dividir(float a, float b) {
        if (b == 0) {
            System.out.println("No es pot dividir per 0.");
        }
        return a / b;
    }

    private static float escribirNum() {
        Scanner sc = new Scanner(System.in);
        float num = 0;
        try {
            System.out.print("Escribir numero: ");
            num = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Lo sentimos el valor ingresado no es valido, verifique");
            escribirNum();
        }

        return num;
    }
}
