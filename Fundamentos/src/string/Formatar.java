package string;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Formatar {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        
        // Imprimir o nome do aluno e sua média
        
        String aluno = new String("Valdemir");
        double media = 5.5;
        
        String frase = String.format("O aluno %s tem a média %.1f", aluno, media);
        
        System.out.println(frase);
       
    }
    
}