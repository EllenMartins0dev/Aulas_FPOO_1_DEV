package datahora;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Atividades {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        System.out.println("--- Desafio 1 ---- ");
        
        // Cria um objeto com dia atual
        LocalDate hoje = LocalDate.now();
         System.out.println("Data atual: " + hoje);
         
         System.out.println(" ");
         
         
         
         String frase = String.format("Hoje é dia %s do mês de %s, ano %s ",hoje.getDayOfMonth(),hoje.getMonth(), hoje.getYear()  );
         
         System.out.println(frase);
         
       
        System.out.println(" ");
                
        System.out.println(" ---- Desafio 2 ---- ");
        System.out.println("Utilizando DateTimeFormatter");
         // Passando o mês pra português e mês por extenso - Meu jeito
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("'Hoje é dia' dd 'do mês de' MMMM , 'ano' yyyy");
        String frasePtBr = hoje.format(formatador);
        System.out.println(frasePtBr);
        
        
        // Passando o mês pra português e mês por extenso 
        System.out.println(" ");
        System.out.println("Utilizando Locale");
        String mensagem = String.format("Hoje é dia %s do mês de %s, ano %s ",hoje.getDayOfMonth(),hoje.getMonth().getDisplayName(TextStyle.FULL, Locale.of("pt")), hoje.getYear());
        System.out.println(mensagem);
      
         // Forma Professor
        int dia = hoje.getDayOfMonth();
        int mes = hoje.getMonthValue();
        int ano = hoje.getYear();
       
        String frase1 = "Hoje e dia  " + dia + " do mes " + mes + " do ano de " + ano;
        System.out.println(frase);
        
        //Transformar em extenso para portugues
        Locale localeBrasil = Locale.of("pt","BR");
        
        String mesPorExtenso = hoje.getMonth().getDisplayName(TextStyle.FULL, localeBrasil);
        String dataPorExtenso = String.format("Hoje e dia %d do mes %s,ano %d", dia,mesPorExtenso,ano);
        System.out.println(dataPorExtenso);
    }
}
    
