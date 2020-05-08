package br.com.devdojo.jdbc.conn;

import java.sql.*;

public class ConexaoFactory {
    //java.sql => Possui as Interfaces: (São interfaces pq dependem exclusivamente do schema de banco de dados que está em uso.
    // Connection: Busca a Conexão com banco de dados;
    // Statement: Realiza operações que vão afetar o estado do banco de dados;
    // ResultSet: Trabalha com os resultados de uma consulta;

    // Driver Manager: é uma classe concreta que busca o conector especifico do banco de dados e devolve uma conexão que lhe permite trabalhar com todas as interfaces.

    public static Connection getConexao() {
        String url = "jdbc:mysql://localhost:3306/agencia?useSSL=false";
        String user = "root";
        String password = "123456";

        try {
//            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void close(Connection connection) {
        try {
            if(connection != null)
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(Connection connection, Statement stmt) {
        close(connection);
        try {
            if(stmt != null)
                connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(Connection connection, Statement stmt, ResultSet rs) {
        close(connection, stmt);
        try {
            if(rs != null)
                rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
