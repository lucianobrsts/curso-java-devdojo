package br.com.devdojo.collections.test;

import br.com.devdojo.collections.classes.Produto;

import java.util.*;

class ProdutoNomeComparator implements Comparator<Produto> {

    @Override
    public int compare(Produto o1, Produto o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

public class SortProdutoTest {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        Produto[] produtoArray = new Produto[4];

        Produto produto1 = new Produto("123", "LapTop Lenovo", 2000.0, 10);
        Produto produto2 = new Produto("321", "Picanha", 26.40, 0);
        Produto produto3 = new Produto("112", "Teclado Razer", 1000.0, 5);
        Produto produto4 = new Produto("012", "Samsung Galaxi S7", 3250.0, 0);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);

        produtoArray[0] = produto1;
        produtoArray[1] = produto2;
        produtoArray[2] = produto3;
        produtoArray[3] = produto4;

        Collections.sort(produtos,new ProdutoNomeComparator());

//        for(Produto produto : produtos) {
//            System.out.println(produto);
//        }
        Arrays.sort(produtoArray, new ProdutoNomeComparator());
        for(Produto produto : produtoArray) {
           System.out.println(produto);
        }
        //System.out.println(Arrays.toString(produtoArray));
    }
}
