/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;

import enumeracao.StatusEnum;

/**
 *
 * @author Aluno
 */
public class GeneroEnum {
    public static void main(String[] args) {
       Genero livro1 = new Genero("IT a coisa", "Stephen King", GeneroTipoEnum.TERROR.getStatus());
        System.out.println(livro1);
        
          Genero livro2 = new Genero("Animjais fantasticos", "J. K. Rowling", GeneroTipoEnum.FICCAO.getStatus());
        System.out.println(livro2);
        
          Genero livro3 = new Genero("Cinderela", "Disney", GeneroTipoEnum.CONTODEFADAS.getStatus());
        System.out.println(livro3);
        
        Genero livro4 = new Genero("A Troca", "Beth O’leary", GeneroTipoEnum.COMEDIA.getStatus());
        System.out.println(livro4);
        
        Genero livro5 = new Genero("Sherlock Holmes", "Arthur Conan Doyle", GeneroTipoEnum.SUSPENSE.getStatus());
        System.out.println(livro5);
        
    
    }
}

