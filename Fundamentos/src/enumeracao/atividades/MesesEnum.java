/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;

/**
 *
 * @author Aluno
 */

public class MesesEnum {
    
public enum MesesDoAno {
    JANEIRO, FEVEREIRO, MARCO, ABRIL, MAIO, JUNHO, JULHO, AGOSTO, SETEMBRO, OUTUBRO, NOVEMBRO, DEZEMBRO
}
 public static void main(String[] args) {
        for (MesesDoAno mes : MesesDoAno.values()) {
            System.out.println(mes);
        }
   }
}