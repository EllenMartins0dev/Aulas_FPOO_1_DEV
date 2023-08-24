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
        Aluno aluno1 = new Aluno("Maria", "mariazinha.net@gmail.com", 6548, true, 0);
        aluno1.verificarEstudo();
        aluno1.verMedia(9.0);
        System.out.println(aluno1);
        System.out.println("");
        Aluno aluno2 = new Aluno("Gustavo", "gustavinhodasquebradas@gmail.com", 7863, false, 8.4);
        aluno2.verificarEstudo();
        System.out.println(aluno2);

        System.out.println("");
        System.out.println("---- Classe Carro ----");
        System.out.println("");
        
        Carro carro1 = new Carro("Celta", "Chevrolet", CorEnum.ROXO, 2020, 4, false, MarchaEnum.SEGUNDA_MARCHA.getNumeroMarcha());
        carro1.verificarMovimento();
        System.out.println(carro1);
        carro1.verificarKm(50);
        carro1.verificarMovimento();
        System.out.println(carro1);

        System.out.println("");
        Carro carro2 = new Carro("Celta", "Chevrolet", CorEnum.PRETO, 2000, 4, false, MarchaEnum.QUINTA_MARCHA.getNumeroMarcha());
        carro2.verificarMovimento();
        System.out.println(carro2);
        carro2.trocarDeMarcha(MarchaEnum.PRIMEIRA_MARCHA);
        System.out.println(carro2);
        
         System.out.println("");
        Carro carro3 = new Carro("Celta", "Chevrolet", CorEnum.PRATA, 2010, 4, false, MarchaEnum.TERCEIRA_MARCHA.getNumeroMarcha());
        carro3.verificarMovimento();
        System.out.println(carro3);
        carro3.trocarDeMarcha(MarchaEnum.SEGUNDA_MARCHA);
        System.out.println(carro3);
    }
}
