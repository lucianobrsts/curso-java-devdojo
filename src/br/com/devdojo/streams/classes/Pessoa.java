package br.com.devdojo.streams.classes;

import java.util.List;

import static java.util.Arrays.asList;

public class Pessoa {
    private String nome;
    private int idade;
    private double salario;

    public Pessoa(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public static List<Pessoa> bancodePessoas() {
        return asList(
                new Pessoa("Luciano", 45, 2000),
                new Pessoa("Mercy", 28, 3500),
                new Pessoa("Anna", 19, 950),
                new Pessoa("Artur", 27, 400),
                new Pessoa("David", 22, 1800),
                new Pessoa("Lucas", 23, 6600),
                new Pessoa("Raphael", 24, 2200),
                new Pessoa("Derlan", 40, 1300),
                new Pessoa("Mayrton", 23, 5000)
        );
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
