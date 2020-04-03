package br.com.devdojo.classesandobjects.aula29.test;

import br.com.devdojo.classesandobjects.aula29.classes.Calculadora;

public class CalculadoraTest {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        System.out.println("Soma dos números");
        calculadora.somaDoidNumeros();

        System.out.println("Subtração dos números");
        calculadora.subtraiDoisNumeros();

        System.out.println("Multiplicação dos números");
        calculadora.multiplicaDoisNumeros(5, 5);

        System.out.println("Divisão dos números");
        double resultado =calculadora.divideDoisNumeros(20, 2);
        System.out.println(resultado);

        System.out.println("Continua a execução");
    }
}
