package br.com.devdojo.optional.test;

import br.com.devdojo.optional.classes.Carro;
import br.com.devdojo.optional.classes.Pessoa;
import br.com.devdojo.optional.classes.Seguradora;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalTest2 {
    public static void main(String[] args) {
        Seguradora seguradora = new Seguradora("DevDojo Seguros");
        Carro carro = new Carro(seguradora, "Audi");
        Pessoa p = new Pessoa(carro, "Carlos");

        obterNomeSeguradora(Optional.ofNullable(p));
        checarNomeSeguradora(seguradora);
        checarNomeSeguradoraOptional(seguradora);

        p.setIdade(20);
        System.out.println(obterNomeSeguradoraComIdade(p, 18));

        Map<String, String> map = new HashMap<>();
        System.out.println(Optional.ofNullable(map.get("kaka")).orElse("Map vazio."));

        stringToInt("A");

    }

    private static Optional<Integer> stringToInt(String numero) {
        try {
           return Optional.of(Integer.parseInt(numero));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }

    private static void checarNomeSeguradora(Seguradora seguradora) {
        if(seguradora != null && seguradora.getNome().equals("DevDojo Seguros")) {
            System.out.println("é o DevDojo");
        }
    }

    private static void checarNomeSeguradoraOptional(Seguradora seguradora) {
        Optional.ofNullable(seguradora).filter(s -> s.getNome().equals("DevDojo Seguros"))
                .ifPresent(x -> System.out.println("é o DevDojo"));
    }

    private static String obterNomeSeguradoraComIdade(Pessoa p, int idadeMinima) {
        return Optional.ofNullable(p).filter(pessoa -> pessoa.getIdade() >= idadeMinima)
                .flatMap(Pessoa::getCarro)
                .flatMap(Carro::getSeguradora)
                .map(Seguradora::getNome)
                .orElse("Não existe seguradora ou a idade mínima não foi atingida");
    }

    public static String obterNomeSeguradora(Optional<Pessoa> p) {
        return p.flatMap(Pessoa::getCarro)
                .flatMap(Carro::getSeguradora)
                .map(Seguradora::getNome)
                .orElse("Não existe seguradora.");
    }
}
