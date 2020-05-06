package br.com.devdojo.innerclasses.test;

public class ClassesLocaisTest {
    private String nome = "Luciano Brito";

    public void fazAlgumaCoisa() {
        String sobrenome = "Brito";
        class Interna {
            public void imprimeNomeExterno() {
                System.out.println(nome);
            }
        }
        Interna in = new Interna();
        in.imprimeNomeExterno();
    }

    public static void main(String[] args) {
        ClassesLocaisTest externa = new ClassesLocaisTest();
        externa.fazAlgumaCoisa();
    }
}
