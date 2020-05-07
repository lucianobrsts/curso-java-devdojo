package br.com.devdojo.jdbc.test;

import br.com.devdojo.jdbc.classes.Comprador;
import br.com.devdojo.jdbc.db.CompradorDB;

public class ConexaoTest {
    public static void main(String[] args) {
        Comprador comprador = new Comprador("736.004.800-14", "Priscilla");
        CompradorDB compradorDB = new CompradorDB();
        compradorDB.save(comprador);

    }
}
