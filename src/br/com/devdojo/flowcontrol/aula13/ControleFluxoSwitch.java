package br.com.devdojo.flowcontrol.aula13;

public class ControleFluxoSwitch {

    public static void main(String[] args) {

        byte dia = 5;

        System.out.println("Usando If");
        if (dia == 1) {
            System.out.println("Domingo");
        } else if (dia == 2) {
            System.out.println("Segunda-feira");
        } else if (dia == 3) {
            System.out.println("Terça-feira");
        } else if (dia == 4) {
            System.out.println("Quarta-feira");
        } else if (dia == 5) {
            System.out.println("Quinta-feira");
        } else if (dia == 6) {
            System.out.println("Sexta-feira");
        } else {
            System.out.println("Sábado");
        }

        //Tipos de variáveis que o switch aceita char, int, byte, short, enum e String
        System.out.println("---------------------");
        System.out.println("Usando Switch");
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-fera");
                break;
            case 7:
                System.out.println("Sábado");
            default:
                System.out.println("Não é um dia da semana válido");
        }

        System.out.println("------------------------");
        char sexo = 'F';
        switch (sexo) {
            case 'F' :
                System.out.println("Feminino");
                break;
            case 'M':
                System.out.println("Masculino");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
    }
}
