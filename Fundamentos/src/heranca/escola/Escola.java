package heranca.escola;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Escola {

    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        
        System.out.println("---- ALUNOS ----");
        System.out.println(" ");
        Aluno a1 = new Aluno("e3a12q", "Walter Silva", "walter@yahoo.com", 20, "345.079.586-49");
        System.out.println(a1);
        a1.verificarDominioEmailGmail(a1.getEmail());
        a1.verificarDominioEmailYahoo(a1.getEmail());
        a1.verificarDominioEmailHotmail(a1.getEmail());
        a1.contagemCaracteresRa(a1.getRa());
        
        System.out.println(" ");
        Aluno a2 = new Aluno("e8k5h0", "Helena Mendes", "helmendes@gmail.com", 16, "293.885,928-90");
        System.out.println(a2);
        a2.verificarDominioEmailGmail(a2.getEmail());
        a2.verificarDominioEmailYahoo(a2.getEmail());
        a2.verificarDominioEmailHotmail(a2.getEmail());
        a2.contagemCaracteresRa(a2.getRa());
        
        System.out.println(" ");
        System.out.println("---- PROFESSORES ----");
        Professor pr1 = new Professor(true, "Pedro Mobile",   "pedro@gmail.com", 30, "459.960.908-05");
        System.out.println(pr1);
        pr1.verificarDominioEmailGmail(pr1.getEmail());
        pr1.verificarDominioEmailYahoo(pr1.getEmail());
        pr1.verificarDominioEmailHotmail(pr1.getEmail());
        pr1.verificarDedicacaoExclusiva(pr1.dedicacaoExclusiva());
        
        System.out.println(" ");
        Professor pr2 = new Professor(false, "Flávia Silva", "flaviaSsilva@yahoo.com", 39, "345.069.496-29");
        System.out.println(pr2);
        pr2.verificarDominioEmailGmail(pr2.getEmail());
        pr2.verificarDominioEmailYahoo(pr2.getEmail());
        pr2.verificarDominioEmailHotmail(pr2.getEmail());
        pr2.verificarDedicacaoExclusiva(pr2.dedicacaoExclusiva());
        
    }
}
