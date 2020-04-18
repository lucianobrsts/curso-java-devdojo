package br.com.devdojo.errorhandling.checkedexception.test;

import br.com.devdojo.errorhandling.checkedexception.classes.Funcionario;
import br.com.devdojo.errorhandling.checkedexception.classes.Pessoa;
import br.com.devdojo.errorhandling.customexception.classes.LoginInvalidoException;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        Pessoa pessoa = new Pessoa();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
