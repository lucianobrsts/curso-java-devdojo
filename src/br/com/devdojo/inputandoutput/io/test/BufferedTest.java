package br.com.devdojo.inputandoutput.io.test;

import java.io.*;

public class BufferedTest {

    public static void main(String[] args) {
        File file = new File("Arquivo.txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file));
             BufferedReader br = new BufferedReader(new FileReader(file))) {

            bw.write("Escrevendo uma mensagem no arquivo");
            bw.newLine();
            bw.write("E pulando uma linha 2.");
            bw.flush();
            System.out.println(" ####### Escrita de Arquivo finalizada #######");

            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
            System.out.println(" ##################################");
        } catch (IOException e) {
            e.printStackTrace();
        }

//        try {
//            FileWriter fw = new FileWriter(file);
//            BufferedWriter bw = new BufferedWriter(fw);
//
//            bw.write("Escrevendo uma mensagem no arquivo");
//            bw.newLine();
//            bw.write("E pulando uma linha 2.");
//            bw.flush();
//            bw.close();
//            System.out.println(" ####### Escrita de Arquivo finalizada #######");
//
//            FileReader fr = new FileReader(file);
//            BufferedReader br = new BufferedReader(fr);
//            String s = null;
//            while ((s = br.readLine()) != null) {
//                System.out.println(s);
//            }
//            br.close();
//            System.out.println(" ##################################");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
