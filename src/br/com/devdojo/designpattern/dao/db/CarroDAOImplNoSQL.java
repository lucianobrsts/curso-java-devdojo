package br.com.devdojo.designpattern.dao.db;

import br.com.devdojo.designpattern.dao.classes.Carro;
import br.com.devdojo.designpattern.dao.classes.Comprador;
import br.com.devdojo.designpattern.dao.conn.ConexaoFactory;
import br.com.devdojo.designpattern.dao.interfaces.CarroDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarroDAOImplNoSQL implements CarroDAO {

    @Override
    public void save(Carro carro) {
        String sql = "INSERT INTO `agencia`.`carro` (`nome`, `placa`, `compradorid`) VALUES (?, ?, ?);";

        try (Connection conn = ConexaoFactory.getConexao();
             PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setString(1, carro.getNome());
            ps.setString(2, carro.getPlaca());
            ps.setInt(3, carro.getComprador().getId());
            ps.executeUpdate();
            System.out.println("---------------------------------");
            System.out.println("Registro inserido com sucesso.");
            System.out.println("---------------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Carro carro) {
        if (carro == null || carro.getId() == null) {
            System.out.println("Não foi possível excluir o carro.");
            return;
        }
        String sql = "DELETE FROM `agencia`.`carro` WHERE `id`= ?;";
        try (Connection conn = ConexaoFactory.getConexao();
             PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setInt(1, carro.getId());
            ps.executeUpdate();
            System.out.println("---------------------------------");
            System.out.println("Registro excluído com sucesso.");
            System.out.println("---------------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Carro carro) {
        if (carro == null || carro.getId() == null) {
            System.out.println("Não foi possível atualizar o registro.");
            return;
        }
        String sql = "UPDATE `agencia`.`carro` SET `placa`= ?, `nome`=? WHERE `id`= ?";
        try (Connection conn = ConexaoFactory.getConexao();
             PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setString(1, carro.getPlaca());
            ps.setString(2, carro.getNome());
            ps.setInt(3, carro.getId());
            ps.executeUpdate();
            System.out.println("---------------------------------");
            System.out.println("Registro atualizado com sucesso.");
            System.out.println("---------------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Carro> selectAll() {
        String sql = "SELECT id, nome, placa, compradorid FROM agencia.carro;";
        List<Carro> carroList = new ArrayList<>();

        try (Connection conn = ConexaoFactory.getConexao();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Comprador comprador = CompradorDAO.searchById(rs.getInt("compradorid"));
                carroList.add(new Carro(rs.getInt("id"), rs.getString("placa"), rs.getString("nome"), comprador));
            }
            return carroList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Carro> searchByName(String nome) {
        String sql = "SELECT id, nome, placa, compradorid FROM agencia.carro WHERE nome LIKE ?";
        List<Carro> carroList = new ArrayList<>();

        try (Connection conn = ConexaoFactory.getConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, "%" + nome + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Comprador comprador = CompradorDAO.searchById(rs.getInt("compradorid"));
                carroList.add(new Carro(rs.getInt("id"), rs.getString("placa"), rs.getString("nome"), comprador));
            }
            ConexaoFactory.close(conn, ps, rs);
            return carroList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
