package heranca;

public class Carro extends Veiculo {

    private int qtdePortas;
    private String modeloCambio;
    private String combustivel;

    // Construtor criado na classe-filha (do lado do nome da Classe) com os atributos da classe-base e os seus próprios
    public Carro(String descricao, int ano, String cor, String modelo, String marca, double valor, boolean zerokm,
            boolean freioAbs, int qtdePortas, CambioEnum cambioEnum, CombustivelEnum combustivelEnum) {
        super(descricao, ano, cor, modelo, marca, valor, zerokm, freioAbs);
        this.qtdePortas = qtdePortas;
        this.modeloCambio = cambioEnum.getTipoCambio();
        this.combustivel = combustivelEnum.getTipoCombustivel();
    }

}
