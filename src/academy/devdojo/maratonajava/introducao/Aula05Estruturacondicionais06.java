package academy.devdojo.maratonajava.introducao;

public class Aula05Estruturacondicionais06 {
    public static void main(String[] args) {
        //Utilizando switch e dado os valores de 1 a 7, imprima se é dia util ou final de
        // semana, considerando 1 como Domingo

        byte dia = 3;
        String diaUtil = "Dia Util";
        String finalSemana = "Final de semana";

        System.out.println("--- Primeira opão ---");
        switch (dia) {
            case 1:
                System.out.println(finalSemana);
                break;
            case 2:
                System.out.println(diaUtil);
                break;
            case 3:
                System.out.println(diaUtil);
                break;
            case 4:
                System.out.println(diaUtil);
                break;
            case 5:
                System.out.println(diaUtil);
                break;
            case 6:
                System.out.println(diaUtil);
                break;
            case 7:
                System.out.println(finalSemana);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        System.out.println("--- Segunda opão ---");

        switch (dia) {
            case 1:
            case 7:
                System.out.println(finalSemana);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println(diaUtil);
            default:
                System.out.println("Opção Inválida");
                break;
        }
    }
}
