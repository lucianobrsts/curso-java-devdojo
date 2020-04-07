package br.com.devdojo.constructors.aula39.test;

import br.com.devdojo.constructors.aula39.classes.Funcionario;

public class FuncionarioTest {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Chica da Silva", "123.456.789-00", 4500, "11111111111");

        Funcionario funcionario2 = new Funcionario("Luciano Brito", "Luciano Brito", 5000, "11111111111" );

        funcionario.imprime();
        System.out.println("-----------------");
        funcionario2.imprime();
    }
}
