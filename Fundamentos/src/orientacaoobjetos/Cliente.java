
package orientacaoobjetos;

public class Cliente {
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

   
    // To string para mostrar as informações no print

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
    public double calcularLocacao(int qtdeDias) {
        return qtdeDias * 3.99;
    }
    
    
      /**
     * Calcula o valor total da locação do filme,
     * Regra para filmes novos.
     * @param qtdeDias
     * * @param lancamento
     * @return 
     */
    public double calcularLocacao(int qtdeDias, boolean lancamento) {
        return qtdeDias * 6.99;
       }
}