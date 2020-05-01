package br.com.devdojo.serializacao.test;

import br.com.devdojo.serializacao.classes.Aluno;
import br.com.devdojo.serializacao.classes.Turma;

import java.io.*;

public class SerializacaoTest {
    public static void main(String[] args) {
        gravadorObject();
        leitorObject();
    }

    //Escreve em um arquivo serializado.
    private static void gravadorObject() {
        Turma turma = new Turma("Maratona Java, Só para os campeões.");
        Aluno aluno = new Aluno(1L, "Luciano Brito", "123456");
        aluno.setTurma(turma);

        try (ObjectOutputStream oas = new ObjectOutputStream(new FileOutputStream("Aluno.ser"));) {
            oas.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Lê em um arquivo serializado.
    private static void leitorObject() {
        try (ObjectInputStream oas = new ObjectInputStream(new FileInputStream("Aluno.ser"));) {
            Aluno aluno = (Aluno) oas.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
