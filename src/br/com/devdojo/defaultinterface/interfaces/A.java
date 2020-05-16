package br.com.devdojo.defaultinterface.interfaces;

public interface A {

    default void oi() {
        System.out.println("Dentro do oi de A");
    }
}
