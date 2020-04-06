package br.com.devdojo.classesandobjects.aula33.test;

import br.com.devdojo.classesandobjects.aula33.classes.Calculadora;

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
        double resultado = calculadora.divideDoisNumeros(20, 2);
        System.out.println(resultado);

        System.out.println("Imprimindo dois números divididos");
        calculadora.imprimeDoisNumerosDivididos(20, 5);

        System.out.println("Imprimindo a soma do array");
        int[] numeros = new int[] {1, 2, 3, 4, 5};
        calculadora.somaArray(numeros);

        System.out.println("Imprimindo soma por varargs");
        calculadora.somaVarArgs(1, 2, 3, 4, 5);
    }
}
