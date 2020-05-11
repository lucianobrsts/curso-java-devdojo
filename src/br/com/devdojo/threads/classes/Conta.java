package br.com.devdojo.threads.classes;

public class Conta {

    private int saldo = 50;

    public int getSaldo() {
        return saldo;
    }

    public void saque(int valor) {
        this.saldo = this.saldo - valor;
    }
}
