package br.com.devdojo.designpattern.test;

import br.com.devdojo.designpattern.classes.Aviao;

public class AviaoTest {
    public static void main(String[] args) {
        agendarAssento("1A");
        agendarAssento("1A");
    }

    private static void agendarAssento(String assento) {
        Aviao aviao = new Aviao();
        System.out.println(aviao.bookAssento(assento));
    }
}
