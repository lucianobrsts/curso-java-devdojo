package br.com.devdojo.constructors.initializationblock.classes;

public class Cliente {
    // 1- Alocado espaço na memória para o objeto que será alocado.
    // 2- Cada atrituto de classe é criado e inicializado com seus valores default ou valores explicitos
    // 3- Bloco de inicialização é executado.
    // 4- O contrutor é executado.

    private int[] parcelas;

    //bloco de inicialização
    {
        parcelas = new int[100];
        System.out.println("Dentro do bloco de inicialização");
        for (int i = 1; i <= 100 ; i++) {
            parcelas[i-1] = i;
        }
    }

    public Cliente() {

    }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
}