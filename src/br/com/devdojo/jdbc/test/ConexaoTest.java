package br.com.devdojo.jdbc.test;

import br.com.devdojo.jdbc.conn.ConexaoFactory;

public class ConexaoTest {
    public static void main(String[] args) {
    ConexaoFactory conn = new ConexaoFactory();
    conn.getConexao();

    }
}
