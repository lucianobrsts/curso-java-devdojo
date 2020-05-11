package br.com.devdojo.jdbc.test;

import br.com.devdojo.jdbc.classes.Carro;
import br.com.devdojo.jdbc.classes.Comprador;
import br.com.devdojo.jdbc.db.CarroDAO;

import java.util.List;
import java.util.Scanner;

public class CarroCRUD {
    private static Scanner teclado = new Scanner(System.in);

    public static void executar(int op) {
        switch (op) {
            case 1:
                inserir();
                break;
            case 2:
                atualizar();
                break;
            case 3:
                listar();
                break;
            case 4:
                System.out.println("Digite um nome para a busca: ");
                buscarPorNome(teclado.nextLine());
                break;
            case 5:
                deletar();
                break;
        }
    }


    private static void inserir() {
        Carro carro = new Carro();
        System.out.println("Digite o nome do carro: ");
        carro.setNome((teclado.nextLine()).toUpperCase());
        System.out.println("Digite a placa do carro: ");
        carro.setPlaca(teclado.nextLine());
        System.out.println("Selecione um dos compradores abaixo para deletar: ");
        List<Comprador> compradorList = CompradorCRUD.listar();
        carro.setComprador(compradorList.get(Integer.parseInt(teclado.nextLine())));

        if (carro != null) {
            CarroDAO.save(carro);
        }
    }

    private static void atualizar() {
        System.out.println("Selecione um dos carros abaixo: ");
        List<Carro> carroList = listar();
        Carro carro = carroList.get(Integer.parseInt(teclado.nextLine()));
        System.out.println("Digite um novo nome ou pressione ENTER para manter o mesmo...");
        String nome = teclado.nextLine();
        System.out.println("Digite uma nova placa ou pressione ENTER para manter a mesma...");
        String placa = teclado.nextLine();

        if (!nome.isEmpty()) {
            carro.setNome(nome.toUpperCase());
        }

        if (!placa.isEmpty()) {
            carro.setPlaca(placa);
        }
        CarroDAO.update(carro);
    }

    private static List<Carro> listar() {
        List<Carro> carroList = CarroDAO.selectAll();
        System.out.println(" ----- Lista de Carros ----- ");
        if (carroList.isEmpty()) {
            System.out.println("Não existem carros cadastrados.");
            System.out.println("----------------------------------");
        } else {
            for (int i = 0; i < carroList.size(); i++) {
                Carro c = carroList.get(i);
                System.out.println("[" + i + "] Nome: " + c.getNome() + " Placa: " + c.getPlaca() + " Comprador: " + c.getComprador().getNome());
            }
            System.out.println("----------------------------------");
        }
        return carroList;
    }

    private static void buscarPorNome(String nome) {
        List<Carro> carroList = CarroDAO.searchByName(nome);

        if (carroList.isEmpty()) {
            System.out.println(" ----- Lista de Carros ----- ");
            System.out.println("Não existe carros cadastrados.");
            System.out.println("----------------------------------");
        } else {
            System.out.println(" ----- Lista de Carroes ----- ");
            for (int i = 0; i < carroList.size(); i++) {
                Carro c = carroList.get(i);
                System.out.println("[" + i + "] Nome: " + c.getNome() + " Placa: " + c.getPlaca() + " Comprador: " + c.getComprador().getNome());
            }
            System.out.println("----------------------------------");
        }
    }

    public static void deletar() {
        List<Carro> carroList = listar();

        if (carroList.isEmpty()) {
            System.out.println(" ----- Lista de Carros ----- ");
            System.out.println("Não existe carros cadastrados.");
            System.out.println("----------------------------------");
        } else {
            System.out.println("Selecione um dos carros abaixo para deletar: ");
            int index = Integer.parseInt(teclado.nextLine());
            System.out.println("Tem certeza que deseja deletar o registro S/N");
            String op = teclado.nextLine();
            if (op.equalsIgnoreCase("s")) {
                CarroDAO.delete(carroList.get(index));
            }
        }

    }
}
