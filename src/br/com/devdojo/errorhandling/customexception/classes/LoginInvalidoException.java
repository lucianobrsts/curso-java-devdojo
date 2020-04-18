package br.com.devdojo.errorhandling.customexception.classes;

public class LoginInvalidoException extends Exception {
    public LoginInvalidoException() {
        super("Usuário ou senha inválidos");
    }
}
