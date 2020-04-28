package br.com.devdojo.inputandoutput.io.test;

import java.io.Console;

public class ConsoleTest {

    public static void main(String[] args) {
        Console c = System.console();
        char[] pw = c.readPassword("%s", "pw: ");
        for (char pass : pw) {
            c.format("%c", pass);
        }
        c.format("\n");
        String texto = "";
        while (!texto.equalsIgnoreCase("s")) {
            texto = c.readLine("%s", "\nDigite: ");
            c.format("esse texto %s foi digitado", retorno(texto));

            if(texto.equalsIgnoreCase("s")) {
                System.out.println("\nPrograma Encerrado.");
            }
        }
    }

    public static String retorno(String args1) {
        return args1;
    }
}
