package br.com.devdojo.associationandinheritance.inheritance.classes;

public class Funcionario extends Pessoa {

    private double salario;

    public void imprime() {
        super.imprime();
        System.out.println("Salário: " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
