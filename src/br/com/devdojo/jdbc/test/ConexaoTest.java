package br.com.devdojo.jdbc.test;

import br.com.devdojo.jdbc.classes.Comprador;
import br.com.devdojo.jdbc.db.CompradorDB;

import java.sql.SQLException;
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

//        CompradorDB.testTypeScroll();

//        CompradorDB.updateNomesToLowerCase();

//        System.out.println(CompradorDB.searchByNamePreparedStatement("oao"));

//        CompradorDB.updatePreparedStetament(new Comprador(1, "011.011.011-01", "Prepared Statement da Silva"));

//        System.out.println(CompradorDB.searchByNameCallableStatement("oao"));

//        System.out.println(CompradorDB.searchByNameRowSet("oao"));

//        CompradorDB.updateRowSet(new Comprador(1, "011.011.011-01", "Prepared Statement da Silva"));

//        CompradorDB.updateRowSetCached(new Comprador(1, "011.011.011-01", "Prepared Statement da Silva"));

        try {
            CompradorDB.saveTransaction();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
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
