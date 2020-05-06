package br.com.devdojo.generic.test;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {
        //Type Erasure
        List<String> lista = new ArrayList();
        lista.add("String");
        lista.add("String");
        lista.add("Luciano Brito");

        for (String obj : lista) {
            System.out.println(obj);
        }
        add(lista, 1L);

    }

    public static void add(List lista, Long l) {
        lista.add(1);
    }
}
