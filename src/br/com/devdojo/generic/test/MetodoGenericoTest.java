package br.com.devdojo.generic.test;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest {
    public static void main(String[] args) {
        criarArray(new Cachorro());

//        List<Cachorro> cachorroList = criarArray2(new Cachorro());
//        System.out.println(cachorroList);
    }

    public static <T extends Animal> void criarArray(T t) {
        List<T> lista = new ArrayList<>();
        lista.add(t);
        System.out.println(lista);
    }

    public static <T> List<T> criarArray2(T t) {
        List<T> lista = new ArrayList<>();
        lista.add(t);
        System.out.println(lista);
        return lista;
    }
}
