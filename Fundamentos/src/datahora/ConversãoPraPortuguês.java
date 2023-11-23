package datahora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class ConversãoPraPortuguês {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        
         LocalDate hoje = LocalDate.now();
        System.out.println("Data atual (hoje): " + hoje);

        System.out.println(" ");
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String dataFormatadaPadraoPtBr = hoje.format(formatter);
        
        System.out.println("Data formatada: " + dataFormatadaPadraoPtBr);
    
}
}
