package br.com.devdojo.innerclasses.test;

import br.com.devdojo.generic.classes.Carro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Animal {
    public void andar() {
        System.out.println("Animal Andando.");
    }
}

public class ClassesAnonimasClasses {
    public static void main(String[] args) {
        Animal a = new Animal() {
            public void andar() {
                System.out.println("Andando Anônimamente...");
            }
            public void comer() {
                System.out.println("Comendo...");
            }

        };
        a.andar();

        List<Carro> carroList = new ArrayList<>();
        carroList.add(new Carro("BMW"));
        carroList.add(new Carro("Audi"));

        Collections.sort(carroList, (o1, o2) -> o1.getNome().compareTo(o2.getNome()));
        System.out.println(carroList);
    }
}
