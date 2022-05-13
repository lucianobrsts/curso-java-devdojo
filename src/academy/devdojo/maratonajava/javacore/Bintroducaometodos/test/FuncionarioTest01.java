package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Luciano Brito";
        funcionario.idade = 30;
        funcionario.salarios= new double[]{3500.00, 3500.00, 5000.00};

        funcionario.imprime(funcionario.salarios);
    }
}
