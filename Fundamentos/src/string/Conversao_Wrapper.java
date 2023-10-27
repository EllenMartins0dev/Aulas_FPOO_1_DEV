package string;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Conversao_Wrapper {
        public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        
       // Declare uma String com a idade de Piracicaba
       
       String idadePira = "256";
       
       
       int idadeFormatada =  Integer.parseInt(idadePira);
       int soma = idadeFormatada + 1;
       
       System.out.println("---- Conversão de String para int ----");
       String frase = String.format("A cidade de Piracicaba tem %d anos e ano que vem ela terá %d anos", idadeFormatada, soma);
            
            System.out.println(frase);
            System.out.println(" ");
            System.out.println("---- Conversão de int para String ----");
            
            // Conversão de int para String
            
            String nome = "Olavo";
            int minhaIdade = 87;
            
            String minhaIdadeFormatada = Integer.toString(minhaIdade);
            
            String mensagem = String.format("Meu nome é %s e minha idade é %s anos", nome, minhaIdadeFormatada);
            
            System.out.println(mensagem);
            
            
            
            
    }
    
}
