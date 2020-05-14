package br.com.devdojo.designpattern.dao.interfaces;

import br.com.devdojo.designpattern.dao.classes.Carro;

import java.util.List;

public interface CarroDAO {

   void save(Carro carro);

    void delete(Carro carro);

    void update(Carro carro);

    List<Carro> selectAll();

    List<Carro> searchByName(String nome);
}
