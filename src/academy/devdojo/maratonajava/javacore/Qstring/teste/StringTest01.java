package academy.devdojo.maratonajava.javacore.Qstring.teste;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "William";
        String nome2 = "William";
        nome = nome.concat(" Suane");
        System.out.println(nome);
        System.out.println(nome == nome2);

        String nome3 = new String("William"); //1 variável de referência, 2 objeto do tipo string e 3 uma string do pool
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
