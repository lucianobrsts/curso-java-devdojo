package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao02 {
    public static void main(String[] args) {
        //Imprima todos os números  pares até 1000000
        int count = 0;

        System.out.println("Usando while");
        while (count <= 1000000) {
            if(count % 2 == 0) {
                System.out.println(count);
            }
                count++;
        }

        System.out.println("Usando for");
        for (int i = 0; i <= 1000000; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
