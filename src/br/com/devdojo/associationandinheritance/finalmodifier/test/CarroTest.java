package br.com.devdojo.associationandinheritance.finalmodifier.test;

import br.com.devdojo.associationandinheritance.finalmodifier.classes.Carro;

public class CarroTest {

    public static void main(String[] args) {

        Carro carro = new Carro();
        System.out.println(carro.getComprador());

        carro.getComprador().setNome("Kuririn");
        System.out.println(carro.getComprador());

    }
}
