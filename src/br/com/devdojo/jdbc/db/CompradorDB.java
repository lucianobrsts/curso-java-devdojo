package br.com.devdojo.jdbc.db;

import br.com.devdojo.jdbc.classes.Comprador;
import br.com.devdojo.jdbc.classes.MyRowSetListener;
import br.com.devdojo.jdbc.conn.ConexaoFactory;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
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

    public static void saveTransaction() throws SQLException {
        String sql1 = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES ('Teste 1', 'Teste 1');";
        String sql2 = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES ('Teste 2', 'Teste 3');";
        String sql3 = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES ('Teste 2', 'Teste 3');";
        Connection conn = ConexaoFactory.getConexao();

        Savepoint savepoint = null;

        try {
            conn.setAutoCommit(false);
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql1);
            savepoint = conn.setSavepoint("Oao");
            stmt.executeUpdate(sql2);
            if(true) {
                throw new SQLException();
            }
            stmt.executeUpdate(sql3);
            conn.commit();
            ConexaoFactory.close(conn, stmt);
            System.out.println("Registro inserido com sucesso.");
        } catch (SQLException e) {
            e.printStackTrace();
            conn.rollback(savepoint);
            conn.commit();
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

    public static void updatePreparedStetament(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("Não foi possível atualizar o registro.");
            return;
        }
        String sql = "UPDATE `agencia`.`comprador` SET `cpf`= ?, `nome`= ? WHERE `id`= ?;";
        Connection conn = ConexaoFactory.getConexao();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, comprador.getCpf());
            ps.setString(2, comprador.getNome());
            ps.setInt(3, comprador.getId());
            ps.executeUpdate();
            ConexaoFactory.close(conn, ps);
            System.out.println("Registro atualizado com sucesso.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateRowSet(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("Não foi possível atualizar o registro.");
            return;
        }
