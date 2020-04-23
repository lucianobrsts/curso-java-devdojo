package br.com.devdojo.utilityclasses.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {

    public static void main(String[] args) {
        //Meta Caracteres:
        // \d ==> Busca em uma frase, em um texto todos os dígitos.
        // \D ==> Encontra todos os caracteres que não são dígitos.
        // \s ==> Encontra espaços em branco \t \n \f \r.
        // \S ==> Caracter que não é espaço em branco.
        // \w ==> Procura por caracteres de palavras a - z, A - Z, digitos e _
        // \W ==> Encontrar tudo que não for caracteres de palavra.

        String regex = "\\W";
        String texto = "#@hab1278 \r_";
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
