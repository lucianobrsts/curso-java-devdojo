package br.com.devdojo.flowcontrol.aula12;

public class CalculandoImpostoSalario {

    public static void main(String[] args) {

        double salario = 3500;

        if (salario < 1000) {
            salario *= 0.05;
        } else if(salario >= 1000 && salario < 2000) {
            salario *= 0.1;
        } else if(salario >= 2000 && salario < 4000) {
            salario *= 0.15;
        } else {
            salario *= 0.2;
        }
        System.out.println("O valor do Imposto é: " + salario);
    }
}
