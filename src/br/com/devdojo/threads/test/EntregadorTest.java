package br.com.devdojo.threads.test;

import br.com.devdojo.threads.classes.Entregador;
import br.com.devdojo.threads.classes.ListaMembros;

import javax.swing.*;

public class EntregadorTest {
    public static void main(String[] args) {
        ListaMembros listaMembros = new ListaMembros();
        Thread t1 = new Thread(new Entregador(listaMembros), "Entregador 1");
        Thread t2 = new Thread(new Entregador(listaMembros), "Entregador 2");
        t1.start();
        t2.start();

        while (true) {
            String email = JOptionPane.showInputDialog("Digite o email do membro");
            if(email == null || email.isEmpty()) {
                listaMembros.fecharlista();
                break;
            }
            listaMembros.adicionarEmailMembro(email);
        }
    }
}
