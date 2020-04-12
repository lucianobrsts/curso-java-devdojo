package br.com.devdojo.associationandinheritance.inheritance.test;

import br.com.devdojo.associationandinheritance.inheritance.classes.Endereco;
import br.com.devdojo.associationandinheritance.inheritance.classes.Funcionario;

public class HerancaTest {

    public static void main(String[] args) {

//        Pessoa pessoa = new Pessoa("Gina");
        Endereco endereco = new Endereco();
//
//        pessoa.setCpf("12345");
//
//        endereco.setBairro("Bairro 1");
        endereco.setRua("Rua 25");
//        pessoa.setEndereco(endereco);

//        pessoa.imprime();

        Funcionario funcionario =  new Funcionario("Augusto");
        funcionario.setCpf("009987");
        funcionario.setSalario(15000);
        funcionario.setEndereco(endereco);
        funcionario.imprime();

    }
}
