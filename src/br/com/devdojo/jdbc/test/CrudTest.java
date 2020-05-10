package br.com.devdojo.jdbc.test;

import java.util.Scanner;

public class CrudTest {

    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int op;
        while (true) {
            menu();
            op = Integer.parseInt(teclado.nextLine());
            if (op == 0) {
                System.out.println("Saindo do Sistema.");
                break;
            }

            if (op == 1) {
                menuComprador();
                op = Integer.parseInt(teclado.nextLine());
                CompradorCRUD.executar(op);
            }

            if (op == 2) {
                menuCarro();
                op = Integer.parseInt(teclado.nextLine());
                CarroCRUD.executar(op);
            }
        }
    }

    private static void menu() {
        System.out.println("Selecione uma opção para o menu: ");
        System.out.println("1. Para Comprador. ");
        System.out.println("2. Para Carro.");
        System.out.println("0. Sair");
    }

    private static void menuComprador() {
        System.out.println("Digite a opção para começar: ");
        System.out.println("1. Inserir Comprador.");
        System.out.println("2. Atualizar Comprador.");
        System.out.println("3. Listar todos os Compradores.");
        System.out.println("4. Buscar Comprador por nome.");
        System.out.println("5. Deletar um Comprador");
        System.out.println("9. Voltar");
    }

    private static void menuCarro() {
        System.out.println("Digite a opção para começar: ");
        System.out.println("1. Inserir Carro.");
        System.out.println("2. Atualizar Carro.");
        System.out.println("3. Listar todos os Carros.");
        System.out.println("4. Buscar Carro por nome.");
        System.out.println("5. Deletar um Carro");
        System.out.println("9. Voltar");
    }

}
