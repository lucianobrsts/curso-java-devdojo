package br.com.devdojo.inputandoutput.io.test;

import java.io.*;

public class StreamsTest {
    public static void main(String[] args) {
       leitorTunado();
    }

    //Escreve em um arquivo
    private static void gravador() {
        byte[] dados = {65, 66, 67, 68, 69, 70};
        try (FileOutputStream gravador = new FileOutputStream("pasta/stream.txt")) {
            gravador.write(dados);
            System.out.println("Dados gravados com sucesso.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Escreve em um arquivo usando Buffer
    private static void gravadorTuando() {
        byte[] dados = {65, 66, 67, 68, 69, 70};
        try (BufferedOutputStream gravadorBuffer = new BufferedOutputStream(new FileOutputStream("pasta/stream.txt"), 400)) {
            gravadorBuffer.write(dados);
            gravadorBuffer.flush();
            System.out.println("Dados gravados com sucesso.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Lê um arquivo
    private static void leitor() {
        try (FileInputStream leitor = new FileInputStream("pasta/stream.txt")) {
            int leitura;
            while ((leitura = leitor.read()) != -1) {
                byte b = (byte) leitura;
                System.out.println(" " + b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Lê um arquivo usando Buffer
    private static void leitorTunado() {
        try (BufferedInputStream leitorBuffer = new BufferedInputStream(new FileInputStream("pasta/stream.txt"))) {
            int leitura;
            while ((leitura = leitorBuffer.read()) != -1) {
                byte b = (byte) leitura;
                System.out.println(" " + b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}