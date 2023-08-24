/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividades;

/**
 *
 * @author Aluno
 */
public enum ProcessadorEnum {
    IINTERI3("Intel i3"), 
    INTELI5("Intel i5"), 
    INTELI7("Intel i7");
    
   private String tipoProcessador;
   
     private ProcessadorEnum(String tipoProcessador) {
            this.tipoProcessador = tipoProcessador;
        }
        
        
        public String getTipoProcessador() {
            return tipoProcessador;
        }
}
