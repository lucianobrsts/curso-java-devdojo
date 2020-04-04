package br.com.devdojo.classesandobjects.aula31.classes;

public class Professor {

    public String nome;
    public String matricula;
    public String rg;
    public String cpf;

    public void imprimir(Professor professor) {
        System.out.println("**** -- Dados Professor -- ****");
        System.out.println("Nome: " + professor.nome);
        System.out.println("Matrícula: " + professor.matricula);
        System.out.println("RG: " + professor.rg);
        System.out.println("CPF: " + professor.cpf);
    }

}
