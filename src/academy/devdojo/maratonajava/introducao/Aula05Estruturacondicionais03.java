package academy.devdojo.maratonajava.introducao;

public class Aula05Estruturacondicionais03 {
    public static void main(String[] args) {
        //Doar se salario > 5000

        //Operador ternário
        // String resultado = (condição) ? verdadeiro : falso

        double salario = 6000;

        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}
