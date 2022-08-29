package academy.devdojo.maratonajava.javacore.ZZClambdas.dominio;

public class Anime {

	private String title;
	private int episodes;

	public Anime(String title, int quantity) {
		super();
		this.title = title;
		this.episodes = quantity;
	}

	@Override
	public String toString() {
		return "Anime [title=" + title + ", epsidodes=" + episodes + "]";
	}

	public String getTitle() {
		return title;
	}

	public int getEpisodes() {
		return episodes;
	}

}
