package br.com.devdojo.optional.test;

import br.com.devdojo.optional.classes.Carro;
import br.com.devdojo.optional.classes.Pessoa;
import br.com.devdojo.optional.classes.Seguradora;

import java.util.Optional;

public class OptionalTest2 {
    public static void main(String[] args) {
        Seguradora seguradora = new Seguradora("DevDojo Seguros");
        Carro carro = new Carro(seguradora, "Audi");
        Pessoa p = new Pessoa(carro, "Carlos");

        obterNomeSeguradora(Optional.ofNullable(p));
    }

    public static String obterNomeSeguradora(Optional<Pessoa> p) {
        return p.flatMap(Pessoa::getCarro)
                .flatMap(Carro::getSeguradora)
                .map(Seguradora::getNome)
                .orElse("Não existe seguradora.");
    }
}
