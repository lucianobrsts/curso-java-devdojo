package br.com.devdojo.inputandoutput.io.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderTest {

    public static void main(String[] args) {
        File file = new File("Arquivo.txt");

        try (FileWriter fw = new FileWriter(file, true);
             FileReader fr = new FileReader(file)){

            fw.write("Escrevendo uma mensagem no arquivo\nE pulando uma linha 2.");
            fw.flush();
            System.out.println(" ####### Escrita de Arquivo finalizada #######");

            char[] in = new char[500];
            int size = fr.read(in);
            System.out.println("Tamanho: " + size);
            System.out.println(" ####### Lendo conteúdo do arquivo #######");
            for (char g : in) {
                System.out.print(g);
            }
            System.out.println(" \n##################################");
        } catch (IOException e) {
            e.printStackTrace();
        }

//        try {
//            FileWriter fw = new FileWriter(file, true);
//            fw.write("Escrevendo uma mensagem no arquivo\nE pulando uma linha 2.");
//            fw.flush();
//            fw.close();
//            System.out.println(" ####### Escrita de Arquivo finalizada #######");
//
//            FileReader fr = new FileReader(file);
//            char[] in = new char[500];
//            int size = fr.read(in);
//            System.out.println("Tamanho: " + size);
//            System.out.println(" ####### Lendo conteúdo do arquivo #######");
//            for (char g : in) {
//                System.out.print(g);
//            }
//            fr.close();
//            System.out.println(" \n##################################");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}
