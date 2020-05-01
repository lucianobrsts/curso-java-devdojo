package br.com.devdojo.collections.classes;

public class Celular {
    private String nome;
    private String IMEI;

    public Celular(String nome, String IMEI) {
        this.nome = nome;
        this.IMEI = IMEI;
    }

    // O método Equals tem de ser reflexivo Ex: (x.equals(x) tem que ser true para tudo que for diferente de nulo)
    // Simétrico para x e y diferente  de null, se x.equals(y) == true logo y.equals(x) tem que ser true também
    // Transitividade para x, y, z diferetes de null, se x.equals(y) == true, logo y.equals(x) == true e x.equals(z) == true logo y.equals(z) também tem que ser true
    // Consistente x.equals(y) deve sempre retornar o mesmo valor
    // Para x diferente de null x.equals(null) tem que retornar false.


    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        Celular outroCelular = (Celular) obj;
        return IMEI != null && IMEI.equals(outroCelular.getIMEI());
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
