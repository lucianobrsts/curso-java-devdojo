package br.com.devdojo.staticmodifier.staticinitializationblock.classes;

public class Cliente {
    // 0- Bloco de inicialização estático é executado quando a JVM carregar a classe (é executado apenas 1 vez).
    // 1- Alocado espaço na memória para o objeto que será alocado.
    // 2- Cada atrituto de classe é criado e inicializado com seus valores default ou valores explicitos
    // 3- Bloco de inicialização é executado.
    // 4- O contrutor é executado.

    private static int[] parcelas;

    //bloco de inicialização
    static {
        parcelas = new int[100];
        System.out.println("Dentro do bloco de inicialização");
        for (int i = 1; i <= 100; i++) {
            parcelas[i - 1] = i;
        }
    }

    public Cliente() {

    }

    public static int[] getParcelas() {
        return parcelas;
    }

    public static void setParcelas(int[] parcelas) {
        Cliente.parcelas = parcelas;
    }
}