package orientacaoobjetos;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Locadora {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        
        Cliente c1 = new Cliente("José Antônio Santos");
         System.out.println(c1);
        double valorLocacaoSimples = c1.calcularLocacao(3);
        System.out.println("Valor locação filme comum: " + valorLocacaoSimples);
        
        System.out.println("");
        
        Cliente c2 = new Cliente("Marilza Sílva", "marilza@gmail.com");
        System.out.println(c2);
        double valorLocacaoLancamento = c2.calcularLocacao(3, true);
        System.out.println("Valor locação filme lançamento: " + valorLocacaoLancamento);
        
    }
    
}
