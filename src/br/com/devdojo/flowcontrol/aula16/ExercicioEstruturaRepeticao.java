package br.com.devdojo.flowcontrol.aula16;

public class ExercicioEstruturaRepeticao {

    public static void main(String[] args) {

        int valor = 0;

        //Imprimindo números pares
        while (valor <= 100000) {
            if (valor % 2 == 0) {
                System.out.println(valor);
            }
            valor++;
        }

        int valor2 = 100000;
        //Imprimindo números impares
        for (int i = 0; i < valor2; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

    }
}
