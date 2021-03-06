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
        // []

        // existem 4 tipos de decodificadores
        // ? zero ou uma ocorrência
        // * zero ou mais ocorrência
        // + uma ou mais ocorrências
        //[m, m] de n até m ocorrência
        // ( ) agrupa uma expressão
        // | coloca ou
        // $ fim de linha
        // * coringa
        // ^ exclui algo que vc não quer na expressão regular

        // exemplos:
        // o(v|c)o = ovo, oco



        int hex = 0x1;
//        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
//        String texto = "12 0x 0X 0xFFABC 0x10G 0x1 ";

//        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+"; // "([\\w\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+"
//        String texto = "fulano@hotmail.com, 102Abc@gmail.com, *@!abrao@mail, teste@gmail.com.br, teste@mail";

//        String regex = "\\d{2}/\\d{2}/\\d{2,4}";
//        String texto = "05/10/2010 05/5/2015 1/1/01 01/05/95"; //dd/MM/yyyy

        String regex = "proj([^,])+";
        String texto = "porj1.bkp, proj1.java, proj1.class, proj1final.java, proj2.bkp, proj3.java, diagrama, texto, foto";

        System.out.println("Email válido: " + "*@!abrao@mail.br".matches(regex));
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto: " + texto);
        System.out.println("Indice: 0123456789");
        System.out.println("Expressão: " + matcher.pattern());
        System.out.println("Posições Encontradas: ");

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}
