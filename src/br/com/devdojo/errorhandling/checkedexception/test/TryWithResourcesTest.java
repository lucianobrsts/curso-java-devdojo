package br.com.devdojo.errorhandling.checkedexception.test;

import br.com.devdojo.errorhandling.checkedexception.classes.Leitor1;
import br.com.devdojo.errorhandling.checkedexception.classes.Leitor2;

import java.io.*;

public class TryWithResourcesTest {

    public static void main(String[] args) {
        lerArquivo();

    }

    public static void lerArquivo() {
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void lerArquivoOld() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("text.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
