package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //byte, short,int, long, float e double o padrão de inicialização é 0
        // char '\u0000' o padrão de inicialização é ' '
        //boolean false
        //Objetos como String null

        String[] nomes = new String[3];
//        idades[0] = 21;
//        idades[1] = 15;
//        idades[2] = 30;

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
