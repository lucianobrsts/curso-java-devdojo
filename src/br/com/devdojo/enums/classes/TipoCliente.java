package br.com.devdojo.enums.classes;

public enum TipoCliente {

    PESSOA_FISICA(1, "Pessoa Física"), PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private int tipo;
    private String nome;

   TipoCliente(int tipo, String nome) {
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }
}
