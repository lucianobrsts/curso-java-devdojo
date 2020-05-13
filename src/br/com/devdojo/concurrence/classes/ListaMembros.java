package br.com.devdojo.concurrence.classes;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ListaMembros {
    private final Queue<String> emails = new LinkedList<>();
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition conditionLock = lock.newCondition();

    private boolean aberta = true;

    public int getEmailPendentes() {
        lock.lock();
        try {
            return this.emails.size();
        } finally {
            lock.unlock();
        }
    }

    public boolean isAberta() {
        return aberta;
    }

    public String obterEmailMenbro() {
        String email = null;
        try {
            lock.lock();
            while (this.emails.size() == 0) {
                if (!aberta) return null;
                System.out.println("Lista vazia, colocando a Thread: " + Thread.currentThread().getName() + " em modo wait");
                conditionLock.await();
            }
            email = this.emails.poll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return email;
    }

    public void adicionarEmailMembro(String email) {
        lock.lock();
        try {
            this.emails.add(email);
            System.out.println("Email adicionado na lista");
            System.out.println("Notificando as Threads que estão em espera");
            conditionLock.signalAll();
        } finally {
            lock.unlock();
        }

    }

    public void fecharlista() {
        System.out.println("Notificando todas as threads e fechando a lista");
        aberta = false;
        lock.lock();
        try {
            this.emails.notifyAll();
        } finally {
            lock.unlock();
        }
    }
}
