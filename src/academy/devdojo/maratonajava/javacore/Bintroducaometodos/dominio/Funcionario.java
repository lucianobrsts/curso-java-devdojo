package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime(double[] salarios) {
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
        double totalMedia = 0;
            for (double media : this.salarios) {
                totalMedia += media;
            }
            totalMedia /= this.salarios.length;
        System.out.println("Média dos salários: " + totalMedia);
    }
}
