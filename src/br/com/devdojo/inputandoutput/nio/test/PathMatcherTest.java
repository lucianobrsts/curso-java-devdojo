package br.com.devdojo.inputandoutput.nio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class FindAllTest extends SimpleFileVisitor<Path> {
    private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*{Test*}.{java,class}");
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if(matcher.matches(file)) {
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}

public class PathMatcherTest {
    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("pasta/subpasta/subsubpasta/file.bkp");
        Path path2 = Paths.get("file.bkp");
        Path path3 = Paths.get("luciano");
        PathMatcher matecher = FileSystems.getDefault().getPathMatcher("glob: *.bkp");
        System.out.println(matecher.matches(path1));
        System.out.println(matecher.matches(path2));
        System.out.println("__________________________________");
        matches(path1, "glob:*.bkp");
        matches(path1, "glob:**/*.bkp");
        matches(path1, "glob:*");
        matches(path1, "glob:**");
        System.out.println("__________________________________");
        matches(path1, "glob:*.???");
        matches(path1, "glob:**/*.???");
        matches(path1, "glob:**.???");
        System.out.println("__________________________________");
        matches(path3, "glob:{luciano*,brito*}");
        matches(path3, "glob:{luciano,brito}*");
        matches(path3, "glob:{luciano,brito}");
        Files.walkFileTree(Paths.get("./"), new FindAllTest());
    }

    private static void matches(Path path, String glob) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + matcher.matches(path) );
    }
}
