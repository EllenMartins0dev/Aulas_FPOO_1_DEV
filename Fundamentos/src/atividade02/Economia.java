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
public class Economia {
    public static void main(String[] args) {
        /*
    Crie um programa para calcular o valor a ser economizado por mês e a quantidade
    de meses para você comprar os itens abaixo:

    Item                             Valor total           Percentual a economizar                        
    Notebook Lenovo                   R$ 3299,00                  5%
    Celular MotoG22                   R$ 1789,00                  10%
    Carro Hb20                        R$ 68000,0                  2%
    Apartamento                       R$ 180000,00                1%
        */
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o item que seja comprar: ");
        String produto = scanner.nextLine().toUpperCase();
        
        scanner.close();
        
        DecimalFormat formatado = new DecimalFormat("0.00");
        
       
        switch (produto) {
            case "NOTEBOOK LENOVO":
               int valorTotal1 = 3299;
               double percentual1 = 0.05;
               double valorParcela1 = valorTotal1*percentual1;
               double meses1 = valorTotal1/valorParcela1;
               double numeroArredondadoCima = Math.ceil(meses1);
               System.out.println("Produto: " + produto);
               System.out.println("Valor total: " + formatado.format(valorTotal1));
               System.out.println("Valor parcela: " + formatado.format(valorParcela1));
               System.out.println("Meses a pagar (aproximadamente): " + numeroArredondadoCima);
               System.out.println("Meses a pagar (real): " + meses1);
                break;
            case "CELULAR MOTOG22":
               int valorTotal2 = 1789;
               double percentual2 = 0.10;
               double valorParcela2 = valorTotal2*percentual2;
               double meses2 = valorTotal2/valorParcela2;
               System.out.println("Produto: " + produto);
               System.out.println("Valor total: " + formatado.format(valorTotal2));
               System.out.println("Valor parcela: " + formatado.format(valorParcela2));
               System.out.println("Meses a pagar: " + meses2);
                break;
            case "APARTAMENTO":
               int valorTotal3 = 68000;
               double percentual3 = 0.02;
               double valorParcela3 = valorTotal3*percentual3;
               double meses3 = valorTotal3/valorParcela3;
               System.out.println("Produto: " + produto);
               System.out.println("Valor total: " + formatado.format(valorTotal3));
               System.out.println("Valor parcela: " + formatado.format(valorParcela3));
               System.out.println("Meses a pagar: " + meses3);
                break;
            case "CARRO HB20":
               int valorTotal4 = 180000;
               double percentual4 = 0.01;
               double valorParcela4 = valorTotal4*percentual4;
               double meses4 = valorTotal4/valorParcela4;
               System.out.println("Produto: " + produto);
               System.out.println("Valor total: " + formatado.format(valorTotal4));
               System.out.println("Valor parcela: " + formatado.format(valorParcela4));
               System.out.println("Meses a pagar: " + meses4);
                break;
            default:
                System.out.println("Produto invalido");;
        }
       
    }
}
