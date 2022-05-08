package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao01 {
    public static void main(String[] args) {
        //while, do while, for
        int count = 1;
        while (count <= 10) {
            System.out.println(count);
            count++;
        }

        count = 1;
        do {
            System.out.println("Dentro do Do While " + count);
            count++;
        } while (count <= 10);

        for(int i = 0; i < 10; i++) {
            System.out.println("For " + i);
        }
    }
}
