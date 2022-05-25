package academy.devdojo.maratonajava.javacore.kenum.teste;

import academy.devdojo.maratonajava.javacore.kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
