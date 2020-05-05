package br.com.devdojo.collections.test;

import br.com.devdojo.collections.classes.Produto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BynarySearchTest {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);

        // Caso o indice não seja encontrado é seguida essa regra: (-(ponto de inserção) -1) - Ex: -1 -1 = -2
        Collections.sort(numeros);

        //Fazer uma busca:
        // 0, 1, 2, 3
        // 0, 2, 3, 4
        System.out.println(Collections.binarySearch(numeros, 1));

        List<Produto> produtos = new ArrayList<>();

        Produto produto1 = new Produto("123", "LapTop Lenovo", 2000.0);
        Produto produto2 = new Produto("321", "Picanha", 26.40);
        Produto produto3 = new Produto("112", "Teclado Razer", 1000.0);
        Produto produto4 = new Produto("012", "Samsung Galaxi S7", 3250.0);

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);

        Collections.sort(produtos, new ProdutoNomeComparator());

        Produto produto5 = new Produto("", "Antena", 50.0);

        for (Produto produto : produtos) {
            System.out.println(produto);
        }
        System.out.println(Collections.binarySearch(produtos, produto5, new ProdutoNomeComparator()));

        Integer[] arrayInteger = new Integer[4];
        arrayInteger[0] = 2;
        arrayInteger[1] = 0;
        arrayInteger[2] = 4;
        arrayInteger[3] = 3;
        Arrays.sort(arrayInteger);
        System.out.println(Arrays.binarySearch(arrayInteger, 1));

    }
}
