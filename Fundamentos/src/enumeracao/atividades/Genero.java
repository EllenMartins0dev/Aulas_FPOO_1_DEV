/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public class Genero {
    private String livro;
    private String autor;
    private String genero;

    public Genero(String livro, String autor, String genero) {
        this.livro = livro;
        this.autor = autor;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Genero{" + "livro=" + livro + ", autor=" + autor + ", genero=" + genero + '}';
    }


   
}

