/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class VerificarClasses {

    public static void main(String[] args) {
        System.out.println("---- Classe Aluno ----");
        Aluno aluno1 = new Aluno("Maria", "maria@gmail.com", 6548, true, 0);
        aluno1.verificarEstudo();
        aluno1.verMedia(9.0);
        System.out.println(aluno1);
         System.out.println("");
        Aluno aluno2 = new Aluno("Gustavo", "gustavinhodasquebradas@gmail.com", 7863, false, 0);
        aluno1.verificarEstudo();
        System.out.println(aluno2);
        
        
        System.out.println("");
        System.out.println("---- Classe Carro ----"); System.out.println("");
        Carro carro1 = new Carro("Celta", "Chevrolet", "Preto", 2012, 4);
        carro1.verificarMovimento();
        System.out.println(carro1);
        carro1.verificarMovimento();
        carro1.verificarKm(50);
        System.out.println(carro1);
        

    }
}
