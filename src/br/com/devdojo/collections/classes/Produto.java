package br.com.devdojo.collections.classes;

import java.util.Objects;

public class Produto implements Comparable<Produto> {
    private String serialNumber;
    private String nome;
    private Double preco;
    private int quantidade;

    public Produto(String serialNumber, String nome, Double preco, int quantidade) {
        this.serialNumber = serialNumber;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return serialNumber.equals(produto.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "serialNumber='" + serialNumber + '\'' +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Produto outroObjeto) {
        // Negativo se thisObject for menos que outroObjeto
        // Zero se thisObject for igual a outroObjeto
        // Positivo se thisObject for maior que outroObjeto

        //Double d = preco;
        //return d.compareTo(outroObjeto.getPreco());

        return this.preco.compareTo(outroObjeto.getPreco());
    }
}
