package br.com.devdojo.concurrence.test;

import java.util.concurrent.*;

public class CallableTest implements Callable<String> {
    @Override
    public String call() throws Exception {
        int count = ThreadLocalRandom.current().nextInt(1, 11);
        for (int i = 0; i < count; i++) {
            System.out.println(Thread.currentThread().getName() + " executando..." );
        }

        return "Trabalho finalizado o número aleatório eh: " + count;
    }

    public static void main(String[] args) {
        CallableTest ct = new CallableTest();
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<String> resultuFuture = executorService.submit(ct);

        try {
            String s = resultuFuture.get();
        System.out.println(s);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executorService.shutdown();

    }
}
