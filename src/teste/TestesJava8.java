package teste;

import java.util.List;
import java.util.stream.Collectors;

public class TestesJava8 {

	public static void main(String[] args) {
		
		List<String> listaNomes = List.of("Bruno", "Pedro", "João", "Beatriz", "Bianca");
		
		System.out.println(listaNomes);
		
		List<String> listaNomesFiltrada = listaNomes.stream()
			.filter(nome -> nome.startsWith("B"))
			.collect(Collectors.toList());
		
		System.out.println(listaNomesFiltrada);
		
		System.out.println(listaNomes.stream().filter(nome -> nome.startsWith("B")).count());

	}

}
