package academy.devdojo.maratonajava.javacore.Eblocosdeinicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;
    //1- Alocado espaco em memória para objeto
    //2- cada atributo de classe é criado e inicializado com valores default ou o que for passado
    //3- Bloco de inicialização é execuatado
    //4- Construtor é executado

    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : episodios) {
            System.out.print(episodio + " ");
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
