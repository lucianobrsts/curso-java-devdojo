package br.com.devdojo.lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import static java.util.Arrays.asList;

public class LambdaTest2 {
    public static void main(String[] args) {
        forEach(asList("Luciano", "DevDojo", "Teste Propaganda"), (String s) -> System.out.println(s));
        List<Integer> list = map(asList("Luciano", "DevDojo", "Teste Propaganda"), (String s) -> s.length());
        System.out.println(list);
    }

    public static <T> void forEach(List<T> list, Consumer<T> c) {
        for(T e : list) {
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
