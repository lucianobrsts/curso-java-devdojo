package br.com.devdojo.collections.test;

import br.com.devdojo.collections.classes.Produto;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        List<Produto> produtos = new LinkedList<>();

        Produto produto1 = new Produto("123", "LapTop Lenovo", 2000.0, 10);
        Produto produto2 = new Produto("321", "Picanha", 26.40, 10);
        Produto produto3 = new Produto("112", "Teclado Razer", 1000.0, 10);
        Produto produto4 = new Produto("012", "Samsung Galaxi S7", 3250.0, 30);

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);

//        System.out.println(produtos.size());
//        for (Produto produto : produtos) {
//            if (produto.getQuantidade() == 0) {
//                System.out.println(produto);
//                produtos.remove(produto);
//            }
//        }
//        System.out.println(produtos.size());

        Iterator<Produto> produtoIterator = produtos.iterator();
        //HasNext - Verifica se existe um próximo elemento na lista.
        //next - pega o elemento daquela lista.
        while(produtoIterator.hasNext()) {
            if(produtoIterator.next().getQuantidade() == 0) {
                produtoIterator.remove();
            }
        }
        System.out.println(produtos.size());
    }
}
