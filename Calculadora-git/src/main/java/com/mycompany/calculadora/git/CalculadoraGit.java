/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora.git;

/**
 *
 * @author Alumnado
 */
import java.util.Scanner;

public class CalculadoraGit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        double num1 = sc.nextDouble();
        
        System.out.println("Introduce el segundo numero: ");
        double num2 = sc.nextDouble();
        
        System.out.println("Selecciona un signo para operar: +, -, *, /");
        char operation = sc.next().charAt(0);
        
        double result = 0;
        
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error Division por 0.");
                    return;
                }
                break;
            default:
                System.out.println("Operacion invalida.");
                return;
        }
        
        System.out.println("Resultado: " + result);
    }
}
