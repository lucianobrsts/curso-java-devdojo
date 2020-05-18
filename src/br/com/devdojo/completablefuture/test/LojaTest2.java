package br.com.devdojo.completablefuture.test;

import br.com.devdojo.completablefuture.classes.Loja;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class LojaTest2 {
    public static void main(String[] args) {
        List<Loja> lojas = asList(
                new Loja("americanas"),
                new Loja("casasBahia"),
                new Loja("bastBuy"),
                new Loja("wwallMart"),
                new Loja("americanas"),
                new Loja("casasBahia"),
                new Loja("bastBuy"),
                new Loja("wwallMart"),
                new Loja("americanas"),
                new Loja("casasBahia"),
                new Loja("bastBuy"),
                new Loja("wwallMart"),
                new Loja("americanas"),
                new Loja("casasBahia"),
                new Loja("bastBuy"),
                new Loja("wwallMart"),
                new Loja("americanas"),
                new Loja("casasBahia"),
                new Loja("bastBuy"),
                new Loja("wwallMart"));
//        acharPrecos(lojas);
        acharPrecos2(lojas);
//        acharPrecos3(lojas);
        acharPrecos4(lojas);
    }

    //Chamando com Streams
    private static List<String> acharPrecos(List<Loja> lojas) {
        System.out.println("Stream Sequêncial");
        long start = System.currentTimeMillis();
        List<String> collect = lojas.stream()
                .map(loja -> String.format("%s o preço é: %.2f", loja.getNome(), loja.getPreco()))
                .collect(Collectors.toList());
        System.out.println("Tempo total: " + (System.currentTimeMillis() - start) + " ms");
        System.out.println(collect);
        return collect;
    }

    //Chamando com Streams Paralelos
    private static List<String> acharPrecos2(List<Loja> lojas) {
        System.out.println("Stream Paralelo");
        long start = System.currentTimeMillis();
        List<String> collect = lojas.parallelStream()
                .map(loja -> String.format("%s o preço é: %.2f", loja.getNome(), loja.getPreco()))
                .collect(Collectors.toList());
        System.out.println("Tempo total: " + (System.currentTimeMillis() - start) + " ms");
        System.out.println(collect);
        return collect;
    }

    //Chamando com CompletableFuture
    private static List<String> acharPrecos3(List<Loja> lojas) {
        System.out.println("Completable Future Sequencial");
        long start = System.currentTimeMillis();

        List<String> collect = lojas.stream()
                .map(loja -> CompletableFuture.supplyAsync(
                        () -> String.format("%s o preço é: %.2f", loja.getNome(), loja.getPreco())
                )).map(CompletableFuture::join)
                .collect(Collectors.toList());

        System.out.println("Tempo total: " + (System.currentTimeMillis() - start) + " ms");
        System.out.println(collect);
        return collect;
    }

    //Chamando com CompletableFuture
    private static List<String> acharPrecos4(List<Loja> lojas) {
        System.out.println("Completable Future");
        long start = System.currentTimeMillis();

        List<CompletableFuture<String>> precoFuturo = lojas.stream()
                .map(loja -> CompletableFuture.supplyAsync(
                        () -> String.format("%s o preço é: %.2f", loja.getNome(), loja.getPreco())
                ))
                .collect(Collectors.toList());
        System.out.println("Tempo de invocação: " + (System.currentTimeMillis() - start) + " ms");

        List<String> collect = precoFuturo.stream().map(CompletableFuture::join).collect(Collectors.toList());

        System.out.println("Tempo total: " + (System.currentTimeMillis() - start) + " ms");
        System.out.println(collect);
        return collect;
    }
}
