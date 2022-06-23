package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest5 {
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
//    	 . = 1.3 = 123, 133, 1@3, 1A3 - Tudo que estiver entre um e 3
    	
    	String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
    	
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail";
        System.out.println("Email v�lido: " + "zoro@mail.br".matches(regex));
        System.out.println(texto.split(",")[1].trim());
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
