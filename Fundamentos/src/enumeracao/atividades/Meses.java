/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;


/**
 *
 * @author Aluno
 */
public class Meses {
    private String meses;
     private TipoMesesEnum tipo;

    public Meses(String meses, TipoMesesEnum tipo) {
        this.meses = meses;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Meses{" + "meses=" + meses + ", tipo=" + tipo + '}';
    }
     
     
}
