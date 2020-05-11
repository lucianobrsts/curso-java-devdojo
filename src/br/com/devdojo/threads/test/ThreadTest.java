package br.com.devdojo.threads.test;

//Thread tanto é um objeto como um leve processo.
//Threads Deamon => a JVM não se importa de finalizar a execução se ainda existe uma dessas executando. (ex: Garbage Collector);
//Thread User => a JVM não finaliza uma execução enquanto ainda existe uma User executando;
//As duas implementam a interface Runnable (é uma boa prática de O.O.) ou extends a classe Thread do pacote java.lang
// (não é uma boa ideia pq nós só extendemos uma classe quando vamos especializa-la;
//Toda Thread tem um nome padrão, independente de você dar o nome a thread sempre tem esse nome;
//Para iniciar uma thread sempre inicie usando o método start();
//Não existe ordem de execução das threads, fica a cargo da jvm decidir a ordem e o tempo de exucação das threads;

class ThreadExemploInterfaceThread extends Thread {
    private char c;

    public ThreadExemploInterfaceThread(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println("Thread executando: " + Thread.currentThread().getName());
        for (int i = 0; i < 1000; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
        }
    }
}

class ThreadExemploRunnable implements Runnable {
    private char c;

    public ThreadExemploRunnable(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println("Thread executando: " + Thread.currentThread().getName());
        for (int i = 0; i < 1000; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
//        ThreadExemploInterfaceThread t1 = new ThreadExemploInterfaceThread('A');
//        ThreadExemploInterfaceThread t2 = new ThreadExemploInterfaceThread('B');
//        ThreadExemploInterfaceThread t3 = new ThreadExemploInterfaceThread('C');
//        ThreadExemploInterfaceThread t4 = new ThreadExemploInterfaceThread('D');

        Thread t1 = new Thread(new ThreadExemploRunnable('A'));
        Thread t2 = new Thread(new ThreadExemploRunnable('B'));
        Thread t3 = new Thread(new ThreadExemploRunnable('C'));
        Thread t4 = new Thread(new ThreadExemploRunnable('D'));

//        t1.run();
//        t2.run();
//        t3.run();
//        t4.run();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}