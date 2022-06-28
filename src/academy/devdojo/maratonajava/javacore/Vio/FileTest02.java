package academy.devdojo.maratonajava.javacore.Vio;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
	public static void main(String[] args) {
		File fileDiretorio = new File("arquivo");
		boolean isDiretorioCriado = fileDiretorio.mkdir();
		if(isDiretorioCriado) {
			System.out.println("Diret�rio criado com sucesso...");
		} else {
			System.out.println("Diret�rio j� existe...");
		}
		File fileArquivoDiretorio = new File(fileDiretorio, "arquivo.txt");
		
		try {
			boolean isFileCreated = fileArquivoDiretorio.createNewFile();
			System.out.println(isFileCreated);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File fileRenamed = new File(fileDiretorio, "arquivo_renomeado.txt");
		boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
		System.out.println(isRenamed);
		
		File diretorioRenemad = new File("pasta2");
		boolean isDiretorioRenomeado = fileDiretorio.renameTo(diretorioRenemad);
		System.out.println(isDiretorioRenomeado);
	}
}
