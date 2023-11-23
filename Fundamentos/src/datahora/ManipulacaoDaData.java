package datahora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class ManipulacaoDaData {

    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));

        LocalDate hoje = LocalDate.now();
        System.out.println("Data atual (hoje): " + hoje);

        System.out.println(" ");
        
        // Acrescenta 10 dias da data atual
        LocalDate dataFutura = hoje.plusDays(10);
        
        // Subtrai 10 dias da data atual
        LocalDate dataPassada = hoje.minusDays(10);
        
        System.out.println(" ");
        
        System.out.println(" ---- Comparando Datas ---- ");
        
        // Se hoje < data futura (dá) -1
        // Se hoje > data futura (dá) 1
        // Se hoje == data futura (dá) 0
        int comparaDatas = hoje.compareTo(dataFutura);
        System.out.println(comparaDatas);
    }
}
