package br.com.devdojo.utilityclasses.wrappers.classes;

public class StringBuilderTest {

    public static void main(String[] args) {

        String s = "Uma frase comum...";
        StringBuilder sb = new StringBuilder(16);
        sb.append("def").insert(3, "ghi").reverse().delete(2, 4);
        s = sb.toString();
        System.out.println(sb);
    }
}
