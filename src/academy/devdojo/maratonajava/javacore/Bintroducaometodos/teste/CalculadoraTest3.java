package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest3 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(20, 0);
        System.out.println(resultado);
        System.out.println(calculadora.divideDoisNumeros02(20, 10));
        calculadora.imprimeDivideDoisNumeros(86, 5);
    }
}
