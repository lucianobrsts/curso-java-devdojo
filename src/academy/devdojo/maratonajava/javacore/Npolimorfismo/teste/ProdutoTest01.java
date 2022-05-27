package academy.devdojo.maratonajava.javacore.Npolimorfismo.teste;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Nuc10i7", 11000);
        Tomate tomate = new Tomate("Tomate cereja", 10);

        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("----------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
