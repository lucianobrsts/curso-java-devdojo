package br.com.devdojo.associationandinheritance.associationexercise.classes;

public class Professor {

    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor() {
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void print() {
        System.out.println(" --------------------- Relatório de Professores --------------------- ");
        System.out.println("Nome Professor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        System.out.println(" ---------------------Seminários Participantes --------------------- ");
        for(Seminario sem : seminarios) {
            System.out.println(sem.getTitulo());
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}


