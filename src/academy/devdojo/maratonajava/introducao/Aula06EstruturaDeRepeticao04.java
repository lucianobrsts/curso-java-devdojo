package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao04 {
    public static void main(String[] args) {
        //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        //condição valorParcela >= 1000

        double valorCarro = 6200;
        int quantidadesParcelas = 0;
        for (int i = 1000; i <= valorCarro; i += 1000) {
            quantidadesParcelas++;
        }
        System.out.println("O Carro pode ser parcela em: " + quantidadesParcelas);
        System.out.println("---------------------------------");

        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
