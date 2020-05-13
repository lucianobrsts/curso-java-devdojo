package br.com.devdojo.concurrence.classes;

public class Entregador implements Runnable {
    private ListaMembros listaMembros;

    public Entregador(ListaMembros listaMembros) {
        this.listaMembros = listaMembros;
    }

    @Override
    public void run() {
        String nomeThread = Thread.currentThread().getName();
        System.out.println(nomeThread + " Começando o trabalho de entrega...");
        int qtdPendente = listaMembros.getEmailPendentes();
        boolean aberta = listaMembros.isAberta();
        while (aberta || qtdPendente > 0) {
            try {
                String email = listaMembros.obterEmailMenbro();
                if (email != null) {
                    System.out.println(nomeThread + " Enviando email para " + email);
                    Thread.sleep(2000);
                    System.out.println("Envio para " + email + " concluído com sucesso....");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            aberta = listaMembros.isAberta();
            qtdPendente = listaMembros.getEmailPendentes();
        }
        System.out.println("Atividades finalizadas...");
    }
}
