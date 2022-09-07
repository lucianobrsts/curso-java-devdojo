package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

public class StreamTest11 {
	
	private static List<LightNovel> lightNovels = new ArrayList<>(
			List.of(new LightNovel("Tensei Shittara", 8.99), 
					new LightNovel("Overlord", 3.99),
					new LightNovel("Violet Evegarden", 5.99), 
					new LightNovel("No Game no life", 2.99),
					new LightNovel("Fullmetal Alchemist", 5.99), 
					new LightNovel("Kumo desuga", 1.99),
					new LightNovel("Kumo desuga", 1.99), 
					new LightNovel("Monogatari", 4.00)));
	
	public static void main(String[] args) {
		
		System.out.println(lightNovels.size());
		System.out.println(lightNovels.stream().count());
		System.out.println(lightNovels.stream().collect(Collectors.counting()));
		
		lightNovels.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
		lightNovels.stream().min(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
		
		lightNovels.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println);
		
		System.out.println(lightNovels.stream().mapToDouble(LightNovel::getPrice).sum());
		System.out.println(lightNovels.stream().collect(Collectors.averagingDouble(LightNovel::getPrice)));
		
		System.out.println(lightNovels.stream().mapToDouble(LightNovel::getPrice).average());
		System.out.println(lightNovels.stream().collect(Collectors.averagingDouble(LightNovel::getPrice)));
	}

}
