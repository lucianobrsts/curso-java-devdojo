package br.com.devdojo.collections.test;

import br.com.devdojo.collections.classes.Produto;

import java.util.LinkedHashSet;
import java.util.Set;


public class SetTest {
    public static void main(String[] args) {
        Produto produto1 = new Produto("123", "LapTop Lenovo", 2000.0, 10);
        Produto produto2 = new Produto("321", "Picanha", 26.40, 10);
        Produto produto3 = new Produto("112", "Teclado Razer", 1000.0, 10);
        Produto produto4 = new Produto("012", "Samsung Galaxi S7", 3250.0, 30);
        Produto produto5 = new Produto("012", "Samsung Galaxi S6", 3250.0, 30);

        Set<Produto> produtoSet = new LinkedHashSet<>();
        produtoSet.add(produto1);
        produtoSet.add(produto2);
        produtoSet.add(produto3);
        produtoSet.add(produto4);
        produtoSet.add(produto5);
        for(Produto p : produtoSet) {
            System.out.println(p);
        }
    }
}
