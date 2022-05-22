package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Avenida Washington Soares, UNI7");
        Seminario seminario = new Seminario("Desvendando Java", null, local);

        Aluno aluno = new Aluno("Luciano Brito", 20, seminario);
        Seminario[] seminariosDisponiveis = {seminario};
        Professor professor = new Professor("Chico Henrique", "Mestre Jedi", seminariosDisponiveis);

        Aluno[] alunosInscritos = {aluno};
        seminario.setAlunos(alunosInscritos);

        professor.imprime();

    }
}
