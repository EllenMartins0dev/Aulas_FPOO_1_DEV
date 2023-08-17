/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public enum TipoRedesSociaisEnum {
    ENTRETENIMENTO("Entretenimento"),
    SOCIALIZACAO("Socializacao"),
    CANCELAMENTO("Cancelamento"),
    TRABALHO0("Trabalho");
    
    private String categoria;

    private TipoRedesSociaisEnum(String categoria) {
        this.categoria = categoria;
    }
    
    public String getCategoria() {
        return this.categoria;
    }
    
}
