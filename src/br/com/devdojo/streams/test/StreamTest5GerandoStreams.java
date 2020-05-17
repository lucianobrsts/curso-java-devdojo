package br.com.devdojo.streams.test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest5GerandoStreams {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 50)
                .filter(n -> 2 % 2 == 0)
                .forEach(s -> System.out.print(s + " "));

        System.out.println();
        IntStream.range(1, 50)
                .filter(n -> 2 % 2 == 0)
                .forEach(s -> System.out.print(s + " "));

        System.out.println();
        Stream<String> stringStream = Stream.of("Luciano", "DevDojo", "Acessem o facebook pelo amor de Deus e Curtam...");
        stringStream.map(String::toUpperCase)
                .forEach(s -> System.out.print(s + " "));

        System.out.println();
        int nums[] = {1, 2, 3, 4, 5};
        OptionalDouble average = Arrays.stream(nums).average();
        System.out.println(average.getAsDouble());

        System.out.println();
        try(Stream<String> lines = Files.lines(Paths.get("Teste.txt"), Charset.defaultCharset())) {
            lines.flatMap(line -> Arrays.stream(line.split("\n")))
                    .filter(p -> p.contains("File"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Iteração infinita quando não se usa o limit().
        Stream.iterate(1, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);

        //Sequência de Fibonacci
        // 0,1,1,3,5,8,13,21,34...
        Stream.iterate(new int[] {0,1}, a -> new int[]{a[1], a[0] + a[1]})
                .limit(20)
                .map(t -> t[0])
                .forEach(System.out::println);
    }
}
