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
    private String status;

    public Genero(String livro, String autor, String status) {
        this.livro = livro;
        this.autor = autor;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Genero{" + "livro=" + livro + ", autor=" + autor + ", status=" + status + '}';
    }


   
}

