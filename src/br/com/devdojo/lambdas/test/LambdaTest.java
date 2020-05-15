package br.com.devdojo.lambdas.test;

import br.com.devdojo.lambdas.classes.Carro;
import br.com.devdojo.lambdas.interfaces.CarroPredicate;

public class LambdaTest {
    public static void main(String[] args) {
        CarroPredicate carroPredicate = new CarroPredicate() {
            @Override
            public boolean test(Carro carro) {
                return carro.getCor().equals("verde");
            }
        };

        CarroPredicate carroPredicate2 = (Carro carro) -> carro.getCor().equals("verde");

        System.out.println(carroPredicate.test(new Carro("verde", 2012)));
        System.out.println(carroPredicate2.test(new Carro("verde", 2012)));

        Runnable runnable = () -> System.out.println("Dentro do run");
        runnable.run();

        new Thread(runnable).start();
    }
}
