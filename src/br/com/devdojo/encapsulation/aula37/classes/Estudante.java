package br.com.devdojo.encapsulation.aula37.classes;

import java.text.DecimalFormat;

public class Estudante {

    private String nome;
    private int idade;
    private double[] notas;
    private boolean aprovado;

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

        if (this.notas != null) {
            for (double nota : this.notas) {
                System.out.println("Notas: " + nota);

            }
        }
    }

    public void calculaMedia() {
        double media = 0;
        DecimalFormat df = new DecimalFormat("##.00");
        String res;

        if (this.notas == null) {
            System.out.println("Esse aluno não possui notas...");
            return;
        }

        for (double nota : this.notas) {
            media += nota;
        }

        media = media / this.notas.length;
        System.out.println("\nMédia: " + df.format(media));

        if (media > 6) {
            this.aprovado = true;
            res = "Aprovado";
        } else {
            this.aprovado = false;
            res = "Reprovado";
        }

        System.out.println("\nResultado: " + res);
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

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public boolean isAprovado() {
        return aprovado;
    }
}