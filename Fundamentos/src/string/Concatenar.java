package string;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Concatenar {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        
        // Minha cidade Piracicaba é muito linda
        String cidade = "Piracicaba";
        String frase = "Minha cidade " .concat(cidade) .concat(" é muito linda");
        
        System.out.println(frase);
       
    }
    
}
