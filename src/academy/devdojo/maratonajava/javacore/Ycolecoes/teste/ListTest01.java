package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>(16); // 1.5 java
		nomes.add("William");
		nomes.add("DevDojo Academy");

		for (String nome : nomes) {
			System.out.println(nome);
		}
		System.out.println("-----------------");

		nomes.add("Suane");
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
	}
}
