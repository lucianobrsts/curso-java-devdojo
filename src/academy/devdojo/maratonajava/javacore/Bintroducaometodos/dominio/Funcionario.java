package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double totalMedia;

    public void imprime() {
        if (salarios == null) {
            System.out.println("Informações incompletas!");
            return;
        }
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        for (double salario : salarios) {
            System.out.println("Salário: " + salario);
        }
        imprimeMediaESalarios();
    }

    public void imprimeMediaESalarios() {
        if (salarios == null) {
            return;
        }
        for (double media : this.salarios) {
            totalMedia += media;
        }
        totalMedia /= this.salarios.length;
        System.out.println("Média dos salários: " + totalMedia);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getTotalMedia() {
        return totalMedia;
    }

}
