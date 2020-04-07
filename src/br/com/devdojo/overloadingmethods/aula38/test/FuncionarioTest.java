package br.com.devdojo.overloadingmethods.aula38.test;

import br.com.devdojo.overloadingmethods.aula38.classes.Funcionario;

public class FuncionarioTest {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.init("Chica da Silva", "123.456.789-00", 4500, "11111111111");

        Funcionario funcionario2 = new Funcionario();
        funcionario2.init("Luciano Brito", "Luciano Brito", 5000, "11111111111" );

        funcionario.imprime();
        System.out.println("-----------------");
        funcionario2.imprime();
    }
}
