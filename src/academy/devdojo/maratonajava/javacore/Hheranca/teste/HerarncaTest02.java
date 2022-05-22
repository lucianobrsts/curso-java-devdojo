package academy.devdojo.maratonajava.javacore.Hheranca.teste;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerarncaTest02 {
    public static void main(String[] args) {
        //0 - Bloco de inicialização estático da super classe é executado quando a JVM carregar a classe pai
        //1 - Bloco de inicialização estático da subclasse é exectuado quando a JVM carregar classe filha
        //2 - Alocado espaco de memória para o objeto da superclasse
        //3 - Cada atributo da superclasse é criado e inicialização com valores default ou o que for passado
        //4 - Bloco de inicialiação da superclasse é executado na ordem emq ue aparece
        //5 - Contrutor é executado da superclasse
        //6 - Alocado espaco em memória para objeto da subclase
        //7 - Cada atributo de subclasse é criado e inicializado com valores defaout ou o que for passado
        //8 - Bloco de inicialização da subclasse é executado na ordem em que aparece
        //9 - Contrutor é executado da subclasse
        Funcionario funcionario = new Funcionario("Jiraya");
    }
}
