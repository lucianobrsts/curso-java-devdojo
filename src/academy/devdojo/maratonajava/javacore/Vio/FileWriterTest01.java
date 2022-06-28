package academy.devdojo.maratonajava.javacore.Vio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
	// File - trabalha com arquivos
	// FileWriter - Escreve arquivos
	// FileReader - Ler arquivos
	// BufferWriter - Trabalha com performance em mem�ria escrevendo arquivos
	// BufferReader - Trabalha com performance em mem�ria lendo arquivos
	public static void main(String[] args) {
		File file = new File("D:\\Estudo\\Repositorios\\curso-java-devdojo\\arquivo\\file.txt");
		try (FileWriter fw = new FileWriter(file, true)){
			file.createNewFile();
			fw.write("O DevDojo � lindo, � o melhor curso do Brasil...\n continuando a cantoria na pr�xima linha.\n");
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
