package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.List;

public class WildcardTest2 {
	public static void main(String[] args) {
		List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
		List<Gato> gatos = List.of(new Gato(), new Gato());
	}

//	Type Erasure
	private static void printConsulta(List<Animal> animals) {
		for (Animal animal : animals) {
			animal.consulta();
		}
		animals.add(new Cachorro());
	}
}
