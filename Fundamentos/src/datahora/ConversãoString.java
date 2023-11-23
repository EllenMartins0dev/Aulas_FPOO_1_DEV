package datahora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class ConversãoString {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        
        String diaAnoNovo = "01/01/2024";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        LocalDate dataAltoNivel = LocalDate.parse(diaAnoNovo, formatter);
        System.out.println("Data alto nível: " + dataAltoNivel);
        
}
}