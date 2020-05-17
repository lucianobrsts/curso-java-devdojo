package br.com.devdojo.streams.test;

import br.com.devdojo.streams.classes.Pessoa;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

public class StreamTest6Collectors1 {
    //Redução e sumarização de Streams em um valor único
    // Agrupamento de elementos
    //Particionamento de elementos

    public static void main(String[] args) {
        List<Pessoa> pessoas = Pessoa.bancodePessoas();
        //conta
        System.out.println(pessoas.stream().count());
        System.out.println(pessoas.stream().collect(counting()));

        //Maior valor
        Optional<Pessoa> max = pessoas.stream().max(comparing(Pessoa::getSalario));
        System.out.println(max.get().getSalario());

        //maior valor
        Optional<Pessoa> collect = pessoas.stream().max(comparing(Pessoa::getSalario));
        System.out.println(collect.get().getSalario());

        //menor valor
        Optional<Pessoa> min = pessoas.stream().min(comparing(Pessoa::getSalario));
        System.out.println(min.get().getSalario());

        //soma
        System.out.println(pessoas.stream().mapToDouble(Pessoa::getSalario).sum());
        System.out.println(pessoas.stream().collect(summingDouble(Pessoa::getSalario)));

        //média
        System.out.println(pessoas.stream().mapToDouble(Pessoa::getSalario).average());
        System.out.println(pessoas.stream().collect(averagingDouble(Pessoa::getSalario)));

        //todas as operações
        DoubleSummaryStatistics collect2 = pessoas.stream().collect(summarizingDouble(Pessoa::getSalario));
        System.out.println(collect2);

        //concatena
        System.out.println(pessoas.stream().map(Pessoa::getNome).collect(joining()));
        System.out.println(pessoas.stream().map(Pessoa::getNome).collect(joining(", ")));
    }

}
