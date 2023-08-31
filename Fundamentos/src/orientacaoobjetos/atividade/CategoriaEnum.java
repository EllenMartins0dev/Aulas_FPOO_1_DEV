/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoobjetos.atividade;

/**
 *
 * @author Aluno
 */
public enum CategoriaEnum {
    ENTRETENIMENTO("Entretenimento"),
    PUBLICIDADE("Publicidade"),
    INFORMACAO("Informação"),
    NOTICIA("Notícia"),
    BISCOITO("Biscoito"),
    CULINARIA("Culinária"),
    TECNOLOGIA("Tecnologia"),
    BELEZA("Beleza");
    
    private String categoriaPost;

    private CategoriaEnum(String categoriaPost) {
        this.categoriaPost = categoriaPost;
    }
    
    public String getCategoria(){
        return this.categoriaPost;
    }
}
