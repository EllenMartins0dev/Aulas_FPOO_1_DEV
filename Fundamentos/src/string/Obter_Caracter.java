package string;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Obter_Caracter {
     public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        
        String texto = "Carla Teodoro";
        
        char inicialNome = texto.charAt(0);
        char inicialSobrenome = texto.charAt(6);
        
         System.out.println("Nome: " + texto);
         System.out.println("Iniciais: " + inicialNome + inicialSobrenome);
         
         System.out.println(" ");
         System.out.println("---- Exemplo 2 ----");
         
        
         String nome = "Gabriel Henrique Ferreira";
         System.out.println("Nome: " + nome + "\n Iniciais:");
         String iniciais[] = nome.split(" ");
         System.out.println(iniciais[0].charAt(0));
         System.out.println(iniciais[1].charAt(0));
         System.out.println(iniciais[2].charAt(0));
         
         
          System.out.println(" ");
         System.out.println("---- Exemplo professor ----");
         String nomeSobrenome = "Moisas Olimpiano";
         System.out.println("Nome: " + nomeSobrenome);
         
         String[] vetor = nomeSobrenome.split(" ");
         String iniciaisVetor = String.format("Iniciais: %s%s", vetor[0].charAt(0), vetor[1].charAt(0));
         System.out.println(iniciaisVetor);
         
         // Utilize o nome da cidade e Pegue os 4 primeiros e ultimos caracteres
         
         Scanner scanner = new Scanner(System.in);
         
         System.out.println("Digite o noem da cidade: ");
         
         String cidadeScan = scanner.nextLine();
         scanner.close();
         String cidade = "Piracicaba";
         System.out.println("Nome cidade: " + cidade);
         cidade.substring(0,5);
         cidade.substring(6);
         
          
    }
}
