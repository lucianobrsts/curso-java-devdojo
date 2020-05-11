package br.com.devdojo.threads.test;

import br.com.devdojo.threads.classes.Conta;

public class ContaTest implements Runnable {
    private Conta conta = new Conta();

    public static void main(String[] args) {
        ContaTest contaTest = new ContaTest();

        Thread luciano = new Thread(contaTest, "William");
        Thread anna = new Thread(contaTest, "Anna");
        luciano.start();
        anna.start();
    }

    //synchronized garante que não haverá duas threads trabalhando ao mesmo tempo... a outra só executa quando a primeira encerra...
    //Há duas maneiras de usar o synchronized, uma em métodos e outra em blocos
    //synchronized método
    private synchronized void saque(int valor) {
        if (conta.getSaldo() >= valor) {
            System.out.println(Thread.currentThread().getName() + " está indo sacar...");
            conta.saque(valor);
            System.out.println(Thread.currentThread().getName() + " completou o saque, saldo: " + conta.getSaldo());
        } else {
            System.out.println("Seu dinheiro para " + Thread.currentThread().getName() + " efetuar o saque, valor: " + conta.getSaldo());
        }
    }

    //Ao utilizar o synchronized para métodos estáticos é como adquirir um lock (A chave) para a classe inteira
//    public static void imprimir() {
//        synchronized (ContaTest.class) { //ContaTest é uma classe literal
//            System.out.println("Imprime algo...");
//        }
//    }


    //synchronized bloco
//    private void saque(int valor) {
//        synchronized (conta) {
//            if (conta.getSaldo() >= valor) {
//                System.out.println(Thread.currentThread().getName() + " está indo sacar...");
//                conta.saque(valor);
//                try {
//                    Thread.sleep(10000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName() + " completou o saque, saldo: " + conta.getSaldo());
//            } else {
//                System.out.println("Seu dinheiro para " + Thread.currentThread().getName() + " efetuar o saque, valor: " + conta.getSaldo());
//            }
//        }
//    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            saque(10);
            if (conta.getSaldo() < 0) {
                System.out.println("Oh meu Deus...");
            }
        }
    }
}
