package br.com.devdojo.generic.test;

import br.com.devdojo.generic.classes.Carro;
import br.com.devdojo.generic.classes.Computador;

import java.util.ArrayList;
import java.util.List;

public class ClasseNaoGenericaTest {
    public static void main(String[] args) {
        CarroAlugavel carroAlugavel = new CarroAlugavel();
        Carro carroalugado = carroAlugavel.getCarroDisponivel();
        System.out.println("Usando o carro por um mês: ");
        carroAlugavel.devolverCarro(carroalugado);

        System.out.println("---------------------------");
        ComputadorAlugavel computadorAlugavel = new ComputadorAlugavel();
        Computador computador = computadorAlugavel.getComputadorDisponivel();
        System.out.println("Usando o Pc");
        computadorAlugavel.devolverComputador(computador);

    }
}

class CarroAlugavel {
    private List<Carro> carrosDisponiveis = new ArrayList<>();

    {
        carrosDisponiveis.add(new Carro("Gol"));
        carrosDisponiveis.add(new Carro("BMW"));
    }

    //Alugar
    public Carro getCarroDisponivel() {
        Carro c = carrosDisponiveis.remove(0);
        System.out.println("Alugado Carro: " + c);
        System.out.println("Carros Disponíveis: " + carrosDisponiveis);
        return c;
    }

    public void devolverCarro(Carro c) {
        System.out.println("Devolvendo Carro: " + c);
        carrosDisponiveis.add(c);
        System.out.println("Carros Disponíveis: " + carrosDisponiveis);
    }
}

    class ComputadorAlugavel {
        private List<Computador> computadoresDisponiveis = new ArrayList<>();

        {
            computadoresDisponiveis.add(new Computador("AlleWare"));
            computadoresDisponiveis.add(new Computador("HP"));
        }

        //Alugar
        public Computador getComputadorDisponivel() {
            Computador c = computadoresDisponiveis.remove(0);
            System.out.println("Alugado computaor: " + c);
            System.out.println("Computadores Disponíveis: " + computadoresDisponiveis);
            return c;
        }

        public void devolverComputador(Computador c) {
            System.out.println("Devolvendo Computador: " + c);
            computadoresDisponiveis.add(c);
            System.out.println("Computadores Disponíveis: " + computadoresDisponiveis);
        }
}
