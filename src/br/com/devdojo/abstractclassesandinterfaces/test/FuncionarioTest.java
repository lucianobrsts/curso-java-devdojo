package br.com.devdojo.abstractclassesandinterfaces.test;

import br.com.devdojo.abstractclassesandinterfaces.classes.Gerente;
import br.com.devdojo.abstractclassesandinterfaces.classes.Vendedor;

public class FuncionarioTest {

    public static void main(String[] args) {

        Gerente gerente = new Gerente("Anna", "2344-2", 2000);
        Vendedor vendedor = new Vendedor("Camila", "222111-4", 1500, 5000);

        gerente.calculaSalario();
        vendedor.calculaSalario();

        System.out.println(gerente);
        System.out.println("-------------------");
        System.out.println(vendedor);
    }
}
