package br.com.devdojo.polymorphism.test;

import br.com.devdojo.polymorphism.classes.Funcionario;
import br.com.devdojo.polymorphism.classes.Gerente;
import br.com.devdojo.polymorphism.classes.RelatorioPagamento;
import br.com.devdojo.polymorphism.classes.Vendedor;

public class PolimorfismoTest {

    public static void main(String[] args) {

        Gerente gerente = new Gerente("Osvaldo", 5000, 2000);
        Vendedor vendedor = new Vendedor("Yuri",2000, 20000);

        RelatorioPagamento relatorio = new RelatorioPagamento();
//        relatorio.relatorioPagamentoGerente(gerente);
//        System.out.println("---------------------");
//        relatorio.relatorioPagamentoVendedor(vendedor);
//        System.out.println("----------------------");
        relatorio.relatorioPagamentoGenerico(gerente);
        System.out.println("----------------------");
        relatorio.relatorioPagamentoGenerico(vendedor);

        Funcionario funcionario = gerente;
        System.out.println("#########################");
        System.out.println(funcionario.getSalario());
    }
}
