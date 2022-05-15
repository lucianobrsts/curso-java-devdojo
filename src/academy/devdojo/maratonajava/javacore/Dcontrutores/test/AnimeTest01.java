package academy.devdojo.maratonajava.javacore.Dcontrutores.test;

import academy.devdojo.maratonajava.javacore.Dcontrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "TV", 12, "Ação", "Producto IG");
        anime.imprime();
    }
}
