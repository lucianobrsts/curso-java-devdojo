package br.com.devdojo.associationandinheritance.overriding.test;

import br.com.devdojo.associationandinheritance.overriding.classes.Pessoa;

public class SobrescritaTest {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Joaquim da Esquina");
        pessoa.setIdade(300);

        System.out.println(pessoa);
    }

}
