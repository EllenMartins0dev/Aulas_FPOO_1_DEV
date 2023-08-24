/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Aluno {
    private String nome;
    private String email;
    private int ra;
    private boolean estudar;
    private double media;
    
    

    public Aluno(String nome, String email, int ra, boolean estudar, double media) {
        this.nome = nome;
        this.email = email;
        this.ra = ra;
        this.estudar = estudar;
        this.media = 0;
    }
    
    
    
        public void verMedia(double media) {
        this.media = media;
    }
    
    
    public void verificarEstudo(){
        if (estudar == true) {
            System.out.println("Aluno esta estudando");
        } else if (estudar == false) {
            System.out.println("Aluno terminou a atividade");
        }
        else {
            System.out.println("Invalido");
        }
        
        
        
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", email=" + email + ", ra=" + ra + ", estudar=" + estudar + ", media=" + media + '}';
    }

    
    
    
    
    
}
