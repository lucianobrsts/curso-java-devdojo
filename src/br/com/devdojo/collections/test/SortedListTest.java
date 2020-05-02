package br.com.devdojo.collections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedListTest {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Luciano");
        nomes.add("Brito");
        nomes.add("DevDojo");
        nomes.add("Raimundo");
        nomes.add("Francisco");
        nomes.add(0, "Anna");
        Collections.sort(nomes);

        List<Double> numeros = new ArrayList<>();
        numeros.add(1.5);
        numeros.add(1.3);
        numeros.add(1.9);
        numeros.add(2d);
        Collections.sort(numeros);

        for(String nome : nomes) {
            System.out.println(nome);
        }

        for(Double numero : numeros) {
            System.out.println(numero);
        }
    }
}
