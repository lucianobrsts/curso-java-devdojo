package br.com.devdojo.classesandobjects.aula28.test;

import br.com.devdojo.classesandobjects.aula28.classes.Calculadora;

public class CalculadoraTest {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        calculadora.somaDoidNumeros();
        calculadora.subtraiDoisNumeros();
        calculadora.multiplicaDoisNumeros(5, 5);
        System.out.println("Continua a execução");
    }
}
