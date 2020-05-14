package br.com.devdojo.designpattern.test;

import br.com.devdojo.designpattern.classes.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa.PessoaBuilder("Luciano")
                .nomeDoMeio("Brito")
                .ultimoNome("Santos")
                .nomeDoPai("Afonso")
                .apelido("Luh")
                .build();

        System.out.println(pessoa);

    }
}
