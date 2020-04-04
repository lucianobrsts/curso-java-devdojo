package br.com.devdojo.classesandobjects.aula31.test;

import br.com.devdojo.classesandobjects.aula31.classes.Professor;

public class ProfessorTest {

    public static void main(String[] args) {

        Professor professor = new Professor();
        professor.nome = "Luciano Brito";
        professor.matricula = "12345";
        professor.rg = "1213141995-67";
        professor.cpf = "123.456.789-00";

        Professor professor2 = new Professor();
        professor2.nome = "Assis Silva";
        professor2.matricula = "54321";
        professor2.rg = "8282373777-88";
        professor2.cpf = "122.654.987-00";

        professor.imprimir(professor);
        System.out.println();
        professor.imprimir(professor2);

    }
}
