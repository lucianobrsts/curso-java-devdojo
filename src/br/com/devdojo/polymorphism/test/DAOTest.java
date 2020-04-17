package br.com.devdojo.polymorphism.test;

import br.com.devdojo.polymorphism.classes.ArquivoDAOImpl;
import br.com.devdojo.polymorphism.classes.GenericDAO;

import java.util.LinkedList;
import java.util.List;

public class DAOTest {

    public static void main(String[] args) {

        GenericDAO arquivoDAO = new ArquivoDAOImpl();
        arquivoDAO.save();
        List<String> lista = new LinkedList<>();
        lista.add("Nome1");
        lista.add("Nome2");
        lista.add("Nome3");
        lista.add("Nome4");

        for(String nome : lista) {
            System.out.println(nome);
        }
    }
}
