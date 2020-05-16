package br.com.devdojo.streams.test;

import br.com.devdojo.streams.classes.Pessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest {
    //Pegar os três primeiros nomes das pessas com menos de 25 anos
    //Ordenados pelo nome

    public static void main(String[] args) {
        List<Pessoa> pessoas = Pessoa.bancodePessoas();
        Collections.sort(pessoas, (o1, o2) -> o1.getNome().compareTo(o2.getNome()));
        List<String> nomes = new ArrayList<>();

        //Java 7
        for(Pessoa pessoa: pessoas) {
            if(pessoa.getIdade() < 25) {
                nomes.add(pessoa.getNome());
                if(nomes.size() >= 3)  {
                    break;
                }
            }
        }
        System.out.println(nomes);

        //Java 8
        List<String> nomes2 = pessoas
                .stream()
                .filter(p -> p.getIdade() < 25)
                .sorted(Comparator.comparing(Pessoa::getNome))
                .limit(3)
                .map(Pessoa::getNome)
                .collect(Collectors.toList());
        System.out.println(nomes2);
    }
}
