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
public class Energia {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de Kw/h:");
        double KwH = scanner.nextDouble();

        System.out.println("Instalacao R (residencial), I (industrial) e C (comercial):");
        String instacao = scanner.next();

        scanner.close();

        // calcula os descontos
        if (instacao.equalsIgnoreCase("R")) {
            if (KwH <= 500.0) {
                double preco = KwH * 0.4;
                System.out.println("Valor total: " + preco);
            } else {
                double preco = KwH * 0.65;
                System.out.println("Valor total: " + preco);
            }

        }

        if (instacao.equalsIgnoreCase("I")) {
            if (KwH <= 5000.0) {
                double preco = KwH * 0.55;
                System.out.println("Valor total: " + preco);
            } else {
                double preco = KwH * 0.60;
                System.out.println("Valor total: " + preco);
            }
        }

        if (instacao.equalsIgnoreCase("C")) {
            if (KwH <= 1000.0) {
                double preco = KwH * 0.55;
                System.out.println("Valor total: " + preco);
            } else {
                double preco = KwH * 0.60;
                System.out.println("Valor total: " + preco);
            }
        }

        System.out.println("Quantidade de Kw/h: " + KwH);
        System.out.println("Tipo de instalacao: " + instacao);

    }
}
