package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("----- Seminário Uni7 _____");
        System.out.println("Professor: " + this.nome);
        if (seminarios == null) return;
        for (Seminario seminario : seminarios) {
            System.out.println("Título: " + seminario.getTitulo());
            System.out.println("Local: " + seminario.getLocal().getEndereco());
            if (seminario.getAlunos().length == 0 || seminario.getAlunos() == null) continue;
            System.out.println("----- Alunos _____");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno: " + aluno.getNome() + " idade: " + aluno.getIdade());
            }
        }

        System.out.println("--------------------------");
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
