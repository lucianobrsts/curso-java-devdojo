package br.com.devdojo.errorhandling.checkedexception.test;

import br.com.devdojo.errorhandling.checkedexception.classes.Funcionario;
import br.com.devdojo.errorhandling.checkedexception.classes.Pessoa;

public class SobrescritaComExceptionTest {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        Pessoa pessoa = new Pessoa();

        funcionario.salvar();
    }
}
