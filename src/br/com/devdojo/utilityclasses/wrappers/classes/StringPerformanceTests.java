package br.com.devdojo.utilityclasses.wrappers.classes;

public class StringPerformanceTests {

    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(100000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto String: " + (fim - inicio) + " ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(100000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto StringBuilder: " + (fim - inicio) + " ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(100000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto StringBuffer: " + (fim - inicio) + " ms");
    }

    private static void concatString(int tamanho) {
        String string = "";
        for(int i = 0; i < tamanho; i++) {
            string += i;
        }
    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < tamanho; i++) {
            stringBuilder.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho) {
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = 0; i < tamanho; i++) {
            stringBuffer.append(i);
        }
    }
}
