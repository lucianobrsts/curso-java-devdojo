package br.com.devdojo.defaultinterface.interfaces;

public interface B{
    default void oi() {
        System.out.println("Dentro do oi de B");
    }
}
