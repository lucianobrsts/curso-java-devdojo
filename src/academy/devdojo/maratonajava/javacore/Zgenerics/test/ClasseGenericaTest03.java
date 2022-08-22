package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.RentalService;

public class ClasseGenericaTest03 {
	public static void main(String[] args) {

		List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
		List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));
		RentalService<Carro> rentalServiceCarro = new RentalService<>(carrosDisponiveis);
		Carro carro = rentalServiceCarro.buscarObjetoDisponivel();
		System.out.println("Usando o carro por um m�s...");
		rentalServiceCarro.retornarObjetoAlugado(carro);

		System.out.println("--------------------");

		RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);
		Barco barco = rentalServiceBarco.buscarObjetoDisponivel();
		System.out.println("Usando o barco por um m�s...");
		rentalServiceBarco.retornarObjetoAlugado(barco);

	}

}
