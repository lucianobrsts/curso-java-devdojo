package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao03 {
    public static void main(String[] args) {
        //Imprimir os primeiros 25 números de um dado valor. Por exemplo, 50

        int numero = 0;
        int valorMaximo = 50;
        int valorLimite = 25;

        System.out.println("Usando o while");
        while (numero <= valorMaximo) {
            if (numero > valorLimite) {
                break;
            }
            System.out.println(numero);
            numero++;
        }

        System.out.println("Usando for i");
        for (int i = 0; i <= valorMaximo; i++) {
            if (i > valorLimite) {
                break;
            }
            System.out.println(i);
        }
    }
}
