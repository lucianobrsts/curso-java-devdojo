package br.com.devdojo.inputandoutput.io.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {

    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
        try {
            System.out.println(file.createNewFile());
           boolean exists =  file.exists();
            System.out.println("Permissão de Leitura: " + file.canRead());
            System.out.println("Path: " + file.getPath());
            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("Diretorio? : " + file.isDirectory());
            System.out.println("hidden? : " + file.isHidden());
            System.out.println("ultima modificação : " + new Date(file.lastModified()));
            if(exists) {
                System.out.println("Deletado: " + file.delete());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
