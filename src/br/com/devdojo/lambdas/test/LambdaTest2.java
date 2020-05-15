package br.com.devdojo.lambdas.test;

import br.com.devdojo.lambdas.classes.Carro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

import static java.util.Arrays.asList;

public class LambdaTest2 {
    public static void main(String[] args) {
        forEach(asList("Luciano", "DevDojo", "Teste Propaganda"), (String s) -> System.out.println(s));
        List<Integer> list = map(asList("Luciano", "DevDojo", "Teste Propaganda"), (String s) -> s.length());
        List<Carro> carros = asList(new Carro("verde", 2011), new Carro("preto", 2011), new Carro("preto", 2011));
        List<String> listCores = map(carros, (Carro c) -> c.getCor());
        System.out.println(list);

        Predicate<Integer> pares = (Integer i) -> i % 2 == 0;
        IntPredicate impar = (int i) -> i % 2 == 1;

        System.out.println(pares.test(1000));
        System.out.println(impar.test(1000));

        String cor = "VERMELHO";
        Predicate<String> p = (String s) -> listCores.add(s);
        Consumer<String> b = s -> listCores.add(cor);

        b.accept("Amarelo");
        Supplier<String> sup1 = () -> "oi";
        Supplier<Carro> sup2 = () -> new Carro("Preto", 2011);

//        System.out.println(listCores);
        System.out.println(sup2.get());
    }

    public static <T> void forEach(List<T> list, Consumer<T> c) {
        for (T e : list) {
            c.accept(e);
        }
    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> f) {
        List<R> result = new ArrayList<>();
        for (T e : list) {
            result.add(f.apply(e));
        }
        return result;
    }
}
