package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest3 {
    public static void main(String[] args) {
//    	 \d = todos os d�gitos
//    	 \D = Tudo o que n�o for d�gito
//    	 \s = espa�os em branco \t \n \f \r
//    	 \S = Todos os caracteres excluindo os brancos
//    	 \w = a - z ou A - Z, d�gitos, _
//    	 \W = Tudo o que n�o for incluso no \w
//    	 [] = Retorna o que descriminado dentro dos colchetes
    	
//    	String regex = "[a-zA-C]";

    	String regex = "0[xX][0-9a-fA-F]";
    	
//        String texto = "abaaba";
    	
        String texto2 = "12 0x 0x 0xFFABC 0x109 0x1";
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
