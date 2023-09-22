package heranca.escola;

public class Aluno extends Pessoa {

    private String ra;

    public Aluno(String ra, String nome, String email, int idade, String cpf) {
        super(nome, email, idade, cpf);
        this.ra = ra;
    }

    public String getRa() {
        return ra;
    }
    
    

    @Override
    public String toString() {
        return super.toString() + "Aluno{" + "ra = " + ra + '}';
    }

    @Override
    public boolean verificarMaiorDeIdade() {
        return super.verificarMaiorDeIdade(); 
    }
    
    public String contagemCaracteresRa(String ra){
        if (this.ra != null) {
            System.out.println("O RA " + getRa() + " tem " + this.ra.length() + " caracteres");
        } else {
            System.out.println("RA inválido ou não possui");
        }
        return null;
    }



}
