package br.com.devdojo.completablefuture.test;

import br.com.devdojo.completablefuture.classes.Loja;

import javax.management.relation.RelationNotFoundException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class LojaTest2 {
    public static void main(String[] args) {
        List<Loja> lojas = asList(
                new Loja("americanas"),
                new Loja("casasBahia"),
                new Loja("bastBuy"),
                new Loja("wallMart"),
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
                new Loja("casasBahia"),
                new Loja("bastBuy"),
                new Loja("wwallMart"),
                new Loja("americanas"),
                new Loja("casasBahia"),
                new Loja("casasBahia"),
                new Loja("bastBuy"),
                new Loja("wwallMart"),
                new Loja("americanas"),
                new Loja("casasBahia"),
                new Loja("casasBahia"),
                new Loja("bastBuy"),
                new Loja("wwallMart"),
                new Loja("americanas"),
                new Loja("casasBahia"),
                new Loja("casasBahia"),
                new Loja("bastBuy"),
                new Loja("wwallMart"),
                new Loja("americanas"),
                new Loja("casasBahia"),
                new Loja("casasBahia"),
                new Loja("bastBuy"),
                new Loja("wwallMart"),
                new Loja("americanas"),
                new Loja("casasBahia"),
                new Loja("casasBahia"),
                new Loja("bastBuy"),
                new Loja("wwallMart"),
                new Loja("americanas"),
                new Loja("casasBahia"),
                new Loja("casasBahia"),
                new Loja("bastBuy"),
                new Loja("wwallMart"),
                new Loja("americanas"),
                new Loja("casasBahia"),
                new Loja("casasBahia"),
                new Loja("bastBuy"),
                new Loja("wwallMart"),
                new Loja("americanas"),
                new Loja("casasBahia"),
                new Loja("casasBahia"),
                new Loja("bastBuy"),
                new Loja("wwallMart"),
                new Loja("americanas"),
                new Loja("casasBahia"),
                new Loja("wwallMart"),
                new Loja("americanas"),
                new Loja("casasBahia"),
                new Loja("bastBuy"),
                new Loja("wwallMart"));
        System.out.println(Runtime.getRuntime().availableProcessors() + " processadores");
        System.out.println(lojas.size());
//        acharPrecos(lojas);
        acharPrecos2(lojas);
//        acharPrecos3(lojas);
        acharPrecos4(lojas);

        //Formula para encontrar Threas
        //NumeroDeThreads = Nupu * Ucpu * (1+W/C)
        //Ncpu = numero de cores disponível
        //Ucpu = quantidde de utilizado da CPU (0 - 1)
        //W/C = wait time e compute time
        //Nthreads = 8 * 1 ( 1 + 99) = 800 threads

        final Executor executor = Executors.newFixedThreadPool(Math.min(lojas.size(), 100), r -> {
            Thread t = new Thread(r);
            t.setDaemon(true);
            return t;
        });

        acharPrecos4(lojas, executor);

        //captura da quantidade de processadores
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

    //Chamando com CompletableFuture
    private static List<String> acharPrecos4(List<Loja> lojas, Executor executor) {
        System.out.println("Completable Future");
        long start = System.currentTimeMillis();

        List<CompletableFuture<String>> precoFuturo = lojas.stream()
                .map(loja -> CompletableFuture.supplyAsync(
                        () -> String.format("%s o preço é: %.2f", loja.getNome(), loja.getPreco(), executor)
                ))
                .collect(Collectors.toList());
        System.out.println("Tempo de invocação: " + (System.currentTimeMillis() - start) + " ms");

        List<String> collect = precoFuturo.stream().map(CompletableFuture::join).collect(Collectors.toList());

        System.out.println("Tempo total: " + (System.currentTimeMillis() - start) + " ms");
        System.out.println(collect);
        return collect;
    }
}
