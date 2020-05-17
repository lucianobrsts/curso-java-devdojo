package br.com.devdojo.streams.test;

import br.com.devdojo.streams.classes.Pessoa;

import java.util.Optional;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class StreamsTest4Reduce {
    public static void main(String[] args) {
        Optional<Integer> reduce = getStream().reduce((x, y) -> x + y);
        System.out.println(reduce.get());

        Integer soma = getStream().reduce(0, (x, y) -> x + y);
        System.out.println(soma);

        Optional<Integer> soma2 = getStream().reduce(Integer::sum);
        System.out.println(soma2.get());

        Integer mult = getStream().reduce(1, (x, y) -> x * y);
        System.out.println(mult);

        Optional<Integer> max = getStream().reduce((x, y) -> x > y ? x : y);
        System.out.println(max.get());

        Optional<Integer> max2 = getStream().reduce(Integer::max);
        System.out.println(max2.get());

        Optional<Integer> minimo = getStream().reduce(Integer::min);
        System.out.println(minimo.get());

        Stream<Pessoa> streamPessoa = Pessoa.bancodePessoas().stream();
        Optional<Double> somaSalario = streamPessoa.filter(p -> p.getSalario() > 4000)
                .map(Pessoa::getSalario)
                .reduce(Double::sum);
        System.out.println(somaSalario.get());

        Double somaDouble = Pessoa.bancodePessoas().stream().filter(p -> p.getSalario() > 4000)
                .mapToDouble(Pessoa::getSalario)
                .sum();
        System.out.println(somaDouble);

        DoubleStream doubleStream = Pessoa.bancodePessoas().stream().filter(p -> p.getSalario() > 4000)
                .mapToDouble(Pessoa::getSalario);
        Stream<Double> doubleStream2 = doubleStream.boxed();


    }

    private static Stream<Integer> getStream() {
        return asList(1, 2, 3, 4, 5, 6).stream();
    }
}
