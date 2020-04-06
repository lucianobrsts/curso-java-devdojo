package br.com.devdojo.classesandobjects.aula35.test;

import br.com.devdojo.classesandobjects.aula35.classes.Estudante;

public class EstudanteTest {

    public static void main(String[] args) {

        Estudante estudante = new Estudante();

        estudante.nome = "Luciano Brito";
        estudante.idade = 40;
        estudante.notas = new double[]{5, 3, 6};

        estudante.imprime();

        estudante.calculaMedia();


    }


}
