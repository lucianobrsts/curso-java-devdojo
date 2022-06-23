package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest4 {
    public static void main(String[] args) {
//    	 \d = todos os d�gitos
//    	 \D = Tudo o que n�o for d�gito
//    	 \s = espa�os em branco \t \n \f \r
//    	 \S = Todos os caracteres excluindo os brancos
//    	 \w = a - z ou A - Z, d�gitos, _
//    	 \W = Tudo o que n�o for incluso no \w
//    	 [] = Retorna o que descriminado dentro dos colchetes
//    	 ? = Zero ou uma ocorr�ncia
//    	 * = Zero ou mais ocorr�ncia
//    	 + = uma ou mais ocorr�ncia
//    	 {} = {n, m} de n at� m
//    	 () = agrupamento
//    	 | = ou - o(v|c)o - ovo| oco
//    	 $ = fim da linha
    	
    	String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
    	
        String texto = "12 0x 0x 0xFFABC 0x10G 0x1";
        Pattern pattern =  Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  " + texto);
        System.out.println("indice: 123456789" );
        System.out.println("regex " + regex);
        System.out.println("Posicoes encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
