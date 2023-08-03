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
public class Emprestimo {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor da casa:");
        double valor = scanner.nextDouble();
        
        System.out.println("Digite seu salario:");
        double salario = scanner.nextDouble();
        
        System.out.println("Digite a quantidade de anos a pagar:");
        int anos = scanner.nextInt();
        
        
        scanner.close();
        
        int meses = anos*12;
        double pagamentoMensal = valor/meses;
        double pagamentoMaximo = (salario*3)/100;
        
        if (pagamentoMensal < pagamentoMaximo) {
            System.out.println("Seu emprestimo esta aprovado!");
            System.out.println("Valor parcela mensal: " + pagamentoMensal);
        }
        else {
            System.out.println("Seu emprestimo foi recusado.");
            System.out.println("O valor passa dos 30% do salario em " + (pagamentoMensal - pagamentoMaximo) + "nreais");
        }
        
        
    }
}
