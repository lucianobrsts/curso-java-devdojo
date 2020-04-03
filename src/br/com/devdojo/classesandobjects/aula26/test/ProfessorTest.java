package br.com.devdojo.classesandobjects.aula26.test;

import br.com.devdojo.classesandobjects.aula26.classes.Professor;

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

        System.out.println("**** -- Dados Professor -- ****");
        System.out.println("Nome: " + professor.nome);
        System.out.println("Matrícula: " + professor.matricula);
        System.out.println("RG: " + professor.rg);
        System.out.println("CPF: " + professor.cpf);

        System.out.println();
        System.out.println("**** -- Dados Professor 2 -- ****");
        System.out.println("Nome: " + professor2.nome);
        System.out.println("Matrícula: " + professor2.matricula);
        System.out.println("RG: " + professor2.rg);
        System.out.println("CPF: " + professor2.cpf);
    }
}
