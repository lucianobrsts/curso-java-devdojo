package br.com.devdojo.flowcontrol.aula11;

public class OperadorTernario {

    public static void main(String[] args) {

        int idade = 18;
        String status;

        System.out.println("Sem variável status");
        if (idade < 18) {
            System.out.println("Resultado: Não Adulto");
        } else {
            System.out.println("Resultado: Adulto");
        }

        System.out.println("--------------------");
        System.out.println("Com variável status");
        if (idade < 18) {
            status = "Não Adulto";
        } else {
            status = "Adulto";
        }
        System.out.println("Resutlado: " + status);

        System.out.println("---------------------");
        System.out.println("Operador Ternário");
        status = idade < 18 ? "Não adulto" : "Adulto";
        System.out.println("Resutlado: " + status);
    }
}
