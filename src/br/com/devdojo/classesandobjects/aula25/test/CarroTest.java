package br.com.devdojo.classesandobjects.aula25.test;

import br.com.devdojo.classesandobjects.aula25.classes.Carro;

public class CarroTest {

    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.modelo = "Fusca";
        carro.placa = "QWJ1029";
        carro.velocidadeMaxima = 120f;

        System.out.println("Placa: " + carro.placa);
        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Velocidade Máxima: " + carro.velocidadeMaxima);
    }
}
