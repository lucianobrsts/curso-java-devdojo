package br.com.devdojo.designpattern.test;

import br.com.devdojo.designpattern.classes.Moeda;
import br.com.devdojo.designpattern.classes.MoedaFactory;
import br.com.devdojo.designpattern.classes.Pais;

public class MoedaFactoryTest {
    public static void main(String[] args) {
        Moeda moeda = MoedaFactory.criarMoeda(Pais.EUA);
        System.out.println(moeda.getSimbolo());
    }
}
