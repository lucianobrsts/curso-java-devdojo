package br.com.devdojo.asserts.test;

public class AssertTest {

    public static void main(String[] args) {
        calculaSalario(-1000);
    }

    private static void calculaSalario(double salario) {
        assert (salario > 0) : "O salário não deve ser menor que zero. Valor salário: " + salario;
        //calculo do salário
    }

    public static void calcSalario(double salario) {
        if(salario < 0) {
            throw new IllegalArgumentException();
        }
    }
}
