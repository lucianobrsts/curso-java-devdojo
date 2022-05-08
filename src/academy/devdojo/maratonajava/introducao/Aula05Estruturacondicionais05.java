package academy.devdojo.maratonajava.introducao;

public class Aula05Estruturacondicionais05 {
    public static void main(String[] args) {
        //Imprima o dia da semana, considerando 1 como domingo

        byte dia = 1;

        System.out.println("--- Usando if ---");
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
        } else if (dia == 7) {
            System.out.println("Sábado");
        } else {
            System.out.println("Opção Inválida!");
        }


        System.out.println("--- Usando Switch ---");
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
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
            default:
                System.out.println("Opção Inválida!");
                break;
        }

        System.out.println("--- Case sexo ---");
        char sexo = 'F';

        switch (sexo) {
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminio");
                break;
            default:
                System.out.println("Inválido");
                break;
        }
    }
}
