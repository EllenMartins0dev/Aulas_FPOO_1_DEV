/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividades;

/**
 *
 * @author Aluno
 */
public enum CategoriaEnum {
        INFORMATICA("Informatica"), 
        ADMINISTRACAO("Administração"), 
        ELETRICA("Eletrica"), 
        SOLDA("Solda"), 
        CALDERARIA("Calderaria");
        
        private String categoria;
   
     private CategoriaEnum(String categoria) {
            this.categoria = categoria;
        }
        
        
        public String getCategoria() {
            return categoria;
        }
}
