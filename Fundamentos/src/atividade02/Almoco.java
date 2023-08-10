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
public class Almoco {

    public static void main(String[] args) {
        /*
    Crie um programa que calcule o preço para o almoço com seus colegas de classe, 
    o programa deve perguntar ao usuário qual prato ele deseja e a quantidade, 
    neste exemplo vamos considerar que todos vão comer o mesmo prato.

    Prato                                  Opção             Valor
    Arroz, feijão, bife acebolado            1             R$ 19,99
    Arroz, feijão, filé de frango            2             R$ 18,99
    Arroz, feijão, brajola                   3             R$ 23,99
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o prato que deseja (1, 2 ou 3): ");
        int prato = scanner.nextInt();

        System.out.println("Digite a quantidade: ");
        int qtdade = scanner.nextInt();

        scanner.close();
        
        switch (prato) {
            case 1:
                double valor1 = 19.99;
                double total1 = valor1*qtdade;
                System.out.println("Elementos do prato: Arroz, feijao, bife acebolado");
                System.out.println("Valor unidade: " + valor1);
                System.out.println("Total: " + total1);
                break;
            case 2:
                double valor2 = 18.99;
                double total2 = valor2*qtdade;
                System.out.println("Elementos do prato: Arroz, feijao, file de frango");
                System.out.println("Valor unidade: " + valor2);
                System.out.println("Total: " + total2);
                break;
            case 3:
                double valor3 = 23.99;
                double total3 = valor3*qtdade;
                System.out.println("Elementos do prato: Arroz, feijao, brajola");
                System.out.println("Valor unidade: " + valor3);
                System.out.println("Total: " + total3);
                break;
            default:
                System.out.println("Prato invalido");;
        }

    }
}
