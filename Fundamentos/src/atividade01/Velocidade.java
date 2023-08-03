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
public class Velocidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Informa a velocidade do carro
        System.out.println("Digite a velocidade do carro (km/hr): ");
        double velocidade = scanner.nextDouble();
        
        scanner.close();
        
        if (velocidade > 80.0) {
            double multa = (velocidade - 80)*5;
            System.out.println("Voce foi multado em " + multa);
        }
        else{
            System.out.println("Velocidade: " + velocidade);
        }
            
            
        }
    }
   
