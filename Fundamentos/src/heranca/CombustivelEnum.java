/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author Aluno
 */
public enum CombustivelEnum {
    GASOLINA("Gasolina"),
    ETANOL("Etanol"),
    DIESEL("Diesel"),
    GNV("Gás Natural Veicular");
    
    private String tipoCombustivel;

    private CombustivelEnum(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getTipoCombustivel() {
        return this.tipoCombustivel;
    }
    
    }