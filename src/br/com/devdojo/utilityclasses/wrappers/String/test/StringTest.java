package br.com.devdojo.utilityclasses.wrappers.String.test;

public class StringTest {
//Strings são imutáveis

    public static void main(String[] args) {

        String nome = "Luciano";
        nome = nome.concat(" Suane");

        //Nesse caso procura-se no pool se strings se já uma string com o mesmo nome e do mesmo formato..
        // se ouver a referência vai para ele, caso não ele cria uma outra.
        String nome2 = "Luciano";

        //Nesse caso cria-se
        //1- Variável de referência
        //2- Um objeto do tipo String
        //3- Uma String no pool de strings
        String nome3 = new String("Catarina");

        String teste = "Goku";
        String teste2 = "     0123456789          ";
        String teste3 = "aaaooo";

        System.out.println(teste.charAt(3));
        System.out.println(teste.equalsIgnoreCase(teste2));
        System.out.println(teste.length());
        System.out.println(teste3.replace('o','a'));
        System.out.println(teste2.toLowerCase());
        System.out.println(teste2.toUpperCase());
        System.out.println(teste2.substring(0, 5));
        System.out.println(teste2.trim());

        System.out.println(nome);
    }
}
