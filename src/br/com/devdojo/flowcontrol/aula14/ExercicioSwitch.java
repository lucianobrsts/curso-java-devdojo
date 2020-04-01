package br.com.devdojo.flowcontrol.aula14;

public class ExercicioSwitch {

    public static void main(String[] args) {

        int dia = 7;

        switch (dia) {
            case 1:
                System.out.println("Domingo - Final de semana");
                break;
            case 2:
                System.out.println("Segunda-feira - Dia útil");
                break;
            case 3:
                System.out.println("Terça-feira - Dia útil");
                break;
            case 4:
                System.out.println("Quarta-feira - Dia útil");
                break;
            case 5:
                System.out.println("Quinta-feira - Dia útil");
                break;
            case 6:
                System.out.println("Sexta-fera - Dia útil");
                break;
            case 7:
                System.out.println("Sábado - Final de semana");
            default:
                System.out.println("Não é um dia da semana válido");
        }

        System.out.println("------------------");
        //Também pode ser usado dessa forma encurtando código
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção Inválida");
        }
    }
}
