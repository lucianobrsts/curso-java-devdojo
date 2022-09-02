package academy.devdojo.maratonajava.javacore.ZZEstreams.dominio;

import java.util.Objects;

public class LightNovel {

	private String title;
	private double price;

	public LightNovel(String title, double price) {
		super();
		this.title = title;
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		LightNovel other = (LightNovel) obj;
		return Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "LightNovel [title=" + title + ", price=" + price + "]";
	}

	public String getTitle() {
		return title;
	}

	public double getPrice() {
		return price;
	}

}
