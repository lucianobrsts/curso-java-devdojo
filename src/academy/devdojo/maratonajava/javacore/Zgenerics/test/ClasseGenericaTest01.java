package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
	public static void main(String[] args) {

		CarroRentavelService carroRentavelService = new CarroRentavelService();
		Carro carro = carroRentavelService.buscarCarroDisponivel();
		System.out.println("Usando um carro por m�s...");
		carroRentavelService.retornarCarroAlugado(carro);

	}

}
