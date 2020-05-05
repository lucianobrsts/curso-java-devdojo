package br.com.devdojo.collections.test;

import br.com.devdojo.collections.classes.Produto;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        Produto produto1 = new Produto("123", "LapTop Lenovo", 2000.0, 10);
        Produto produto2 = new Produto("321", "Picanha", 26.40, 10);
        Produto produto3 = new Produto("112", "Teclado Razer", 1000.0, 10);
        Produto produto4 = new Produto("012", "Samsung Galaxi S7", 3250.0, 30);
        Produto produto5 = new Produto("023", "Samsung Galaxi S6", 1d, 30);

        NavigableSet<Produto> produtoNavigableSet = new TreeSet<>();
        produtoNavigableSet.add(produto1);
        produtoNavigableSet.add(produto2);
        produtoNavigableSet.add(produto3);
        produtoNavigableSet.add(produto4);
        produtoNavigableSet.add(produto5);
        for(Produto produto : produtoNavigableSet.descendingSet()) {
            System.out.println(produto);
        }
        System.out.println("----------------------");
        //lower ==> retorna o menor produto antes do produto que está sendo passado ( < )
        //floor ==> retorna o produto menor ou igual ao produto que está sendo passado ( <= )
        //higher ==> retorna o maior produto sem incluir o produto que está sendo passado ( > )
        //ceiling ==> Retorna o maior produto incluindo o produto que está sendo passado ( >= )
        //descendingSet ==> classifica em ordem decrecente.
        //poolFirst ==> retorna o primeiro objeto removendo o mesmo
        //pooLast ==> retorna o ultimo objeto removendo o mesmo

        System.out.println(produtoNavigableSet.size());
        System.out.println(produtoNavigableSet.pollFirst());
        System.out.println(produtoNavigableSet.size());
    }
}
