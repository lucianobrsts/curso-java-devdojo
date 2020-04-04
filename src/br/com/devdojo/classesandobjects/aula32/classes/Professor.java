package br.com.devdojo.classesandobjects.aula32.classes;

public class Professor {

    public String nome;
    public String matricula;
    public String rg;
    public String cpf;

    public void imprimir() {
        System.out.println("**** -- Dados Professor -- ****");
        System.out.println("Nome: " + this.nome);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("RG: " + this.rg);
        System.out.println("CPF: " + this.cpf);
    }

}
