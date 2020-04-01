package br.com.devdojo.flowcontrol.aula15;

public class ControleFluxo {

    public static void main(String[] args) {

        int contador = 0;
        int contadorDoWhile = 0;

        System.out.println("While");
        while (contador <= 10) {
            System.out.println(contador++);
            //contador++
        }

        System.out.println("-----------------------------");
        System.out.println("Do While");
        do{
            System.out.println(contadorDoWhile++);
        } while (contadorDoWhile <= 10);

        System.out.println("-----------------------------");
        System.out.println("For");
        for (int i = 0; i <= 10; i++) {
            System.out.println("Valor do i é: " + i);
        }
    }
}
