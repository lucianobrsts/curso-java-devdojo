package br.com.devdojo.classesandobjects.aula31.test;

import br.com.devdojo.classesandobjects.aula31.classes.Calculadora;

public class ParametrosTest {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        int num1 = 5;
        int num2 = 10;

        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("Dentro do Teste");
        System.out.println("Num1: " + num1);
        System.out.println("Num2 : " + num2);
    }
}
