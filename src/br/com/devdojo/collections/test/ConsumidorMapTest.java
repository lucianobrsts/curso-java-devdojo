package br.com.devdojo.collections.test;

import br.com.devdojo.collections.classes.Consumidor;
import br.com.devdojo.collections.classes.Produto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsumidorMapTest {
    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor("Luciano Brito", "136.216.660-01");
        Consumidor consumidor2 = new Consumidor("DevDojo", "136.123.660-55");
        Consumidor consumidor3 = new Consumidor("DevDojo2", "555.123.660-55");

        Produto produto1 = new Produto("123", "LapTop Lenovo", 2000.0, 0);
        Produto produto2 = new Produto("321", "Picanha", 26.40, 10);
        Produto produto3 = new Produto("112", "Teclado Razer", 1000.0, 5);
        Produto produto4 = new Produto("012", "Samsung Galaxi S7", 3250.0, 0);

        Map<Consumidor, List<Produto>> map = new HashMap<>();
        List<Produto> produtosCon1 = new ArrayList<>();
        produtosCon1.add(produto1);
        produtosCon1.add(produto2);

        List<Produto> produtosCon2 = new ArrayList<>();
        produtosCon2.add(produto3);
        produtosCon2.add(produto4);

        map.put(consumidor, produtosCon1);
        map.put(consumidor2, produtosCon2);
        map.put(consumidor3, produtosCon1);
        for (Map.Entry<Consumidor, List<Produto>> entry : map.entrySet()) {
            System.out.println(entry.getKey().getNome());
            for (Produto produto : entry.getValue()) {
                System.out.println(produto.getNome());
            }
        }
    }
}
