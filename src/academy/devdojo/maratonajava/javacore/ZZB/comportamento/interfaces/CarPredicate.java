package academy.devdojo.maratonajava.javacore.ZZB.comportamento.interfaces;

import academy.devdojo.maratonajava.javacore.ZZB.comportamento.dominio.Car;

@FunctionalInterface
public interface CarPredicate {

    boolean test(Car car);
}
