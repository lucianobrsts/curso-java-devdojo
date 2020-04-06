package br.com.devdojo.classesandobjects.aula35.classes;

import java.text.DecimalFormat;

public class Estudante {

    public String nome;
    public int idade;
    public double[] notas;


    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

        if (notas != null) {
            for (double nota : notas) {
                System.out.println("Notas: " + nota);

            }
        }
    }

    public void calculaMedia() {
        double media = 0;
        DecimalFormat df = new DecimalFormat("##.00");
        String res;

        if (notas == null) {
            System.out.println("Esse aluno não possui notas...");
            return;
        }

        for (double nota : notas) {
            media += nota;
        }

        media = media / notas.length;
        System.out.println("\nMédia: " + df.format(media));

        if (media > 6) {
            res = "Aprovado";
        } else {
            res = "Reprovado";
        }
        System.out.println("\nResultado: " + res);

    }
}
