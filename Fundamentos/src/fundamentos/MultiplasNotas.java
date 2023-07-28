package fundamentos;

public class MultiplasNotas {
    public static void main(String[] args) {
        int rs = somar(4,8,2,1);
        System.out.println("Resultado soma:" + rs);
    }
    // método estático (tem reticências pra mostrar que será passado vários valores)
    public static int somar(int... valores){
        int resultado = 0;
        for (int i = 0; i < valores.length; i++) {
            int valor = valores[i];
            resultado += valor;     
        }
        return resultado;
    }
}
