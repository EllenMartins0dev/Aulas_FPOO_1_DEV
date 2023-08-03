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
public class Viagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a distancia percorrida (km):");
        double distancia = scanner.nextDouble();
        
        if (distancia <= 200.0) {
            double valorDistancia = distancia* 0.5;
            System.out.println("Distancia: " + distancia);
            System.out.println("Valor viagem: " + valorDistancia);
        }
        else {
            double valorDistancia = distancia* 0.45;
            System.out.println("Distancia: " + distancia);
            System.out.println("Valor viagem: " + valorDistancia);
        }
        
      
    }
}
