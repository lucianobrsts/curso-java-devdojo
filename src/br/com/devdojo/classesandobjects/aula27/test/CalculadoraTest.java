package br.com.devdojo.classesandobjects.aula27.test;

import br.com.devdojo.classesandobjects.aula27.classes.Calculadora;

public class CalculadoraTest {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        calculadora.somaDoidNumeros();
        calculadora.subtraiDoisNumeros();
        System.out.println("Continua a execução");
    }
}
