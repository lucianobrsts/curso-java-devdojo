package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        //+ - / *

        int numero1 = 10;
        int numero2 = 20;
        double resultado = numero1 / (double)numero2;
        System.out.println(resultado);

        //% -resto
        int resto = 20 % 6;
        System.out.println(resto);

        // Operadores lógicos sempre retornam booleanos - < >  <=  >=  == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezIgualQueDez = 10 == 10;
        boolean isDezDiferenteQueDez = 10 !=  10;
        System.out.println("isDezMaiorQueVinte  - " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte - " + isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte - " + isDezIgualQueVinte);
        System.out.println("isDezIgualQueDez - " + isDezIgualQueDez);
        System.out.println("isDezDiferenteQueDez - " + isDezDiferenteQueDez);

    }
}
