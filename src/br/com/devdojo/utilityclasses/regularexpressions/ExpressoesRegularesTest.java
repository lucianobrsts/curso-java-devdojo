package br.com.devdojo.utilityclasses.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {

    public static void main(String[] args) {

        String regex = "aba";
        String texto = "abababa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto: " + texto);
        System.out.println("Indice: 0123456789");
        System.out.println("Expressão: " + matcher.pattern());
        System.out.println("Posições Encontradas: ");

        while (matcher.find()) {
            System.out.print(matcher.start() + " ");
        }
    }
}
