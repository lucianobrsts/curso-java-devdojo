package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //byte, short,int, long, float e double o padrão de inicialização é 0
        // char '\u0000' o padrão de inicialização é ' '
        //boolean false
        //Objetos como String null

        int tamanhoArray = 4;

        String[] nomes = new String[tamanhoArray];
        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";
        nomes[3] = "Hinata";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
