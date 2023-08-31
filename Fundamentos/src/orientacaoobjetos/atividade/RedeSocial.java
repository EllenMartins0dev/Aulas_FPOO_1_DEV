package orientacaoobjetos.atividade;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class RedeSocial {

    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Post insta1 = new Post("Bolo fofinho", "Vovó Mari Maria", "Bolo que fiz hoje para os meus filhos. #Felicidade",
                5, 0, 0, CategoriaEnum.CULINARIA.getCategoria());
        insta1.ContagemComentarios(654361);
        insta1.ContagemLikes(5435544);
        System.out.println(insta1);
        insta1.classificarEstrelaPost(5);

        System.out.println("");
        Post insta2 = new Post("Tudo posso naquele que me fortalece", "Aninha das quebras", "Melhor fase da minha vida",
                1, 0, 0, CategoriaEnum.BISCOITO.getCategoria());
        insta2.ContagemComentarios(12);
        insta2.ContagemLikes(40);
        System.out.println(insta2);
        insta2.classificarEstrelaPost(1);
        
        
         System.out.println("");
        Post face1 = new Post("Melhores placas de vídeo", "Gugracinha", "placas boas",
                1, 0, 0, CategoriaEnum.TECNOLOGIA.getCategoria());
        face1.ContagemComentarios(5);
        face1.ContagemLikes(15);
        System.out.println(face1);
        face1.classificarEstrelaPost(1);
        
        
        System.out.println("");
        Post you1 = new Post("Menino cai de barranco e vira meme nas redes", "H2 reportagens", "Veja a reportagem na íntegra",
                5, 0, 0, CategoriaEnum.NOTICIA.getCategoria());
        you1.ContagemComentarios(8000);
        you1.ContagemLikes(6359);
        System.out.println(you1);
        you1.classificarEstrelaPost(5);
        
        
        System.out.println("");
        Post you = new Post("As melhores bases do mercado", "Nariz amarelo", "Seguimores, segue as bases que mais uso",
                3, 0, 0, CategoriaEnum.PUBLICIDADE.getCategoria());
        you.ContagemComentarios(125);
        you.ContagemLikes(3265);
        System.out.println(you);
        you.classificarEstrelaPost(3);

    }
}
