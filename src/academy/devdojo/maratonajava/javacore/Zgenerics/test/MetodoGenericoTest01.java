package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.List;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

public class MetodoGenericoTest01 {

	public static void main(String[] args) {

		List<Barco> barcoList = criarArrayComUmObjeto(new Barco("Canoa Marota"));
		System.out.println(barcoList);
	}

	private static <T> List<T> criarArrayComUmObjeto(T t) {
		return List.of(t);
	}
}
