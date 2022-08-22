package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.BarcoRentavelService;

public class ClasseGenericaTest2 {
	public static void main(String[] args) {

		BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
		Barco barco = barcoRentavelService.buscarBarcoDisponivel();
		System.out.println("Usando um barco por mês...");
		barcoRentavelService.retornarBarcoAlugado(barco);

	}

}
