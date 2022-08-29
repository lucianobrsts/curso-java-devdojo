package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

public class MethodReferenceTest01 {
	public static void main(String[] args) {

		List<Anime> animeList = new ArrayList<>(
				List.of(new Anime("Berserk", 43), new Anime("One Piece", 900), new Anime("Naruto", 500)));
		Collections.sort(animeList, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
		Collections.sort(animeList, AnimeComparators::compareByTitle);
		Collections.sort(animeList, AnimeComparators::compareByEpisodes);
		System.out.println(animeList);
	}

}
