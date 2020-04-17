package br.com.devdojo.errorhandling.runtimeexception.test;

public class RuntimeExceptionTest {

    public static void main(String[] args) {
        Object o = null;
//        int a = 10;
//        int b = 0;
//
//        if (b != 0) {
//            int c = a / b;
//            System.out.println(c);
//        } else {
//            System.out.println("O número não pode ser zero.");
//        }
//        System.out.println(o.toString());

        try {
            int[] a = new int[2];
            System.out.println(a[2]);
            System.out.println("Imprimindo depois da possível excecao");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("Fora do bloco catch");
    }
}
