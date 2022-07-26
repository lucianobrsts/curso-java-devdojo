package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>(16); // 1.5 java
		List<String> nomes2 = new ArrayList<>(16); // 1.5 java
		
		nomes.add("William");
		nomes.add("DevDojo");
		nomes2.add("Suane");
		nomes2.add("Academy");
		
		//System.out.println(nomes.remove("William"));
		nomes.addAll(nomes2);

		for (String nome : nomes) {
			System.out.println(nome);
		}
		System.out.println("-----------------");

		int size = nomes.size();
		for (int i = 0; i < size; i++) {
			System.out.println(nomes.get(i));
		}
	}
}
