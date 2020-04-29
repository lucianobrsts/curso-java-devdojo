package br.com.devdojo.inputandoutput.nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class  ResolvendoPaths {

    public static void main(String[] args) {
        Path dir = Paths.get("home\\luciano");
        Path arquivo = Paths.get("dev\\arquivo.txt");
        Path result = dir.resolve(arquivo);
        System.out.println(result);

        Path absoluto = Paths.get("/home/luciano");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("file.txt");

        System.out.println("1: " + absoluto.resolve(relativo));
        System.out.println("2: " + absoluto.resolve(file));
        System.out.println("3: " + absoluto.resolve(file));
        System.out.println("4: " + absoluto.resolve(absoluto));
        System.out.println("5: " + absoluto.resolve(absoluto));
        System.out.println("6: " + absoluto.resolve(relativo));
    }
}
