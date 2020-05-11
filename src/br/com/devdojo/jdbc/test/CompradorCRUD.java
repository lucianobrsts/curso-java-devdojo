package br.com.devdojo.jdbc.test;

import br.com.devdojo.jdbc.classes.Comprador;
import br.com.devdojo.jdbc.db.CompradorDAO;

import java.util.List;
import java.util.Scanner;

public class CompradorCRUD {
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
        Comprador comprador = new Comprador();
        System.out.println("Digite o nome do comprador: ");
        comprador.setNome((teclado.nextLine()).toUpperCase());
        System.out.println("Digite o CPF do comprador: ");
        comprador.setCpf(teclado.nextLine());

        if (comprador != null) {
            CompradorDAO.save(comprador);
        }
    }

    private static void atualizar() {
        System.out.println("Selecione um dos compradores abaixo: ");
        List<Comprador> compradorList = listar();
        Comprador comprador = compradorList.get(Integer.parseInt(teclado.nextLine()));
        System.out.println("Digite um novo nome ou pressione ENTER para manter o mesmo...");
        String nome = teclado.nextLine();
        System.out.println("Digite um novo CPF ou pressione ENTER para manter o mesmo...");
        String cpf = teclado.nextLine();

        if (!nome.isEmpty()) {
            comprador.setNome(nome.toUpperCase());
        }

        if (!cpf.isEmpty()) {
            comprador.setCpf(cpf);
        }
        CompradorDAO.update(comprador);
    }

    public static List<Comprador> listar() {
        List<Comprador> compradorList = CompradorDAO.selectAll();
        System.out.println(" ----- Lista de Compradores ----- ");
        if (compradorList.isEmpty()) {
            System.out.println("Não existe compradores cadastrados.");
            System.out.println("----------------------------------");
        } else {
            for (int i = 0; i < compradorList.size(); i++) {
                Comprador c = compradorList.get(i);
                System.out.println("[" + i + "] Nome: " + c.getNome() + " CPF: " + c.getCpf());
            }
            System.out.println("----------------------------------");
        }
        return compradorList;
    }

    private static void buscarPorNome(String nome) {
        List<Comprador> compradorList = CompradorDAO.searchByName(nome);

        if(compradorList.isEmpty()) {
            System.out.println(" ----- Lista de Compradores ----- ");
            System.out.println("Não existe compradores cadastrados.");
            System.out.println("----------------------------------");
        } else {
            System.out.println(" ----- Lista de Compradores ----- ");
            for (int i = 0; i < compradorList.size(); i++) {
                Comprador c = compradorList.get(i);
                System.out.println("[" + i + "] Nome: " + c.getNome() + " CPF: " + c.getCpf());
            }
            System.out.println("----------------------------------");
        }
    }

    public static void deletar() {
        List<Comprador> compradorList = listar();

        if (compradorList.isEmpty()) {
            System.out.println(" ----- Lista de Compradores ----- ");
            System.out.println("Não existe compradores cadastrados.");
            System.out.println("----------------------------------");
        } else {
            System.out.println("Selecione um dos compradores abaixo para deletar: ");
            int index = Integer.parseInt(teclado.nextLine());
            System.out.println("Tem certeza que deseja deletar o registro S/N");
            String op = teclado.nextLine();
            if (op.equalsIgnoreCase("s")) {
                CompradorDAO.delete(compradorList.get(index));
            }
        }
    }
}
