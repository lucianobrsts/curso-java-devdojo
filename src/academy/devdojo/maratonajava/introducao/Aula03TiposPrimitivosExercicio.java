package academy.devdojo.maratonajava.introducao;

/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicio {

    public static void main(String[] args) {
        String nome = "Luciano Brito";
        String endereco = "Rua tal, 120";
        double salario = 10000.0;
        String dataRecebimentoSalario = "10/10/2021";
        String relatorio = "Eu " + nome + ", morando no endereço " + endereco + "," +
                "\nconfirmo que recebi o salário de " + salario + " na data " + dataRecebimentoSalario;

        System.out.println(relatorio);
    }


}
