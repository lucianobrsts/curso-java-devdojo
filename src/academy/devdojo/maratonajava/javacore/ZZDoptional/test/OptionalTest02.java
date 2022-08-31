package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import java.util.Optional;

import academy.devdojo.maratonajava.javacore.ZZDoptional.domain.Manga;
import academy.devdojo.maratonajava.javacore.ZZDoptional.repository.MangaRepository;

public class OptionalTest02 {
	public static void main(String[] args) {

		Optional<Manga> mangaTitle = MangaRepository.findByTitle("Boku no Hero");
		mangaTitle.ifPresent(m -> m.setTitle("Boku no Hero 2"));
		System.out.println(mangaTitle);

		Manga mangaById = MangaRepository.findById(2).orElseThrow(IllegalArgumentException::new);

		System.out.println(mangaById);

		Manga newManga = MangaRepository.findByTitle("Drifters").orElseGet(() -> new Manga(3, "Drifters", 20));

		System.out.println(newManga);
	}
}
