package br.com.devdojo.collections.test;

import br.com.devdojo.collections.classes.Celular;

public class EqualsTest {
    public static void main(String[] args) {
        String nome1 = "Luciano Brito";
        String nome2 = new String("Luciano Brito");
        Integer int1 = 5;
        Integer int2 = new Integer(5);
        System.out.println(nome1.equals(nome2));
        System.out.println(int1.equals(int2));

        Celular c1 = new Celular("IPhone", "123");
        Celular c2 = new Celular("IPhone", "1234");
        System.out.println(c2.equals(c1));
    }
}
