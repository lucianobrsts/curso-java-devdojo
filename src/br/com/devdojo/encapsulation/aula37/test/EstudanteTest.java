package br.com.devdojo.encapsulation.aula37.test;

import br.com.devdojo.encapsulation.aula37.classes.Estudante;

public class EstudanteTest {

    public static void main(String[] args) {

        Estudante estudante = new Estudante();

        estudante.setNome("Luciano Brito");
        estudante.setIdade(40);
        estudante.setNotas(new double[]{5, 3, 6});

        estudante.imprime();

        estudante.calculaMedia();

        System.out.println("Aprovado?: " + estudante.getAprovado());
    }
}
