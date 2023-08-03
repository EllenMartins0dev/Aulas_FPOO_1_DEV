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
public class Compra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebe e lê o nome do produto
        System.out.println("Digite o nome do produto:");
        String nomeProdto = scanner.nextLine();

        // Recebe e lê o valor do produto
        System.out.println("Digite o valor do produto:");
        double valorProdto = scanner.nextDouble();

        // Recebe e lê a quantidade do produto
        System.out.println("Digite a quantidade do produto:");
        int qtdadeProdto = scanner.nextInt();

        // Calcular o valor total
        double valorTotal = valorProdto * qtdadeProdto;

        // Recebe a forma de pagamento
        System.out.println("Digite a forma de pagamento C(credito) ou D(debito):");
        String formaPagamento = scanner.next();
        
        // calcula os descontos
        if (formaPagamento.equalsIgnoreCase("D")) {
            if (valorTotal <= 100.0) {
                valorTotal = valorTotal -(valorTotal * 0.05) ;
            } else {
                valorTotal = valorTotal - (valorTotal * 0.03) ;
            }
        }

        if (formaPagamento.equalsIgnoreCase("C")) {
            System.out.println("Digite a quantidade de parcelas:");
            int qtdadeParcela = scanner.nextInt();
            double valorParcela = valorTotal / qtdadeParcela;
            System.out.println("Valor da parcela:" + valorParcela);
        }
        else {
            System.out.println("Forma de pagamento inválida");
        }

        // Exibe as informações
        System.out.println("Nome do produto:" + nomeProdto);
        System.out.println("Valor do produto:" + valorProdto);
        System.out.println("Quantidade:" + qtdadeProdto);
        System.out.println("Valor total:" + valorTotal);

        // Fecha o scanner
        scanner.close();
    }
}
