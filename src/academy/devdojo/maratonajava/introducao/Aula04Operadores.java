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

        // AND (&&) - OR (||) - ! = Logical NOt (NOT)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        double valorPlaystation = 5000F;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador += 1; //contador = contador + 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        System.out.println(contador);



    }
}
