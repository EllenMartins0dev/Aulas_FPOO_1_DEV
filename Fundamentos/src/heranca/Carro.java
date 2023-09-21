/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author Aluno
 */
public class Carro {
    private int qtdePortas;
    private String modeloCambio;
    private String combustivel;

    public Carro(int qtdePortas, CambioEnum cambioEnum, String combustivel) {
        this.qtdePortas = qtdePortas;
        this.modeloCambio = cambioEnum.getTipoCambio();
        this.combustivel = combustivel;
    }
}
