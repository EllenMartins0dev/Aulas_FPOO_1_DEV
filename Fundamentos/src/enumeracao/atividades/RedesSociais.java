/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public class RedesSociais {
    private String nome;
    private double usuarios;
    private String categoria;

    public RedesSociais(String nome, double usuarios, String categoria) {
        this.nome = nome;
        this.usuarios = usuarios;
        this.categoria = categoria;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "RedesSociais{" + "nome=" + nome + ", usuarios=" + usuarios + ", categoria=" + categoria + '}';
    }
}
