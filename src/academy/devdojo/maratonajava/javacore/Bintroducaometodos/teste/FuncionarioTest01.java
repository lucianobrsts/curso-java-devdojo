package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Luciano Brito");
        funcionario.setIdade(30);
        funcionario.setSalarios(new double[]{3500.00, 3500.00, 5000.00});

        funcionario.imprime();
        System.out.println("Media: " + funcionario.getTotalMedia());
    }
}
