package br.com.devdojo.interfaces.test;

import br.com.devdojo.interfaces.classes.Produto;

public class ProdutoTest {

    public static void main(String[] args) {

        Produto produto = new Produto("Notebook", 4, 3000);
        produto.calcularImposto();
        produto.calculaFrete();
        produto.calculaValorFinal();

        System.out.println(produto);

    }
}
