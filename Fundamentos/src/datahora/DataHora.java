
package datahora;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHora {
     public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        
        // Cria um objeto com dia atual
        LocalDate hoje = LocalDate.now();
         System.out.println("Data atual: " + hoje);
         
         // Cria um objeto com dia e hora atual
         LocalDateTime agora = LocalDateTime.now();
         System.out.println("Data e hora atual: " + agora);
         
         // Cria um objeto especificando ano, mês e dia
         LocalDate diaNatalAnoAnterior = LocalDate.of(2022, 12, 25);
         System.out.println("Data do Natal do ano anterior: " + diaNatalAnoAnterior);
         
         // Cria um objeto especificando ano, mês e dia
         LocalDateTime horarioCeiaNatalAnoAnterior = LocalDateTime.of(2022,12,25,22,30);
         System.out.println("Horário da ceia do ano anterior: " + horarioCeiaNatalAnoAnterior);
         
    }
}
