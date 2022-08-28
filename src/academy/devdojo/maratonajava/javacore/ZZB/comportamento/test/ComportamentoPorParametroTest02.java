package academy.devdojo.maratonajava.javacore.ZZB.comportamento.test;

import academy.devdojo.maratonajava.javacore.ZZB.comportamento.dominio.Car;
import academy.devdojo.maratonajava.javacore.ZZB.comportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));

    public static void main(String[] args) {

//        List<Car> greeCar = filter(cars, new CarPredicate() {
//            @Override
//            public boolean teste(Car car) {
//                return (car.getColor().equals("green"));
//            }
//        });
        List<Car> greenCar = filter(cars, car -> car.getColor().equals("green"));
        List<Car> redCar = filter(cars, car -> car.getColor().equals("red"));
        List<Car> yearBeforeCars = filter(cars, car -> car.getYear() < 2015);

        System.out.println(greenCar);
        System.out.println(redCar);
        System.out.println(yearBeforeCars);
    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filterCars = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)) {
                filterCars.add(car);
            }
        }
        return filterCars;
    }

}
