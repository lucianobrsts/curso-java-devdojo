package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributeTest01 {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("pasta/teste.txt");
		if(Files.notExists(path)) Files.createFile(path);
		
		DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);
		System.out.println("is Hidden: " + dosFileAttributes.isHidden());
		System.out.println("is ReadOnly: " + dosFileAttributes.isReadOnly());
		
		System.out.println();
		DosFileAttributeView fileAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class);
		fileAttributeView.setHidden(true);
		fileAttributeView.setReadOnly(true);
		System.out.println("is Hidden: " + fileAttributeView.readAttributes().isHidden());
		System.out.println("is ReadOnly: " + fileAttributeView.readAttributes().isReadOnly());
	}

}
