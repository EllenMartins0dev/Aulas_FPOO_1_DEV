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
public class Veiculo {
    public static void main(String[] args) {
        /*
    Crie um programa para calcular o valor do aluguel de veículos, conforme a tabela abaixo:
    Veículo               Valor diária                  Valor por km rodado
    Fiat Argo               R$ 98,00                         R$ 2,39
    Fiat Mobi               R$ 79,00                         R$ 1,99
    Hyundai Hb20            R$ 102,00                        R$  2,99
            */
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o veiculo para o calculo: ");
        String veiculo = scanner.nextLine().toUpperCase();
        
        scanner.close();
        
        
        
        switch (veiculo) {
            case "FIAT ARGO":
                int valorDiaria1 = 98;
                double valorpKm1 = 2.39;
                double total1 = valorDiaria1*valorpKm1;
                System.out.println("Veiculo: " + veiculo);
                System.out.println("Valor diaria: " + valorDiaria1);
                System.out.println("Valor por KM: " + valorpKm1);
                System.out.println("Valor total: " + total1);
                break;
            case "FIAT MOBI":
                int valorDiaria2 = 79;
                double valorpKm2 = 1.99;
                double total2 = valorDiaria2*valorpKm2;
                System.out.println("Veiculo: " + veiculo);
                System.out.println("Valor diaria: " + valorDiaria2);
                System.out.println("Valor por KM: " + valorpKm2);
                System.out.println("Valor total: " + total2);
                break;
            case "HYUNDAI HB20":
                int valorDiaria3 = 102;
                double valorpKm3 = 2.99;
                double total3 = valorDiaria3*valorpKm3;
                System.out.println("Veiculo: " + veiculo);
                System.out.println("Valor diaria: " + valorDiaria3);
                System.out.println("Valor por KM: " + valorpKm3);
                System.out.println("Valor total: " + total3);
                break;
            default:
                System.out.println("Veiculo invalido");;
        }
    }
}
