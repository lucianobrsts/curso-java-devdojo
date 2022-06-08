package academy.devdojo.maratonajava.javacore.Qstring.teste;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "William Suane";
        nome.concat(" DevDojo");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("William Suane");
        sb.append(" DevDojo");
        System.out.println(sb);
    }
}
