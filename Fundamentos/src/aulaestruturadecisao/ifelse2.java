/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaestruturadecisao;

/**
 *
 * @author Aluno
 */
public class ifelse2 {
    public static void main(String[] args) {
        int temperatura = 15;
        
        if (temperatura == 15) {
            System.out.println("Esta ficando frio");
        } 
        else if (temperatura == 20) {
            System.out.println("Esta ficando agradavel");
        }
        else if (temperatura == 30) {
            System.out.println("Esta ficando calor");
        }
    
    // Utilizando o modelo Switch case
    switch (temperatura) {
         case 15:
                System.out.println("Esta ficando frio");
                break;
            case 20:
                System.out.println("Esta ficando agradavel");
                break;
            case 30:
                System.out.println("Esta ficando calor");
                break;
                default:
                System.out.println("Nao identifiquei a temperatura");
                break;
     }
    
    }
}