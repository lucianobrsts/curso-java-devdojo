package academy.devdojo.maratonajava.javacore.Vio;

import java.io.File;
import java.io.IOException;

public class FileTest1 {
	public static void main(String[] args) {
		File file = new File("D:\\Estudo\\Repositorios\\curso-java-devdojo\\arquivo\\file.txt");
		try {
			boolean isCreated = file.createNewFile();
			System.out.println("Created " + isCreated);
			System.out.println("Path " + file.getPath());
			System.out.println("Absolute Path " + file.getAbsolutePath());
			System.out.println("is Directory " + file.isDirectory());
			System.out.println("is 	File " + file.isFile());
			System.out.println("is 	hidden " + file.isHidden());
			boolean exists = file.exists();
			if (exists) {
				System.out.println("Deleted " + file.delete());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
