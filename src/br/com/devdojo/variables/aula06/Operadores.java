package br.com.devdojo.variables.aula06;

public class Operadores {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;
        int soma = numero1 + numero2;

        System.out.println("A soma é: " + (numero1 + numero2)); //Se for usada uma String antes de uma operação o java entende como tudo sendo concatenação e não soma.
        System.out.println("A soma é: " + soma); //também pode ser feito assim.

        System.out.println();
        System.out.println("A subtração é: " + (numero1 - numero2));

        System.out.println();
        System.out.println("A multiplicação é: " + (numero1 * numero2));

        System.out.println();
        System.out.println("A divisão é: " + (numero1 / numero2)); //A divisão de um número inteiro com outro inteiro (10 e 20) resulta em outro inteiro(0) as casa decimais não são mostradas
    }
}
