package br.com.devdojo.flowcontrol.aula17;

import java.text.DecimalFormat;

public class ControleFluxoContinue {

    public static void main(String[] args) {

        //Dado o valor de um carro descubra em quantas vezes ele pode ser parcelado;
        //Porém as parcelas não podem ser menores que 1000;

        //DecimalFormat formata a saída de números decimais na quantidade de casas decimais desejadas
        DecimalFormat df = new DecimalFormat("#,###.00");
        double valorTotal = 30000;

        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;

            if (valorParcela <= 1000) {
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + df.format(valorParcela));
            //System.out.println("Consumindo memória");
        }
    }
}
