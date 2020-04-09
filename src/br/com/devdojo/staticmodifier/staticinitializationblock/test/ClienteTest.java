package br.com.devdojo.staticmodifier.staticinitializationblock.test;

import br.com.devdojo.staticmodifier.staticinitializationblock.classes.Cliente;

public class ClienteTest {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        Cliente cliente2 = new Cliente();
        Cliente cliente3 = new Cliente();
        System.out.println("Exibindo quantidade de parcelas possíveis");

//        for(int parcela : cliente.getParcelas()) {
//            System.out.print(parcela + " ");
//        }

        System.out.println(Cliente.getParcelas().length);
    }
}
