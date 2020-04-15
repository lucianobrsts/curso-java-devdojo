package br.com.devdojo.enums.tests;

import br.com.devdojo.enums.classes.Cliente;
import br.com.devdojo.enums.classes.TipoCliente;

public class ClienteTest {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Anna", TipoCliente.PESSOA_FISICA);
        System.out.println(cliente);

    }
}
