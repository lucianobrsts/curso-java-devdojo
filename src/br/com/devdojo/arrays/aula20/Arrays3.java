package br.com.devdojo.arrays.aula20;

public class Arrays3 {

    public static void main(String[] args) {

        int[] numeros = new int[5];
        int[] numeros2 = {1, 2, 3, 4, 5}; //tamanho = 5; index = 0 até 4;
        int[] numero3 = new int[] {1, 2, 3, 4, 5};

        //for iterable
        System.out.println("For Itarable");
        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }

        //foreach
        System.out.println("-----------------------");
        System.out.println("Foreach");
        System.out.println("Array numero");
        for(int aux : numeros) {
            System.out.println(aux);
        }

        System.out.println("-----------------------");
        System.out.println("Foreach");
        System.out.println("Array numero2");
        for (int aux : numeros2) {
            System.out.println(aux);
        }

        System.out.println("-----------------------");
        System.out.println("Foreach");
        System.out.println("Array numero3");
        for(int aux : numero3) {
            System.out.println(aux);
        }
    }
}
