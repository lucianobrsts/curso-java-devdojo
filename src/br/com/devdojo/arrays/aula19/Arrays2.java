package br.com.devdojo.arrays.aula19;

public class Arrays2 {

    public static void main(String[] args) {
        //Valores padrões das variáveis
        //byte, short, int, long == 0;
        //float, double == 0.0;
        //char == ' ';
        //boolean == false;
        //reference (objetos) == null;
        String[] nomes = new String[3];
        nomes[0] = "Naruto";
        nomes[1] = "Goku";
        nomes[2] = "Luffy";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(i + " nome " + nomes[i]);
        }

        System.out.println();
        System.out.println("---------------------------");
        //Ao instanciar nesse local o array com 4 posições e não preencher automaticamente as outras posições 0, 1, 2 estarão nulas
        nomes = new String[4];
        nomes[3] = "Luciano";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(i + " nome " + nomes[i]);
        }
    }
}
