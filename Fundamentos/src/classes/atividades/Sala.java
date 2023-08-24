/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividades;

/**
 *
 * @author Aluno
 */
public class Sala {
    private int numeroCadeiras;
    private int numeroMesas;
    private int numeroSala;
    private boolean projetor;
    private int numeroComputadores;
    private boolean arcondicionado;
    
    
    

    public Sala(int numeroCadeiras, int numeroMesas, int numeroSala, boolean projetor, int numeroComputadores, boolean arcondicionado) {
        this.numeroCadeiras = numeroCadeiras;
        this.numeroMesas = numeroMesas;
        this.numeroSala = numeroSala;
        this.projetor = projetor;
        this.numeroComputadores = numeroComputadores;
        this.arcondicionado = arcondicionado;
    }
    
    
    public void verificarArcondicionado(){
        if (numeroSala > 5) {
            System.out.println("Sala resfriada");
        } else {
            System.out.println("Sala sem arcondicionado (leia o QR Code)");
        }
    }
    
    public void verificarProjetor(){
        if ( projetor == true) {
            System.out.println("a sala possui datashow");
        } else {
            System.out.println("Leia o  QR Code para a implementacao do datashow");
        }
    }

    @Override
    public String toString() {
        return "Sala{" + "numeroCadeiras=" + numeroCadeiras + ", numeroMesas=" + numeroMesas + ", numeroSala=" + numeroSala + ", projetor=" + projetor + ", numeroComputadores=" + numeroComputadores + ", arcondicionado=" + arcondicionado + '}';
    }
    
    
    
}
