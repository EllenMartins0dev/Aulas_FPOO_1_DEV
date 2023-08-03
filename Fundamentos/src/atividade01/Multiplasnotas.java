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
public class Multiplasnotas {
    public static void main(String[] args) {   
        Scanner scanner = new Scanner(System.in);
        int rs = somar(4,8,2,1);
        System.out.println("Resultado soma:" + rs);
    }
    // método estático (tem reticências pra mostrar que será passado vários valores)
    public static int somar(int... valores){
        int resultado = 0;
        for (int i = 0; i < valores.length; i++) {
            int valor = valores[i];
            resultado += valor;     
        }
        return resultado;
    }
    }

