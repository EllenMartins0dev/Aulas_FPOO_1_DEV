
package string;

import java.util.Scanner;

public class Aula_Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a cidade: ");
        
        String cidade = scanner.nextLine();
        
        int comprimentoCidade = cidade.length();
        scanner.close();
        
        System.out.println("A cidade " + cidade + " tem " + comprimentoCidade + " letras");
    }
}
