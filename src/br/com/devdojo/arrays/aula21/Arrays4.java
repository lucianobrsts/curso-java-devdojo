package br.com.devdojo.arrays.aula21;

public class Arrays4 {

    public static void main(String[] args) {

        int[][] dias = new int[2][2];
        dias[0][0] = 30;
        dias[0][1] = 31;
        dias[1][0] = 29;
        dias[1][1] = 28;

        System.out.println("-------------------------");
        System.out.println("For Iterable");
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("-------------------------");
        System.out.println("Foreach");
        for (int ref[] : dias) {
            for (int dia : ref ) {
                System.out.println(dia);
            }
        }
    }
}