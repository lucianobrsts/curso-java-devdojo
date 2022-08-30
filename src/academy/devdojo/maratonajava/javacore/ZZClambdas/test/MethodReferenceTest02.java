package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

//Reference to an instance method of a particular object
public class MethodReferenceTest02 {
	public static void main(String[] args) {

		List<Anime> animeList = new ArrayList<>(
				List.of(new Anime("Berserk", 43), new Anime("One Piece", 900), new Anime("Naruto", 500)));
		animeList.sort(AnimeComparators::compareByEpisodesNonStatic);
		animeList.sort((a1, a2) -> AnimeComparators.compareByEpisodesNonStatic(a1, a2));
		System.out.println(animeList);
	}

}
