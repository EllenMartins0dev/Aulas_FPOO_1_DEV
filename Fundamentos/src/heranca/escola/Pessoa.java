package heranca.escola;

public class Pessoa implements ValidaPessoa{
    // Shift + delete apaga a linha
    private String nome;
    private String email;
    private int idade;
    private String cpf; 

    public Pessoa(String nome, String email, int idade, String cpf) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }
    
    
    
    
   
    public boolean verificarMaiorDeIdade(){
        if(this.idade >= 18) {
          System.out.println("Essa pessoa é maior de idade");
            return true;
        } else {
            System.out.println("Essa pessoa é menor de idade");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome = " + nome + ", email = " + email + ", idade = " + idade + ", cpf = " + cpf + '}';
    }


    @Override
    public boolean verificarDominioEmailGmail(String email) {
          if (this.email.contains("@gmail")) {
              System.out.println("Este email " + getEmail() + " é do domínio do Gmail");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean verificarDominioEmailYahoo(String email) {
        if (this.email.contains("@yahoo")) {
              System.out.println("Este email " + getEmail() + " é do domínio do Yahoo");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean verificarDominioEmailHotmail(String email) {
        if (this.email.contains("@hotmail")) {
              System.out.println("Este email " + getEmail() + " é do domínio do Hotmail");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean verificarDedicacaoExclusiva(boolean dedicacaoExclusiva) {
        if (dedicacaoExclusiva == true) {
              System.out.println("O(a) professor(a) " + getNome() + " tem dedicação exclusiva com a escola");
            return true;
        } else {
              System.out.println("O(a) professor(a) " + getNome() + " não tem dedicação exclusiva com a escola");
            return false;
        }
    }
    
    
    
     
}
