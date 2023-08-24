/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividades;

/**
 *
 * @author Aluno
 */
public class Curso {
    private String nome;
    private String descricao;
    private String categoria;

    public Curso(String nome, String descricao, String categoria) {
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
    }
    
    public void verificarCurso(){
        if (nome == "DEV") {
            System.out.println("Melhor curso do Senai");
        } else if (nome == "Eletrica"){
            System.out.println("Curso bom");
        } else {
            System.out.println("Algum curso do Senai (muito bom, confia)");
        }
    }
    
    
    public void verificarDescricao(){
         if (nome == "DEV") {
            System.out.println("Melhor descricao, leia tudo");
        } else if (nome == "Eletrica"){
            System.out.println("Descricao boa, pode ler");
        } else {
            System.out.println("Descricao de curso aleatorio, muito grande");
        }
    }

    @Override
    public String toString() {
        return "Curso{" + "nome=" + nome + ", descricao=" + descricao + ", categoria=" + categoria + '}';
    }
    
    
}
