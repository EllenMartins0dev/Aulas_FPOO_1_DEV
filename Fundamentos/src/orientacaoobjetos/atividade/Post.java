
package orientacaoobjetos.atividade;


public class Post implements ClassificacaoPost{
    private String titulo;
    private String usuario;
    private String descricao;
    private int estrelas;
    private int like;
    private int comentario;
    private String categoriaPost;

    
    public Post(String titulo, String usuario, String descricao, int estrelas, int like, int comentario, String categoriaPost) {
        this.titulo = titulo;
        this.usuario = usuario;
        this.descricao = descricao;
        this.estrelas = estrelas;
        this.like = like;
        this.comentario = comentario;
        this.categoriaPost = categoriaPost;
    }

    @Override
    public String toString() {
        return "Post{" + "titulo = " + titulo + ", usuario = " + usuario + ", descricao = " + descricao + ", estrelas = " + estrelas + 
                ", like = " + like + ", comentario = " + comentario + ", categoriaPost = " + categoriaPost + '}';
    }

    
        public int classificarEstrelaPost(int estrelas) {
            if (estrelas == 1) {
                System.out.println("Comum");
                return estrelas;
            } if (estrelas == 3){
                System.out.println("Legal");
                return estrelas;
            } if (estrelas == 5){
                System.out.println("Super legal");
                return estrelas;
            } else {
                System.out.println("Classificação inválida");
                return 0;
            }
    }
        
      public void setCategoria(String categoriaPost) {
        this.categoriaPost = categoriaPost;
    }
        
    public void ContagemLikes(int like) {
        this.like = like;
    }
    
     public void ContagemComentarios(int comentario) {
        this.comentario = comentario;
    }
    
}
