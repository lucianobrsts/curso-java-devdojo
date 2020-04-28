package br.com.devdojo.inputandoutput.io.test.newio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CriandoPathTest {

    public static void main(String[] args) {
        //D:\DevJava\eclipse-workspace\curso-java-devdojo
        Path p1 = Paths.get("D:\\DevJava\\eclipse-workspace\\curso-java-devdojo\\Arquivo.txt");
        Path p2 = Paths.get("D:\\DevJava\\eclipse-workspace\\curso-java-devdojo","Arquivo.txt");
        Path p3 = Paths.get("D:","DevJava\\eclipse-workspace\\curso-java-devdojo","Arquivo.txt");
        Path p4 = Paths.get("D:","DevJava", "eclipse-workspace", "curso-java-devdojo","Arquivo.txt");
    }
}
