package br.com.devdojo.concurrence.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

class ThreadTrabalhadoraExecutors implements Runnable {
    private String num;

    public ThreadTrabalhadoraExecutors(String num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " iniciou:" + num);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " finalizou.");
    }
}

public class ExecutorsTest {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
//        ExecutorService executorService = Executors.newFixedThreadPool(4);
//        ExecutorService executorService = Executors.newCachedThreadPool();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
        threadPoolExecutor.setCorePoolSize(6);

        executorService.execute(new ThreadTrabalhadoraExecutors("1"));
        executorService.execute(new ThreadTrabalhadoraExecutors("2"));
        executorService.execute(new ThreadTrabalhadoraExecutors("3"));
        executorService.execute(new ThreadTrabalhadoraExecutors("4"));
        executorService.execute(new ThreadTrabalhadoraExecutors("5"));
        executorService.execute(new ThreadTrabalhadoraExecutors("6"));
        executorService.execute(new ThreadTrabalhadoraExecutors("7"));
        executorService.execute(new ThreadTrabalhadoraExecutors("8"));
        executorService.shutdown();

        while (!executorService.isTerminated()) {
        }

        System.out.println(executorService.isTerminated());
        System.out.println("Finalizado...");


    }
}
