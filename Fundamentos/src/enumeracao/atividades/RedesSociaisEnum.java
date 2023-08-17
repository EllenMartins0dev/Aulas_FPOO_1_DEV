/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public class RedesSociaisEnum {
    public static void main(String[] args) {
       RedesSociais youtube = new RedesSociais("Youtube", 2000000000, TipoRedesSociaisEnum.ENTRETENIMENTO.getCategoria());
        System.out.println(youtube);
        
        RedesSociais instagram = new RedesSociais("Instagram", 113500000, TipoRedesSociaisEnum.ENTRETENIMENTO.getCategoria());
        System.out.println(instagram);
        
         RedesSociais whatsapp = new RedesSociais("Whatsapp", 1200000000, TipoRedesSociaisEnum.SOCIALIZACAO.getCategoria());
        System.out.println(whatsapp);
        
        
         RedesSociais twitter = new RedesSociais("Twitter", 238110000, TipoRedesSociaisEnum.CANCELAMENTO.getCategoria());
        System.out.println(twitter);
        
        
        
    }
}
