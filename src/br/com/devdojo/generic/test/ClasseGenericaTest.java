package br.com.devdojo.generic.test;

import br.com.devdojo.generic.classes.Carro;
import br.com.devdojo.generic.classes.Computador;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>();
        carrosDisponiveis.add(new Carro("Gol"));
        carrosDisponiveis.add(new Carro("BMW"));

        ObjettosAlugaveis<Carro> carroAlugavel = new ObjettosAlugaveis<>(carrosDisponiveis);
        Carro carro = carroAlugavel.getObjetoDisponivel();
        System.out.println("Usando carro por um mês: ");
        carroAlugavel.devolverObjeto(carro);

        System.out.println("---------------------------");

        List<Computador> computadoresDisponiveis = new ArrayList<>();

        computadoresDisponiveis.add(new Computador("AlleWare"));
        computadoresDisponiveis.add(new Computador("HP"));
        ObjettosAlugaveis<Computador> computadorAlugavel = new ObjettosAlugaveis<>(computadoresDisponiveis);
        Computador c = computadorAlugavel.getObjetoDisponivel();
        System.out.println("Usando Computador");
        computadorAlugavel.devolverObjeto(c);
    }
}

//Type
class ObjettosAlugaveis<T> {
    private List<T> objetosDisponiveis = new ArrayList<>();

    public ObjettosAlugaveis(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    //Alugar
    public T getObjetoDisponivel() {
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugado objeto: " + t);
        System.out.println("Objetoss Disponíveis: " + objetosDisponiveis);
        return t;
    }

    //Devolver
    public void devolverObjeto(T t) {
        System.out.println("Devolvendo Objeto: " + t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos Disponíveis: " + objetosDisponiveis);
    }
}
