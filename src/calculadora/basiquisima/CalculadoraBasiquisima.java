/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora.basiquisima;

import java.util.Scanner;

/**
 *
 * @author G513
 */
public class CalculadoraBasiquisima {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora Simple");
        System.out.println("Ingrese el primer número:");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double num2 = scanner.nextDouble();

        System.out.println("Seleccione la operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + sumar(num1, num2));
                break;
            case 2:
                System.out.println("Resultado: " + restar(num1, num2));
                break;
            case 3:
                System.out.println("Resultado: " + multiplicar(num1, num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado: " + dividir(num1, num2));
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Opción no válida");
        }
    }

    // Funciones de operaciones
    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {

        return a / b;

    }

}


