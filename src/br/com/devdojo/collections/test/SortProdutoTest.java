package br.com.devdojo.collections.test;

import br.com.devdojo.collections.classes.Produto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortProdutoTest {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        Produto produto1 = new Produto("123", "LapTop Lenovo", 2000.0);
        Produto produto2 = new Produto("321", "Picanha", 26.40);
        Produto produto3 = new Produto("112", "Teclado Razer", 1000.0);
        Produto produto4 = new Produto("012", "Samsung Galaxi S7", 3250.0);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        Collections.sort(produtos);

        for(Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
