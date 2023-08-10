/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade02;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Salario {
    public static void main(String[] args) {
   
        // Adicionar o scanner
        Scanner scanner = new Scanner(System.in);
        
        // Mostra a mensagem
        System.out.println("Digite seu cargo: ");
        
        // Lê a informação digitada e transforma em letra minúscula
        String cargo = scanner.nextLine().toLowerCase();
        
        // Fecha o scanner
        scanner.close();
        
        // Define o formato com duas casas decimais
        DecimalFormat formatado = new DecimalFormat("0.00"); 
        
        
        switch (cargo) {
            case "gerente":
                double salariog = 5590.0;
                int conveniog = 289;
                double descontoINSSg = salariog*0.08;
                double totalG = salariog - (descontoINSSg + conveniog);
                System.out.println("Salario final: " + formatado.format(totalG));
                System.out.println("Desconto INSS: " + formatado.format(descontoINSSg));
                System.out.println("Valor convenio: " + formatado.format(conveniog));
                break;
            case "supervisor":
                double salarioS = 4128.0;
                int convenioS = 239;
                double descontoINSSs = salarioS*0.07;
                double totalS = salarioS - (descontoINSSs + convenioS);
                System.out.println("Salario final: " + formatado.format(totalS));
                System.out.println("Desconto INSS: " + formatado.format(descontoINSSs));
                System.out.println("Valor convenio: " + formatado.format(convenioS));
                break;
            case "tecnico":
                double salarioT = 3789.0;
                int convenioT = 189;
                double descontoINSST = salarioT*0.04;
                double totalT = salarioT - (descontoINSST + convenioT);
                System.out.println("Salario final: " + formatado.format(totalT));
                System.out.println("Desconto INSS: " + formatado.format(descontoINSST));
                System.out.println("Valor convenio: " + formatado.format(convenioT));
                break;
            case "auxiliar":
                double salarioA = 2345.0;
                int convenioA = 156;
                double descontoINSSA = salarioA*0.02;
                double totalA = salarioA - (descontoINSSA + convenioA);
                System.out.println("Salario final: " + formatado.format(totalA));
                System.out.println("Desconto INSS: " + formatado.format(descontoINSSA));
                System.out.println("Valor convenio: " + formatado.format(convenioA));
                break;
            default:
                System.out.println("Cargo invalido.");;
        }
    }
}
