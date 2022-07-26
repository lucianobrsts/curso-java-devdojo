package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class SmartphoneTest01 {
	public static void main(String[] args) {
		Smartphone s1 = new Smartphone("1ABC1", "IPhone");
		Smartphone s2 = new Smartphone("22222", "Pixel");
		Smartphone s3 = new Smartphone("33333", "Samsung");

		List<Smartphone> smartphones = new ArrayList<>(6);
		smartphones.add(s1);
		smartphones.add(s2);
		smartphones.add(s3);

		for (Smartphone smartphone : smartphones) {
			System.out.println(smartphone);
		}

		Smartphone s4 = new Smartphone("333334", "Pixel");

		if (smartphones.contains(s4)) {
			System.out.println("Contem o smartphone: Sim...");
		} else {
			System.out.println("Contem o smartphone: Não...");
		}

		System.out.println();
		int indexSmartphone4 = smartphones.indexOf(s4);
		System.out.println("Índice encontrado na posição: " + indexSmartphone4);
		
		if(indexSmartphone4 != -1) {
			System.out.println("Smartphone na posição: " + indexSmartphone4 + ": " + smartphones.get(indexSmartphone4));
		} else {
			System.out.println("Smartphone não encontrado...");
		}
	}
}
