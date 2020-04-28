package br.com.devdojo.inputandoutput.io.test;

import java.io.File;

public class FileDiretorioTest {

    public static void main(String[] args) {
//        File diretorio = new File("folder");
//
//        boolean mkdir = diretorio.mkdir();
//        System.out.println("Diretório criado? : " + mkdir);
//        File arquivo = new File(diretorio, "Arquivo.txt");
//
//        try {
//            boolean newFile = arquivo.createNewFile();
//            System.out.println("Arquivo Criado? : " + newFile);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        File arquivoNovoNome = new File(diretorio, "ArquivoRenomeado.txt");
//        boolean renamed = arquivo.renameTo(arquivoNovoNome);
//        System.out.println("Renomeado com sucesso: " + renamed);
//
//        File diretorioRenomeado = new File("folder2");
//        boolean diretorioRenamed = diretorio.renameTo(diretorioRenomeado);
//        System.out.println("Diretorio Renomado: " + diretorioRenamed);

        buscarArquivos();
    }

    public static void buscarArquivos() {
        File file = new File("folder2");
        String[] list = file.list();
        for(String arquivo : list) {
            System.out.println(arquivo);
        }
    }
}
