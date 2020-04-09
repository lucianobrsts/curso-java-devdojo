package br.com.devdojo.staticmodifier.staticattributes.classes;

public class Carro {

    private String nome;
    private double valocidadeMaxima;
    private static double velocidadeLimite = 240;

    public Carro(String nome, double valocidadeMaxima) {
        this.nome = nome;
        this.valocidadeMaxima = valocidadeMaxima;
    }

    public Carro() {
    }

    public void imprime() {
        System.out.println("---------------------");
        System.out.println("Nome:" + this.nome);
        System.out.println("Velocidade Máxima: " + this.valocidadeMaxima);
        System.out.println("Velocidade Limite: " + velocidadeLimite);
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite() {
        return velocidadeLimite;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValocidadeMaxima() {
        return valocidadeMaxima;
    }

    public void setValocidadeMaxima(double valocidadeMaxima) {
        this.valocidadeMaxima = valocidadeMaxima;
    }
}
