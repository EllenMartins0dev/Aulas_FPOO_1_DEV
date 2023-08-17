/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;

/**
 *
 * @author Aluno
 */

public enum TipoMesesEnum {
    JANEIRO("janeiro"), 
    FEVEREIRO("fevereiro"),
    MARCO("marco"), 
    ABRIL("abril"),
    MAIO("maio"), 
    JUNHO("junho"), 
    JULHO("julho"), 
    AGOSTO("agosto"), 
    SETEMBRO("setembro"), 
    OUTUBRO("outubro"), 
    NOVEMBRO("novembro"), 
    DEZEMBRO("dezembro");
    
    private String tipo;

    private TipoMesesEnum(String tipo) {
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return this.tipo;
    }
    
}
