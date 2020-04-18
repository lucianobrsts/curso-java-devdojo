package br.com.devdojo.errorhandling.customexception.test;

import br.com.devdojo.errorhandling.customexception.classes.LoginInvalidoException;

public class CustomExceptionTest {

    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }

    }

    private static void logar() throws LoginInvalidoException {
        String BancoDeDados = "Goku";
        String senhaBancoDeDados = "111";
        String usuarioDigitado = "Goku";
        String senhaDigitada = "123";

        if (!BancoDeDados.equals(usuarioDigitado) || !senhaBancoDeDados.equals(senhaDigitada)) {
            throw new LoginInvalidoException();
        } else {
            System.out.println("Usuário logado com sucesso...");
        }
    }
}
