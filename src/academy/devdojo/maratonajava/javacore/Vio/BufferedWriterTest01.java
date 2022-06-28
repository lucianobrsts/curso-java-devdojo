package academy.devdojo.maratonajava.javacore.Vio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
	public static void main(String[] args) {
		File file = new File("D:\\Estudo\\Repositorios\\curso-java-devdojo\\arquivo\\file.txt");
		try (FileWriter fw = new FileWriter(file, true); BufferedWriter bw = new BufferedWriter(fw)) {
			file.createNewFile();
			bw.write("O DevDojo é lindo, é o melhor curso do Brasil...");
			bw.newLine();
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
