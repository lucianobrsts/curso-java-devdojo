package academy.devdojo.maratonajava.javacore.Lclassesabstratatas.dominio;

public class Gerente extends Funcionario {

    @Override
    public void calculaBonus() {
        this.salario = salario + salario * 0.2;
    }

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
