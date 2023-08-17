/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;

import javax.lang.model.type.TypeMirror;
import javax.management.openmbean.CompositeDataInvocationHandler;

/**
 *
 * @author Aluno
 */
    public enum GeneroTipoEnum {
        COMEDIA("comedia"),
        FICCAO("ficcao"), 
        SUSPENSE("suspense"), 
        TERROR("terror"), 
        CONTODEFADAS("conto de fadas");
        
         private String status;

    private GeneroTipoEnum(String status) {
        this.status = status;
    }
    
    public String getStatus() {
        return this.status;
    }
    
}
