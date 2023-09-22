package heranca.escola;

public class Professor extends Pessoa{
    private boolean dedicacaoExclusiva;

    public Professor(boolean dedicacaoExclusiva, String nome, String email, int idade, String cpf) {
        super(nome, email, idade, cpf);
        this.dedicacaoExclusiva = dedicacaoExclusiva;
    }

    public boolean dedicacaoExclusiva() {
        return dedicacaoExclusiva;
    }
    
   
    @Override
    public String toString() {
        return super.toString() +  "Professor{" + "dedicacaoExclusiva = " + dedicacaoExclusiva + '}';
    }
    
    
}
