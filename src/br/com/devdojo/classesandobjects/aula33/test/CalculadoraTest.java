package br.com.devdojo.classesandobjects.aula33.test;

import br.com.devdojo.classesandobjects.aula33.classes.Calculadora;

public class CalculadoraTest {

    public static void main(String[] args) {

        //Calculadora calculadora = new Calculadora();
        System.out.println("Soma dos números");
        Calculadora.somaDoidNumeros();

        System.out.println("Subtração dos números");
        Calculadora.subtraiDoisNumeros();

        System.out.println("Multiplicação dos números");
        Calculadora.multiplicaDoisNumeros(5, 5);

        System.out.println("Divisão dos números");
        double resultado = Calculadora.divideDoisNumeros(20, 2);
        System.out.println(resultado);

        System.out.println("Imprimindo dois números divididos");
        Calculadora.imprimeDoisNumerosDivididos(20, 5);

        System.out.println("Imprimindo a soma do array");
        int[] numeros = new int[] {1, 2, 3, 4, 5};
        Calculadora.somaArray(numeros);

        System.out.println("Imprimindo soma por varargs");
        Calculadora.somaVarArgs(1, 2, 3, 4, 5);
    }
}
