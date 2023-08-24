package classes;

/**
 *
 * @author Aluno
 */
public class Bicicleta {
    // Atributos da classe, características da bicicleta 
    private int qtdeRodas;
    private boolean temMarchas;
    private int qtdeMarchas;
    private String modelo;
    private boolean temFreio;
    private String cor;
    private String situacao;
    private int velocidade;

    
    
    // Construtor sem argumentos (parâmetros - informações da bike)
    public Bicicleta() {
    }

    
    
    // Construtor com argumentos (parâmetros - informações da bike)
    public Bicicleta(int qtdeRodas, boolean temMarchas, int qtdeMarchas, String modelo, boolean temFreio, String cor) {
        this.qtdeRodas = qtdeRodas;
        this.temMarchas = temMarchas;
        this.qtdeMarchas = qtdeMarchas;
        this.modelo = modelo;
        this.temFreio = temFreio;
        this.cor = cor;
        this.situacao = "Parada";
        this.velocidade = 0;
    }

    
    
    // Métodos (este você escreve a veloci8dade que seja no print)
    public void andar(int velocidade) {
        this.situacao = "Andando";
        this.velocidade = velocidade;
    }

    
//    // Métodos (ações da bicicleta - esse adiciona 2 a velocidade)
//    public void andar() {
//        this.situacao = "Andando"
//        this.velocidade += 2;
//    }
    
    
    public void freiar() {
        this.situacao = "Freiando";
        this.velocidade -= 1;
    }

    
    public boolean verificarSeTemFreio() {
        return this.temFreio;
    }

    
    
    // to String (para transformar as informações em Strings e printar nosso objeto "caloiCross" no arquivo "Bicicletaria")
    @Override
    public String toString() {
        return "Bicicleta{" + "qtdeRodas=" + qtdeRodas + ", temMarchas=" + temMarchas + ", qtdeMarchas=" + qtdeMarchas + ", modelo=" + modelo + ", temFreio=" + temFreio + ", cor=" + cor + ", situacao=" + situacao + ", velocidade=" + velocidade + '}';
    }

}
