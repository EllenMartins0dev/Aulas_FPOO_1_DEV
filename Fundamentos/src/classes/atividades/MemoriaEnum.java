/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividades;

/**
 *
 * @author Aluno
 */
public enum MemoriaEnum {
    DDR( "DDR", 133),
    DDR1( "DDR", 166),
    DDR1_1( "DDR", 200),
    DDR2("DDR", 266),
    DDR2_1("DDR", 333),
    DDR2_2("DDR", 400),
    DDR2_3("DDR", 533),
    DDR3("DDR", 667),
    DDR3_1("DDR", 800);
    
    
    private String tipoMemoria;
    private int qtdeMemoria;
    
    
    private  MemoriaEnum(String tipoMemoria, int qtdeMemoria) {
            this.tipoMemoria = tipoMemoria;
            this.qtdeMemoria = qtdeMemoria;
        }
        
        
        public String getTipoMemoria() {
            return tipoMemoria;
        }
        
        public int getQtdeMemoria() {
            return qtdeMemoria;
        }
}
