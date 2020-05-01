package br.com.devdojo.collections.classes;

public class Celular {
    private String nome;
    private String IMEI;

    public Celular(String nome, String IMEI) {
        this.nome = nome;
        this.IMEI = IMEI;
    }

    // Para o método HashCode
    // Se x.equals(y) == true y.hashCode() == x.hashCode();
    // y.hashCode() == x.hashCode não necessariamente o equals deverá retornar true.
    // x.equals(y) == false.
    // y.hashCode() != x.hashCode() x.equals(y) deverá ser false

    @Override
    public int hashCode() {
        return IMEI != null ? IMEI.hashCode() : 1;
    }
    // Para o métodos Equals
    // O método Equals tem de ser reflexivo Ex: (x.equals(x) tem que ser true para tudo que for diferente de nulo)
    // Simétrico para x e y diferente de null, se x.equals(y) == true logo y.equals(x) tem que ser true também
    // Transitividade para x, y, z diferen tes de null, se x.equals(y) == true, logo y.equals(x) == true e x.equals(z) == true logo y.equals(z) também tem que ser true
    // Consistente x.equals(y) deve sempre retornar o mesmo valor
    // Para x diferente de null x.equals(null) tem que retornar false.

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Celular outroCelular = (Celular) obj;
        return IMEI != null && IMEI.equals(outroCelular.getIMEI());
    }

    @Override
    public String toString() {
        return "Celular{" +
                "nome='" + nome + '\'' +
                ", IMEI='" + IMEI + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }
}
