package br.com.devdojo.operators.aula08;

public class OperadoresLogicos {

    public static void main(String[] args) {

        int idade = 18;
        float salario = 1000;

        System.out.println((idade >= 18) && (salario >= 1000)); //teste condicional AND
        System.out.println(idade >= 18 && salario > 1000); //teste condicional AND

        System.out.println();
        System.out.println(idade >= 18 || salario >= 2000); //teste condicional OR
        System.out.println(idade < 18 || salario >= 2000); //teste condicional OR
    }
}
