package br.com.devdojo.staticmodifier.staticattributes.test;

import br.com.devdojo.staticmodifier.staticattributes.classes.Carro;

public class CarroTest {

    public static void main(String[] args) {

        Carro carro1 = new Carro("BMW", 280);
        Carro carro2 = new Carro("Audi", 275);
        Carro carro3 = new Carro("Mercedes", 290);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();

        System.out.println();
        System.out.println("Nova velocidade limite");
        Carro.velocidadeLimite = 220;

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
