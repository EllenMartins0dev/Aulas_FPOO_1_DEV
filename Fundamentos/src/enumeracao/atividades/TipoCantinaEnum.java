/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public enum TipoCantinaEnum {
        SOLICITADO("Pedido solicitado"),
    PREPARANDO("Preparando a comida"),
   PRONTO("Retire na cantina");
    
    private String status;

    private TipoCantinaEnum(String status) {
        this.status = status;
    }
    
    public String getStatus() {
        return this.status;
    }
    
}
