package br.com.devdojo.constructors.aula40.test;

import br.com.devdojo.constructors.aula40.classes.Estudante;

public class EstudanteTest {

    public static void main(String[] args) {

        Estudante estudante = new Estudante("121212", "Carlitos", new double[]{5, 7, 9}, "13/04/2016");
        estudante.imprime();

    }
}
