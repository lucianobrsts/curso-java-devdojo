package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest2 {
    public static void main(String[] args) {
//    	 \d = todos os d�gitos
//    	 \D = Tudo o que n�o for d�gito
//    	 \s = espa�os em branco \t \n \f \r
//    	 \S = Todos os caracteres excluindo os brancos
//    	 \w = a - z ou A - Z, d�gitos, _
//    	 \W = Tudo o que n�o for incluso no \w
    	
    	String regex = "\\W";
    	
//        String texto = "abaaba";
    	
        String texto2 = "@#hh_j2 12gvh21";
        Pattern pattern =  Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  " + texto2);
        System.out.println("indice: 123456789" );
        System.out.println("regex " + regex);
        System.out.println("Posicoes encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
