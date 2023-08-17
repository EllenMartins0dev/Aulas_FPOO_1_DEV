/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public class Enumeracao {
    public static void main(String[] args) {
        System.out.println("---- Atividade 1 ----");
          Meses mes1 = new Meses(TipoMesesEnum.JANEIRO.getTipo());
        System.out.println(mes1);
          Meses mes2 = new Meses(TipoMesesEnum.FEVEREIRO.getTipo());
        System.out.println(mes2);
          Meses mes3 = new Meses(TipoMesesEnum.MARCO.getTipo());
        System.out.println(mes3);
           Meses mes4 = new Meses(TipoMesesEnum.ABRIL.getTipo());
        System.out.println(mes4);
           Meses mes5 = new Meses(TipoMesesEnum.MAIO.getTipo());
        System.out.println(mes5);
           Meses mes6 = new Meses(TipoMesesEnum.JUNHO.getTipo());
        System.out.println(mes6);
           Meses mes7 = new Meses(TipoMesesEnum.JULHO.getTipo());
        System.out.println(mes7);
           Meses mes8 = new Meses(TipoMesesEnum.AGOSTO.getTipo());
        System.out.println(mes8);
           Meses mes9 = new Meses(TipoMesesEnum.SETEMBRO.getTipo());
        System.out.println(mes9);
           Meses mes10 = new Meses(TipoMesesEnum.OUTUBRO.getTipo());
        System.out.println(mes10);
           Meses mes11 = new Meses(TipoMesesEnum.NOVEMBRO.getTipo());
        System.out.println(mes11);
           Meses mes12 = new Meses(TipoMesesEnum.DEZEMBRO.getTipo());
        System.out.println(mes12);
        
        System.out.println(" ");
        System.out.println("---- Atividade 2 ----");
             Genero livro1 = new Genero("IT a coisa", "Stephen King", GeneroTipoEnum.TERROR.getStatus());
        System.out.println(livro1);
          Genero livro2 = new Genero("Animais fantasticos", "J. K. Rowling", GeneroTipoEnum.FICCAO.getStatus());
        System.out.println(livro2);
          Genero livro3 = new Genero("Cinderela", "Disney", GeneroTipoEnum.CONTODEFADAS.getStatus());
        System.out.println(livro3);
        Genero livro4 = new Genero("A Troca", "Beth O’leary", GeneroTipoEnum.COMEDIA.getStatus());
        System.out.println(livro4);
        Genero livro5 = new Genero("Sherlock Holmes", "Arthur Conan Doyle", GeneroTipoEnum.SUSPENSE.getStatus());
        System.out.println(livro5);
        
        System.out.println(" ");
        System.out.println("---- Atividade 3 ----");
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
        
        System.out.println(" ");
        System.out.println("---- Atividade 4 ----");
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
