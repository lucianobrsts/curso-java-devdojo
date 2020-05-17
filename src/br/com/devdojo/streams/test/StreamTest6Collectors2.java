package br.com.devdojo.streams.test;

import br.com.devdojo.streams.classes.Genero;
import br.com.devdojo.streams.classes.Maioridade;
import br.com.devdojo.streams.classes.Pessoa;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamTest6Collectors2 {
    public static void main(String[] args) {
        //Conteúdo da aula: Agrupamento de elementos
        //Particionamento de elementos

        List<Pessoa> pessoas = Pessoa.bancodePessoas();
        Map<Genero, List<Pessoa>> generoListMap = new HashMap<>();
        List<Pessoa> masculinos = new ArrayList<>();
        List<Pessoa> femininos = new ArrayList<>();
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getGenero().equals(Genero.FEMINIMO)) {
                femininos.add(pessoa);
            } else {
                masculinos.add(pessoa);
            }
        }
        generoListMap.put(Genero.FEMINIMO, femininos);
        generoListMap.put(Genero.MASCULINO, masculinos);
        System.out.println(generoListMap);

        //Usando agrupamento
        //Agrupamento por genero
        Map<Genero, List<Pessoa>> collect = pessoas.stream().collect(groupingBy(Pessoa::getGenero));
        System.out.println(collect);

        //Agrupamento por maior idade
        Map<Maioridade, List<Pessoa>> collect1 = pessoas.stream().collect(groupingBy(p -> {
            if (p.getIdade() < 18) return Maioridade.MENOR;
            else return Maioridade.ADULTO;
        }));
        System.out.println(collect1);

        //Agrupamento por genero e maioridade
        //Map<Genero, Map<Maioridade, List<Pessoa>>
        Map<Genero, Map<Maioridade, List<Pessoa>>> collect2 = pessoas.stream()
                .collect(groupingBy(Pessoa::getGenero, groupingBy(p -> {
            if (p.getIdade() < 18) return Maioridade.MENOR;
            else return Maioridade.ADULTO;
        })));
        System.out.println(collect2);

        //Agrupando por genero e quantidade
        Map<Genero, Long> collect3 = pessoas.stream()
                .collect(groupingBy(Pessoa::getGenero, Collectors.counting()));
        System.out.println(collect3);

        //Agrupando por genero e maior salário, retornando um optional
        Map<Genero, Optional<Pessoa>> collect4 = pessoas.stream()
                .collect(groupingBy(Pessoa::getGenero, Collectors.maxBy(Comparator.comparing(Pessoa::getSalario))));
        System.out.println(collect4);

        //Agrupando por genero e maior salário, retornando uma pessoa
        Map<Genero, Pessoa> collect5 = pessoas.stream()
                .collect(groupingBy(Pessoa::getGenero, collectingAndThen(Collectors.maxBy(Comparator.comparing(Pessoa::getSalario)),
                        Optional::get)));
        System.out.println(collect5);

        //Agrupando por genero e estatistica
        Map<Genero, DoubleSummaryStatistics> collect6 = pessoas.stream()
                .collect(groupingBy(Pessoa::getGenero, summarizingDouble(Pessoa::getSalario)));
        System.out.println(collect6);

        //Agrupando por genero e maior idade simples
        Map<Genero, Set<Maioridade>> collect7 = pessoas.stream().collect(groupingBy(Pessoa::getGenero, mapping(p -> {
            if (p.getIdade() < 18) return Maioridade.MENOR;
            else return Maioridade.ADULTO;
        }, toSet())));
        System.out.println(collect7);

        Map<Genero, Set<Maioridade>> collect8 = pessoas.stream().collect(groupingBy(Pessoa::getGenero, mapping(p -> {
            if (p.getIdade() < 18) return Maioridade.MENOR;
            else return Maioridade.ADULTO;
        }, toCollection(LinkedHashSet::new))));
        System.out.println(collect8);
    }
}
