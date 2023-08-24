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
    private CorEnum cor;
    private int ano;
    private int qtdeRodas;
    private boolean andando;
    private double km;
    private boolean estaEmRe;
    private int marcha;
    
    public Carro(String modelo, String marca, CorEnum cor, int ano, int qtdeRodas, boolean estaEmRe, int marcha) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.qtdeRodas = qtdeRodas;
        this.andando = false;
        this.km = 0;
        this.estaEmRe = estaEmRe;
        this.marcha = marcha;
    }
    
    
      public void verificarKm(double km) {
        this.km = km;
    }
      
      
      public void trocarDeMarcha(MarchaEnum novaMarcha){
          int diferenca = novaMarcha.getNumeroMarcha() - this.marcha;
          if (diferenca == 1) {
              this.marcha = novaMarcha.getNumeroMarcha();
          } else {
              System.out.println("Falha ao trocar marcha");
          }
      }
      
      public void engatarRe(boolean re) {
          this.estaEmRe = re;
      }
    
    
    public void verificarMovimento(){
        if (km > 0) {
             this.andando = true;
            System.out.println("Carro esta andando");
        } else if (andando == false){
            System.out.println("Carro esta parado");
        } else {
            System.out.println("Comando invalido");
        }
    }

    @Override
    public String toString() {
        return "Carro{" + "modelo=" + modelo + ", marca=" + marca + ", cor=" + cor + ", ano=" + ano + ", qtdeRodas=" + qtdeRodas + ", andando=" + andando + ", km=" + km + ", estaEmRe=" + estaEmRe + ", marcha=" + marcha + '}';
    }
    
    

   
    
    
}
