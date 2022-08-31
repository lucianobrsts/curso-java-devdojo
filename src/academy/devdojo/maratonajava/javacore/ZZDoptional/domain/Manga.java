package academy.devdojo.maratonajava.javacore.ZZDoptional.domain;

public class Manga {

	private Integer id;
	private String title;
	private int chapter;

	public Manga(Integer id, String title, int chapter) {
		super();
		this.id = id;
		this.title = title;
		this.chapter = chapter;
	}

	@Override
	public String toString() {
		return "Manga [id=" + id + ", title=" + title + ", chapter=" + chapter + "]";
	}

	public Integer getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public int getChapter() {
		return chapter;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setChapter(int chapter) {
		this.chapter = chapter;
	}
	
	

}
