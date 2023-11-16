package string;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Random;
import java.util.Scanner;

public class Revisao {

    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        String escola = "Senai Mario Henrique";

        System.out.println("A escola " + escola + " tem " + escola.length() + " letras.");

        int idadeSenai = 41;

        String mensagem = String.format("A escola %s tem %d anos.", escola, idadeSenai);
        System.out.println(mensagem);
        System.out.println(" ---- Atividade String.format ---- ");
        System.out.println(" ");

        String rua = "Batatinha";

        String numero = "903";

        String bairro = "Santa Maria Machado";

        String endereco = String.format("Rua %s, número %s, bairro %s.", rua, numero, bairro);

        System.out.println(endereco);

        System.out.println(" ");
        System.out.println(" ---- CharAt ---- ");

        char primeiroCaracter = escola.charAt(0);

        System.out.println(primeiroCaracter);

        // Separa a escola pelo espaço (Senai = 0, Mario = 1, Henrique = 2).
        String[] partes = escola.split(" ");

        // vai imprimir a palavra Senai, que é o zero.
        System.out.println(partes[0]);

        System.out.println(" ");
        System.out.println(" ---- Atividade obter caracter ---- ");

        // Inicial da rua
        System.out.println("Nome da Rua: " + rua);
        String[] pedaço = endereco.split(" ");
        char primeiraLetraRua = endereco.charAt(4);
        System.out.println(primeiraLetraRua);

        // Bairro tem mais nomes
        System.out.println("Bairro: " + bairro);
        String[] iniciais = bairro.split(" ");

        String iniciaisBairro = String.format("Iniciais: %s %s %s", iniciais[0].charAt(0), iniciais[1].charAt(0), iniciais[2].charAt(0));
        System.out.println(iniciaisBairro);

        System.out.println(" ");
        System.out.println(" ---- conversão maiúsculo ---- ");

        String cidade = "Piracicaba";
        System.out.println("Cidade escrito de forma padrão: " + cidade);
        System.out.println("Após conversão: " + cidade.toUpperCase());

        System.out.println(" ");
        System.out.println(" ---- atividade conversão minúsculo ---- ");

        String comida = "MACARRÃO";
        System.out.println("Maiúsculo: " + comida);
        System.out.println("Minúsculo" + comida.toLowerCase());

        System.out.println(" ");
        System.out.println(" ---- Replace ---- ");
        //trocando caracter
        String cidadeAlterado = cidade.replace("a", "@");
        System.out.println(cidadeAlterado);

        System.out.println(" ");
        System.out.println(" ---- Atividade Replace ---- ");

        String palavra = "atenciosamente";

        String palavraInicialAlterada = palavra.replaceFirst("a", "z");
        System.out.println(palavraInicialAlterada);

        System.out.println(" ");
        System.out.println(" ---- Contains ---- ");

        String texto = "Olá, seja bem-vido(a) ao Senai!";
        boolean contemSenai = texto.contains("Senai");
        System.out.println(contemSenai);

        System.out.println(" ");
        System.out.println(" ---- Atividade Contains ---- ");
        String frase = "O Senai oferece uma variedade de cursos, incluindo desenvolvimento de sistemas";
        boolean comecaSenai = frase.startsWith("Senai");
        boolean terminaSistemas = frase.endsWith("sistemas");

        System.out.println("Começa com Senai: " + comecaSenai + "\n Termina com sistemas: " + terminaSistemas);
        
        System.out.println(" ");
        System.out.println(" ---- Atividade Senha ---- ");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.println("Digite seu email: ");
        String email = scanner.nextLine();
        
        // Pega as três primeiras letras do nome e as 5 primeiras do email
        String letrasNome = nome.substring(0, 3);
        String letrasEmail = email.substring(0, 5);
        String senha = "";
        Random random = new Random();
        
        // Junta a letra do nome e email
        String letrasSenha = letrasNome + letrasEmail;
        
        
        
        //Vai passar por cada letra
        for (int i = 0; i < letrasEmail.length(); i++) {
            int posicao = random.nextInt(letrasEmail.length());
            String letraSorteada = String.valueOf(letrasEmail.charAt(posicao));
            senha += letraSorteada;
            
        }
        
        scanner.close();
        System.out.println("Sua senha é: " + senha);
        
    }
      

}
