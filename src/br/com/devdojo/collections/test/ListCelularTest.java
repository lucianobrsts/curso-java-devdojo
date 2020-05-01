package br.com.devdojo.collections.test;

import br.com.devdojo.collections.classes.Celular;

import java.util.ArrayList;
import java.util.List;

public class ListCelularTest {
    public static void main(String[] args) {
        Celular celular1 = new Celular("Galaxi S7", "123456");
        Celular celular2 = new Celular("IPhone 6S", "1234555");
        Celular celular3 = new Celular("Sony Xperia", "55459");

        List<Celular> celularList = new ArrayList<>();
        celularList.add(celular1);
        celularList.add(celular2);
        celularList.add(celular3);

        for (Celular celular : celularList) {
            System.out.println(celular);
        }
        Celular celular4 = new Celular("Galaxy S7", "123456");
        System.out.println(celularList.contains(celular4));
    }
}
