package br.com.devdojo.classesandobjects.aula24.classestest;

import br.com.devdojo.classesandobjects.aula24.classes.Estudante;

public class EstudanteTest {

    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        estudante.nome = "João";
        estudante.matricula = "1212";
        estudante.idade = 15;

        System.out.println("Nome: " + estudante.nome);
        System.out.println("Matrícula: " + estudante.matricula);
        System.out.println("Idade: " + estudante.idade);
    }
}
