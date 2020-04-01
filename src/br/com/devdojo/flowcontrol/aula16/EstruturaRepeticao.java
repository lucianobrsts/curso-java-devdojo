package br.com.devdojo.flowcontrol.aula16;

public class EstruturaRepeticao {

    public static void main(String[] args) {

        int contador = 0;

        while (contador <= 10) {
            System.out.println(contador++);
            if (contador == 6) {
                System.out.println("While interrompido pelo break");
                break;
            }
        }
    }
}
