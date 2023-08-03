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
public class CalculoAreaCirculo {

    public static void main(String[] args) {
        // Classe scanner
        Scanner scanner = new Scanner(System.in);

        // Digita a mensagem
        System.out.println("Digite o raio do circulo: ");

        // Ler o valor
        double raio = scanner.nextDouble();

        //Fechar o scanner
        scanner.close();

        // Calculando a área
        double area = ((raio * raio) * 3.14);

        // Retornando o resultado
        System.out.println("Área do circulo:" + area);

    }

}
