/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividades;

/**
 *
 * @author Aluno
 */
public class Computador {
    private int capacidadeDR;
    private String sistemaOperacional;
    private String tipoMemoria;
    private int qtdeMemoria;
    private String tipoProcessador;

    public Computador(int capacidadeDR, String sistemaOperacional, String tipoMemoria, int qtdeMemoria, String tipoProcessador) {
        this.capacidadeDR = capacidadeDR;
        this.sistemaOperacional = sistemaOperacional;
        this.tipoMemoria = tipoMemoria;
        this.qtdeMemoria = qtdeMemoria;
        this.tipoProcessador = tipoProcessador;
    }
    
    public void verificarSistemaOperaional() {
        if (sistemaOperacional == "windows") {
            System.out.println("Sistema bom");
        } else  if (sistemaOperacional == "linux") {
            System.out.println("Sistema sofisticado");
        } else if (sistemaOperacional == "ubuntu") {
            System.out.println("Nada a declarar");
        } else {
            System.out.println("Sistema operacional nao reconhecido.");
        }
    }
    
    public void verificarCapacidadeDR(){
        if (capacidadeDR > 500) {
            System.out.println("Capacidade do Disco Rigido boa");
        } else {
            System.out.println("Capacidade de disco rigida baixa");
        }
    }

    @Override
    public String toString() {
        return "Computador{" + "capacidadeDR=" + capacidadeDR + ", sistemaOperacional=" + sistemaOperacional + ", tipoMemoria=" + tipoMemoria + ", qtdeMemoria=" + qtdeMemoria + ", tipoProcessador=" + tipoProcessador + '}';
    }

    

    
    
    
    
    
}
