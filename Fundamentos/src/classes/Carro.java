/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Carro {
    private String modelo;
    private String marca;
    private String cor;
    private int ano;
    private int qtdeRodas;
    private boolean andando;
    private double km;

    public Carro(String modelo, String marca, String cor, int ano, int qtdeRodas) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.qtdeRodas = qtdeRodas;
        this.andando = false;
        this.km = 0;
    }
    
    
      public void verificarKm(double km) {
        this.km = km;
    }
    
    
    public void verificarMovimento(){
        if (andando = true) {
            System.out.println("Carro esta andando");
        } else if (andando = false){
            System.out.println("Carro esta parado");
        } else {
            System.out.println("Comando invalido");
        }
    }
    
    

    @Override
    public String toString() {
        return "Carro{" + "modelo=" + modelo + ", marca=" + marca + ", cor=" + cor + ", ano=" + ano + ", qtdeRodas=" + qtdeRodas + ", andando=" + andando + ", km=" + km + '}';
    }
    
    
    
}
