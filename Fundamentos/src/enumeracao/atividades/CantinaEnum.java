/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public class CantinaEnum {

    public static void main(String[] args) {
        Cantina produto1 = new Cantina("hamburguer", 29.90, TipoCantinaEnum.SOLICITADO.getStatus());
        System.out.println(produto1);
        produto1.setStatus(TipoCantinaEnum.PREPARANDO.getStatus());
        System.out.println(produto1);
          produto1.setStatus(TipoCantinaEnum.PRONTO.getStatus());
        System.out.println(produto1);
        System.out.println("---------------------------------------------------------------------");
        Cantina produto2 = new Cantina("suco de laranja", 8.50, TipoCantinaEnum.SOLICITADO.getStatus());
        System.out.println(produto2);
        produto2.setStatus(TipoCantinaEnum.PREPARANDO.getStatus());
        System.out.println(produto2);
          produto2.setStatus(TipoCantinaEnum.PRONTO.getStatus());
        System.out.println(produto2);
        System.out.println("---------------------------------------------------------------------");
        Cantina produto3 = new Cantina("picole de flocos", 3.00, TipoCantinaEnum.SOLICITADO.getStatus());
        System.out.println(produto3);
        produto3.setStatus(TipoCantinaEnum.PREPARANDO.getStatus());
        System.out.println(produto3);
          produto3.setStatus(TipoCantinaEnum.PRONTO.getStatus());
        System.out.println(produto3);
        System.out.println("---------------------------------------------------------------------");
        Cantina produto4 = new Cantina("pao de queijo", 5.00, TipoCantinaEnum.SOLICITADO.getStatus());
        System.out.println(produto4);
        produto4.setStatus(TipoCantinaEnum.PREPARANDO.getStatus());
        System.out.println(produto4);
          produto4.setStatus(TipoCantinaEnum.PRONTO.getStatus());
        System.out.println(produto4);
        System.out.println("---------------------------------------------------------------------");
          Cantina produto5 = new Cantina("suco de uva", 8.50, TipoCantinaEnum.SOLICITADO.getStatus());
        System.out.println(produto5);
        produto5.setStatus(TipoCantinaEnum.PREPARANDO.getStatus());
        System.out.println(produto5);
          produto5.setStatus(TipoCantinaEnum.PRONTO.getStatus());
        System.out.println(produto5);
        System.out.println("---------------------------------------------------------------------");
          Cantina produto6 = new Cantina("salgado de queijo", 6.50, TipoCantinaEnum.SOLICITADO.getStatus());
        System.out.println(produto6);
        produto6.setStatus(TipoCantinaEnum.PREPARANDO.getStatus());
        System.out.println(produto6);
          produto6.setStatus(TipoCantinaEnum.PRONTO.getStatus());
        System.out.println(produto6);
        System.out.println("---------------------------------------------------------------------");
          Cantina produto7 = new Cantina("salgado de chocolate", 5.50, TipoCantinaEnum.SOLICITADO.getStatus());
        System.out.println(produto7);
        produto7.setStatus(TipoCantinaEnum.PREPARANDO.getStatus());
        System.out.println(produto7);
          produto7.setStatus(TipoCantinaEnum.PRONTO.getStatus());
        System.out.println(produto7);
        System.out.println("---------------------------------------------------------------------");
          Cantina produto8 = new Cantina("bolo prestigio", 2.25, TipoCantinaEnum.SOLICITADO.getStatus());
        System.out.println(produto8);
        produto8.setStatus(TipoCantinaEnum.PREPARANDO.getStatus());
        System.out.println(produto8);
          produto8.setStatus(TipoCantinaEnum.PRONTO.getStatus());
        System.out.println(produto8);
        System.out.println("---------------------------------------------------------------------");
    }
}
