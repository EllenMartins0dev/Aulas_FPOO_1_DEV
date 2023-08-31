
package orientacaoobjetos;

public class Cliente implements AluguelFilme, CadastroCliente{
    private String nome;
    private String email;
    
    
    // Construtor com dois parâmetro
    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    
    // Construtor com um parâmetro
    public Cliente(String nome) {
        this.nome = nome;
    }

    // Getter para pegar os dados
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

   
    // To string para mostrar as informações da classe no print
    @Override
    public String toString() {
        if (this.email == null) {
             return "Cliente{" + "nome = " + nome + '}';
               // pra mostrar email nulo
              // this.email == "não informado ";
        } else {
               return "Cliente{" + "nome = " + nome + ", email = " + email + '}';
        }
    }
    
    
    // Para fazer esse comentário, digite "/**" e aperte a tecla enter :)
    /**
     * Calcula o valor total da locação do filme,
     * Regra para filmes comuns.
     * @param qtdeDias
     * @return 
     */
    
    
    // Troca-se os números mágicos pelo contrato "AluguelFilme"
    public double calcularLocacao(int qtdeDias) {
        return qtdeDias * VALOR_FILME_SIMPLES;
    }
    
    
      /**
     * Calcula o valor total da locação do filme,
     * Regra para filmes novos.
     * @param qtdeDias
     * * @param lancamento
     * @return 
     */
    public double calcularLocacao(int qtdeDias, boolean lancamento) {
        return qtdeDias * VALOR_FILME_LANCAMENTO;
       }
    
    
    // Acrescenta as assinaturas da interface "CadastroCliente" pra deixar de dar erro

    @Override
    public boolean validarNome(String nome) {
        if (nome.length() > 7) {
            System.out.println("Nome do cliente válido: " + nome);
            return true;
        } else {
            System.out.println("Nome do cliente inválido (mínimo 7 letras): " + nome);
            return false;
        }
    }

    @Override
    public boolean verificarEmailDominioGoogle(String email) {
        if (email == null) {
            return false;
        }
        if (email.contains("@gmail.com")) {
            System.out.println("E-mail " + email + " é do domínio da Google");
            return true;
        } else {
            System.out.println("E-mail " + email + " não pertence ao domínio da Google");
            return false;
        }
    }
}