package br.com.devdojo.completablefuture.classes;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Loja {
    public double getPreco() {
        //vai pegar o preço onde judas perdeu as botasa
        return calcularPreco();
    }

    public Future<Double> getPrecoAsync() {
        CompletableFuture<Double> precoFuturo = new CompletableFuture<>();
        new Thread(() -> {
            precoFuturo.complete(calcularPreco());
        }).start();
        return precoFuturo;
    }

    private double calcularPreco() {
        delay();
        return ThreadLocalRandom.current().nextDouble() * 100;
    }

    private static void delay() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
