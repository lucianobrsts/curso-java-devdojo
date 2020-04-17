package br.com.devdojo.polymorphism.classes;

public class Gerente extends Funcionario {

    private double participacaoNoLucro;

    public Gerente(String nome, double salario, double participacaoNoLucro) {
        super(nome, salario);
        this.participacaoNoLucro = participacaoNoLucro;
    }

    @Override
    public void calculaPagamento() {
        this.salario = this.salario + participacaoNoLucro;
    }

    public double getParticipacaoNoLucro() {
        return participacaoNoLucro;
    }

    public void setParticipacaoNoLucro(double participacaoNoLucro) {
        this.participacaoNoLucro = participacaoNoLucro;
    }
}
