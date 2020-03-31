package br.com.devdojo.variables.aula07;

public class Operadores {

    public static void main(String[] args) {
        int numeroInteiro = 20;
        long numeroLong = 200000L;
        double numeroDouble = 10d;
        float numeroFloat = 20F;
        numeroFloat = (float) numeroDouble;

        int resto = 21%2;
        System.out.println("Resto da divisão: " + (21 % 2)); //% operador resto - caso 0 divisão exata, caso outro valor não exata.
        System.out.println("Resto da divisão: " + resto); //também pode ser feita asim.
    }
}
