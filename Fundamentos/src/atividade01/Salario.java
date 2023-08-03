/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade01;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Salario {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu salario:");
        double salario = scanner.nextDouble();
        
        scanner.close();
        
        if (salario > 1350.0) {
            salario = salario + (salario*0.10);
        }
        else {
            salario = salario + (salario*0.15);
        }
        
        System.out.println("Salario com aumento:" + salario);
    }
}
