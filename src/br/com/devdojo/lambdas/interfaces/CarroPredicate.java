package br.com.devdojo.lambdas.interfaces;


import br.com.devdojo.lambdas.classes.Carro;

@FunctionalInterface
public interface CarroPredicate {

    //Quais as vantagens de se usar a Interface Predicate:
    // 1- Código reduzido.
    // 2- Mantém-se o padrão de várias funções java que usam predicate.
    // 3- Se ganha a habilidade de pegar diversos métodos e passar esses métodos como parâmetros (a quantidade e a qualidade do código vai melhorar bastante).
    // 4- Permnite que o código seja mais adaptável as mudanças de requisitos que vierem a acontecer.
    // 5- Livra o programador de tempo e dor de cabeça excessiva usando essa boa prática.

    boolean test(Carro carro);

    //(parametro) -> <expressão>;
    //(Carro carro -> carro.getCor().equals("verde");

}
