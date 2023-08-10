/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade02;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Construcao {
    public static void main(String[] args) {
        /*
    Crie um programa para calcular o valor a ser pago para construção de uma 
    planta de um imóvel, o programa deve receber as informações de largura e comprimento do terreno, 
    utilize a tabela abaixo para calcular o valor final:
    Área total              Valor por m²
    até 250m²               R$ 8,50
    até 350m²               R$ 9,50
    acima de 350m²          R$ 11,50
        */
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor da largura em metros: ");
        double largura = scanner.nextDouble();
        
        System.out.println("Digite o comprimento do terreno: ");
        double comprimento = scanner.nextDouble();
        
        scanner.close();
        
        double area = largura*comprimento;
        
        if (area <= 250) {
            double valorM = 8.50;
            double total1 = area* valorM;
            System.out.println("Area: " + area);
            System.out.println("Valor por m^2: " + valorM);
            System.out.println("Total: " + total1);
        }
        else if (area <= 350){
            double valorM = 9.50;
            double total = area* valorM;
            System.out.println("Area: " + area);
            System.out.println("Valor por m^2: " + valorM);
            System.out.println("Total: " + total);
        }
        else if (area > 350){
            double valorM = 11.50;
            double total = area* valorM;
            System.out.println("Area: " + area);
            System.out.println("Valor por m^2: " + valorM);
            System.out.println("Total: " + total);
        }
        else {
            System.out.println("Valor invalido.");
        }
    }
}
