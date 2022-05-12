package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Wolksvagem";
        carro1.modelo = "Fox";
        carro1.ano = 2020;

        Carro carro2 = new Carro();
        carro2.nome = "Chevrolet";
        carro2.modelo = "Tracker";
        carro2.ano = 2018;

        carro1 = carro2;

        System.out.println("Nome: " + carro1.nome + " Modelo: " + carro1.modelo + " Ano: " + carro1.ano);
        System.out.println("Nome: " + carro2.nome + " Modelo: " + carro2.modelo + " Ano: " + carro2.ano);

    }
}
