package br.com.devdojo.classesandobjects.aula31.classes;

public class Calculadora {

    public void somaDoidNumeros() {
        System.out.println(5 + 5);
    }

    public void subtraiDoisNumeros() {
        System.out.println(5 - 5);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public void imprimeDoisNumerosDivididos(double num1, double num2) {
        if (num2 != 0) {
            System.out.println(num1 / num2);
            return;
        }
        System.out.println("Não é possível dividir por 0");

    }

    public void alteraDoisNumeros (int num1, int num2) {
        num1 = 30;
        num2 = 40;
        System.out.println("Dentro do altera dois números");
        System.out.println("Num1 : " + num1);
        System.out.println("Num2 : " + num2);
    }
}