//        String sql = "UPDATE `agencia`.`comprador` SET `cpf`= ?, `nome`= ? WHERE `id`= ?;";
        String sql = "SELECT * FROM agencia.comprador WHERE id = ?";
        JdbcRowSet jrs = ConexaoFactory.getRowSetConection();
        jrs.addRowSetListener(new MyRowSetListener());
        try {

            jrs.setCommand(sql);
//            jrs.setString(1, comprador.getCpf());
//            jrs.setString(2, comprador.getNome());
            jrs.setInt(1, comprador.getId());
            jrs.execute();
            jrs.next();
            jrs.updateString("nome", "LUCIANO");
            jrs.updateRow();

            ConexaoFactory.close(jrs);
            System.out.println("Registro atualizado com sucesso.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateRowSetCached(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("Não foi possível atualizar o registro.");
            return;
        }
        String sql = "SELECT * FROM comprador WHERE id = ?";
        CachedRowSet crs = ConexaoFactory.getRowSetConectionCached();
        try {

            crs.setCommand(sql);
            crs.setInt(1, comprador.getId());
            crs.execute();
            crs.next();
            crs.updateString("nome", "LULU");
            crs.updateRow();
            Thread.sleep(10000);
            crs.acceptChanges();
            System.out.println("Registro atualizado com sucesso.");
        } catch (SQLException | InterruptedException e) {
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

    public static List<Comprador> searchByNamePreparedStatement(String nome) {
        String sql = "SELECT * FROM agencia.comprador WHERE nome LIKE ?;";
        Connection conn = ConexaoFactory.getConexao();
        List<Comprador> compradorList = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + nome + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                compradorList.add(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
            }
            ConexaoFactory.close(conn, ps, rs);
            return compradorList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<Comprador> searchByNameRowSet(String nome) {
        String sql = "SELECT * FROM agencia.comprador WHERE nome LIKE ?;";
        JdbcRowSet jrs = ConexaoFactory.getRowSetConection();
        jrs.addRowSetListener(new MyRowSetListener());
        List<Comprador> compradorList = new ArrayList<>();
        try {
            jrs.setCommand(sql);
            // PreparedStatement ps = jrs.prepareStatement(sql);
            jrs.setString(1, "%" + nome + "%");
            jrs.execute();
            while (jrs.next()) {
                compradorList.add(new Comprador(jrs.getInt("id"), jrs.getString("cpf"), jrs.getString("nome")));
            }
            ConexaoFactory.close(jrs);
            return compradorList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<Comprador> searchByNameCallableStatement(String nome) {
        String sql = "CALL `agencia`.`SP_GetCompradoresPorNome`( ? )";
        Connection conn = ConexaoFactory.getConexao();
        List<Comprador> compradorList = new ArrayList<>();
        try {
            CallableStatement cs = conn.prepareCall(sql);
            cs.setString(1, "%" + nome + "%");
            ResultSet rs = cs.executeQuery();
            while (rs.next()) {
                compradorList.add(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
            }
            ConexaoFactory.close(conn, cs, rs);
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
            if (dbmb.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                System.out.println("Suporta TYE_FORWARD_ONLY");
                if (dbmb.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    System.out.println(" e também suporta CONCUR_UPDATABLE");
                }
            }

            // Navegabilidade do banco de dados pode ser para frente e para trás porém, as alterações feitas no banco
            // não afetará esse resultSet enquanto ele estiver aberto. (Esse é o tipo suportado pelo MySQL);
            if (dbmb.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
                System.out.println("Suporta TYPE_SCROLL_INSENSITIVE");
                if (dbmb.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    System.out.println(" e também suporta CONCUR_UPDATABLE");
                }
            }

            // Navegabilidade do banco de dados pode ser para frente e para trás porém, se houver alguma alteração no banco
            // e se esse resultSet estiver aberto essas mudanças serão refletidas nesse objeto.
            if (dbmb.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
                System.out.println("Suporta TYPE_SCROLL_SENSITIVE");
                if (dbmb.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    System.out.println(" e também suporta CONCUR_UPDATABLE");
                }
            }

            ConexaoFactory.close(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void testTypeScroll() {
        String sql = "SELECT * FROM agencia.comprador;";
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.last()) {
                System.out.println("Ultima linha: " + new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
                System.out.println("Númuero da linha: " + rs.getRow());
                System.out.println("---------------------------");
            }

            System.out.println("Retornou para a primeira linha: " + rs.first());
            System.out.println("Primeira linha: " + rs.getRow());
            System.out.println("---------------------------");

            System.out.println(rs.absolute(4));
            System.out.println("Linha 4: " + new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
            System.out.println("---------------------------");

            rs.relative(-1);
            System.out.println("Linha: " + rs.getRow());
            System.out.println("Comprador: " + new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
            System.out.println("---------------------------");

            System.out.println("É a ultima linha: " + rs.isLast());
            System.out.println("É a primeira linha: " + rs.isFirst());
            System.out.println("Linha atual: " + rs.getRow());
            System.out.println("---------------------------");

            rs.afterLast();
            System.out.println("Percorre ao contrário.");
            while (rs.previous()) {
                System.out.println("Comprador: " + new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
            }

            ConexaoFactory.close(conn, stmt, rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateNomesToLowerCase() {
        String sql = "SELECT * FROM agencia.comprador;";
        Connection conn = ConexaoFactory.getConexao();

        try {
            DatabaseMetaData dbmd = conn.getMetaData();

            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println(dbmd.updatesAreDetected(ResultSet.TYPE_SCROLL_INSENSITIVE));
            System.out.println(dbmd.insertsAreDetected(ResultSet.TYPE_SCROLL_INSENSITIVE));
            System.out.println(dbmd.deletesAreDetected(ResultSet.TYPE_SCROLL_INSENSITIVE));
            if (rs.next()) {
                rs.updateString("nome", rs.getString("nome").toUpperCase());
//                rs.cancelRowUpdates();
                rs.updateRow();
//                if(rs.rowUpdated()) {
//                    System.out.println("Linha atualizada");
//                }
            }
            rs.absolute(2);
            String nome = rs.getString("nome");
            rs.moveToInsertRow();
            rs.updateString("nome", nome.toUpperCase());
            rs.updateString("cpf", "999.999.999-99");

//            rs.insertRow();
//            rs.moveToCurrentRow();
//            System.out.println(rs.getString("nome") + " Row " + rs.getRow());

            rs.absolute(7);
            rs.deleteRow();

            ConexaoFactory.close(conn, stmt, rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
