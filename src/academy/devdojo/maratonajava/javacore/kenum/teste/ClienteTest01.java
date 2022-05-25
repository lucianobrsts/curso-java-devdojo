package academy.devdojo.maratonajava.javacore.kenum.teste;

import academy.devdojo.maratonajava.javacore.kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.kenum.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.kenum.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calculaDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calculaDesconto(100));

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente);
        TipoCliente tipoCliente2 = TipoCliente.tipoClienteNomePorRelatorio("Pessoa Fisica");
        System.out.println(tipoCliente2);
    }
}
