package br.com.devdojo.threads.test;

import java.util.LinkedList;
import java.util.List;

class ListaDeNomes{
    private List<String> nomes = new LinkedList<>();

    public void add(String nome) {
        nomes.add(nome);
    }

    public synchronized void removerPrimeiro() {
        if(nomes.size() > 0) {
            System.out.println(nomes.remove(0));
        }
    }

}

public class ThreadSafeTest {
    public static void main(String[] args) {
        ListaDeNomes nome = new ListaDeNomes();
        nome.add("Luciano Brito");

        class RemovedorDeNomes extends Thread {
            public void run() {
                nome.removerPrimeiro();
            }
        }
        new RemovedorDeNomes().start();
        new RemovedorDeNomes().start();
    }
}
