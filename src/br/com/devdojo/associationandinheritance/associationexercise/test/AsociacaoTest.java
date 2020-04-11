package br.com.devdojo.associationandinheritance.associationexercise.test;

import br.com.devdojo.associationandinheritance.associationexercise.classes.Aluno;
import br.com.devdojo.associationandinheritance.associationexercise.classes.Local;
import br.com.devdojo.associationandinheritance.associationexercise.classes.Professor;
import br.com.devdojo.associationandinheritance.associationexercise.classes.Seminario;

public class AsociacaoTest {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("Luciano Brito", 44);
        Aluno aluno2 = new Aluno("João Bidu", 30);

        Seminario seminario = new Seminario("Como ser um baita programador e ficar rico...");
        Professor professor = new Professor("Yoda", "Usar a força para programar");

        Local local = new Local("Rua das araras", "Mato");

        aluno.setSeminario(seminario);
        aluno2.setSeminario(seminario);

        seminario.setProfessores(professor);
        seminario.setLocal(local);
        seminario.setAlunos(new Aluno[]{aluno, aluno2});

        Seminario[] semArray = new Seminario[1];
        semArray[0] = seminario;
        professor.setSeminarios(semArray);

        seminario.print();
        professor.print();
    }
}
