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

        System.out.println(nome);
    }
}
