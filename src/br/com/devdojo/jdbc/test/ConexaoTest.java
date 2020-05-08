package br.com.devdojo.jdbc.test;

import br.com.devdojo.jdbc.classes.Comprador;
import br.com.devdojo.jdbc.db.CompradorDB;

import java.util.List;

public class ConexaoTest {
    public static void main(String[] args) {
//        inserir();
//        deletar();
//        atualizar();

//        List<Comprador> listaComprador = selecionarTudo();
//        System.out.println(listaComprador);

//        List<Comprador> listaComprador2 = buscarPorNome("a");
//        System.out.println(listaComprador2);

//        CompradorDB.selectMedaData();

//        CompradorDB.checkDriverStatus();

        CompradorDB.testTypeScroll();
    }

    public static void inserir() {
        Comprador comprador = new Comprador("736.004.800-14", "Priscilla");
        CompradorDB.save(comprador);
    }

    public static void deletar() {
        Comprador comprador = new Comprador();
        comprador.setId(2);
        CompradorDB.delete(comprador);
    }

    public static void atualizar() {
        Comprador comprador = new Comprador(1, "MARIA", "111.111.111.-00");
        CompradorDB.update(comprador);
    }

    public static List<Comprador> selecionarTudo() {
        return CompradorDB.selectAll();
    }

    public static List<Comprador> buscarPorNome(String nome) {
        return CompradorDB.searchByName(nome);
    }
}
