package academy.devdojo.maratonajava.javacore.Eblocosdeinicializacao.teste;

import academy.devdojo.maratonajava.javacore.Eblocosdeinicializacao.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }
        ;
    }
}
