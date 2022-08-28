package academy.devdojo.maratonajava.javacore.ZZB.comportamento.test;

import academy.devdojo.maratonajava.javacore.ZZB.comportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));

    public static void main(String[] args) {

        System.out.println(filterGreenCar(cars));
        System.out.println(filterRedCar(cars));
        System.out.println(filterCarByColorr(cars, "green"));
        System.out.println(filterCarByColorr(cars, "red"));
        System.out.println("--------- Lis of Yearr ---------");
        System.out.println(filterCarByYear(cars, 2015));
    }

    private static List<Car> filterGreenCar(List<Car> cars) {
        List<Car> filterCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("green")) {
                filterCars.add(car);
            }
        }
        return filterCars;
    }

    private static List<Car> filterRedCar(List<Car> cars) {
        List<Car> filterCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("red")) {
                filterCars.add(car);
            }
        }
        return filterCars;
    }

    private static List<Car> filterCarByColorr(List<Car> cars, String color) {
        List<Car> filterCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                filterCars.add(car);
            }
        }
        return filterCars;
    }

    private static List<Car> filterCarByYear(List<Car> cars, int year) {
        List<Car> filterCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                filterCars.add(car);
            }
        }
        return filterCars;
    }
}
