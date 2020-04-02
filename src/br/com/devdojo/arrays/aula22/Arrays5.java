package br.com.devdojo.arrays.aula22;

public class Arrays5 {

    public static void main(String[] args) {
        //Arrays podem ser inicializados dessa maneira
        int[] arrayInt = {1, 2, 3};
        int[] arrayInt2 = new int[3];
        int[] arrayInt3 = new int[] {1, 2, 3};

//        int[][] dias = new int[3][];
//        dias[0] = new int[2];
//        dias[1] = new int[]{1, 2, 3};
//        dias[2] = new int[4];

        int[][] dias = {{0, 0}, {1, 2, 3}, {0, 0, 0, 0}};

        //Qual o valor do array na posição [1][2] = 3;
        for (int[] arr : dias ) {
            for(int num : arr) {
                System.out.println(num);
            }
        }
    }
}
