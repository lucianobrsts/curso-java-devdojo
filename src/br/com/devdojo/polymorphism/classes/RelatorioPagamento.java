package br.com.devdojo.polymorphism.classes;

public class RelatorioPagamento {

//    public void relatorioPagamentoGerente(Gerente gerente) {
//        System.out.println("Gerando relatório de pagamento para a gerência:");
//        gerente.calculaPagamento();
//        System.out.println("Nome: " + gerente.getNome());
//        System.out.println("Salário desse mês: " + gerente.getSalario());
//    }
//
//    public void relatorioPagamentoVendedor(Vendedor vendedor) {
//        System.out.println("Gerando relatório de pagamento para os vendedores:");
//        vendedor.calculaPagamento();
//        System.out.println("Nome: " + vendedor.getNome());
//        System.out.println("Salário desse mês: " + vendedor.getSalario());
//    }

    public void relatorioPagamentoGenerico(Funcionario funcionario) {
        System.out.println("Gerando relatório de pagamento para os Funcionários:");
        funcionario.calculaPagamento();
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário desse mês: " + funcionario.getSalario());
    }
}
