package br.com.devdojo.jdbc.db;

import br.com.devdojo.jdbc.classes.Comprador;
import br.com.devdojo.jdbc.conn.ConexaoFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CompradorDB {
    public static void save(Comprador comprador) {
        String sql = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES ('" + comprador.getCpf() + "', '" + comprador.getNome() + "');";
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            ConexaoFactory.close(conn, stmt);
            System.out.println("Registro inserido com sucesso.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void delete(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("Não foi possível excluir o comprador.");
            return;
        }
        String sql = "DELETE FROM `agencia`.`comprador` WHERE `id`='" + comprador.getId() + "';";
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            ConexaoFactory.close(conn, stmt);
            System.out.println("Registro excluído com sucesso.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void update(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("Não foi possível atualizar o registro.");
            return;
        }
        String sql = "UPDATE `agencia`.`comprador` SET `cpf`='" + comprador.getCpf() + "', `nome`='" + comprador.getNome() + "' WHERE `id`='" + comprador.getId() + "';";
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            ConexaoFactory.close(conn, stmt);
            System.out.println("Registro atualizado com sucesso.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Comprador> selectAll() {
        String sql = "SELECT * FROM agencia.comprador;";
        Connection conn = ConexaoFactory.getConexao();
        List<Comprador> compradorList = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                compradorList.add(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
            }
            ConexaoFactory.close(conn, stmt, rs);
            return compradorList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<Comprador> searchByName(String nome) {
        String sql = "SELECT * FROM agencia.comprador WHERE nome LIKE '%" + nome + "%';";
        Connection conn = ConexaoFactory.getConexao();
        List<Comprador> compradorList = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                compradorList.add(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
            }
            ConexaoFactory.close(conn, stmt, rs);
            return compradorList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void selectMedaData() {
        String sql = "SELECT * FROM agencia.comprador";
        Connection conn = ConexaoFactory.getConexao();

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            rs.next();
            int qtdColunas = rsmd.getColumnCount();
            System.out.println("Quantidades de Colunas: " + qtdColunas);
            for (int i = 1; i <= qtdColunas; i++) {
                System.out.println("Tabela: " + rsmd.getTableName(i));
                System.out.println("Nome Coluna: " + rsmd.getColumnName(i));
                System.out.println("Tamanho Coluna: " + rsmd.getColumnDisplaySize(i));
            }

            ConexaoFactory.close(conn, stmt, rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void checkDriverStatus() {
        Connection conn = ConexaoFactory.getConexao();
        try {
            DatabaseMetaData dbmb = conn.getMetaData();

            // Navegabilidade do banco de dados só pode ir para frente
            if(dbmb.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                System.out.println("Suporta TYE_FORWARD_ONLY");
                if(dbmb.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    System.out.println(" e também suporta CONCUR_UPDATABLE");
                }
            }

            // Navegabilidade do banco de dados pode ser para frente e para trás porém, as alterações feitas no banco
            // não afetará esse resultSet enquanto ele estiver aberto. (Esse é o tipo suportado pelo MySQL);
            if(dbmb.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
                System.out.println("Suporta TYPE_SCROLL_INSENSITIVE");
                if(dbmb.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    System.out.println(" e também suporta CONCUR_UPDATABLE");
                }
            }

            // Navegabilidade do banco de dados pode ser para frente e para trás porém, se houver alguma alteração no banco
            // e se esse resultSet estiver aberto essas mudanças serão refletidas nesse objeto.
            if(dbmb.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
                System.out.println("Suporta TYPE_SCROLL_SENSITIVE");
                if(dbmb.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    System.out.println(" e também suporta CONCUR_UPDATABLE");
                }
            }

            ConexaoFactory.close(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
