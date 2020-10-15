package teste;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ExemploCollections3 {

	public static void main(String[] args) {
		
		exemploLista();
		
		System.out.println("-------------------");
		
		exemploHashset();
		
		System.out.println("-------------------");
		
		HashSet<String> nomesSemDuplicidade = 
				removerDuplicidades(List.of("Bruno", "Bruno", "Eliza", "Eliza"));
		
		System.out.println(nomesSemDuplicidade);
	}
	
	public static void exemploLista() {
		List<String> l = new ArrayList<String>();

		l.add("India");
		l.add("Australia");
		l.add("South Africa");
		l.add("India"); // adicionando duplicado

		System.out.println(l);
	}

	private static void exemploHashset() {
		HashSet<String> h = new HashSet<String>();

		h.add("India");
		h.add("Australia");
		h.add("South Africa");
		h.add("India"); // adicionando duplicado

		System.out.println(h);
		System.out.println("contém India?: " + h.contains("India"));
		System.out.println("contém Afeganistão?: " + h.contains("Afeganistão"));

		h.remove("Australia");
		System.out.println("após remover Australia: " + h);
	}
	
	public static HashSet<String> removerDuplicidades(List<String> lista) {
		HashSet<String> hashSet = new HashSet<String>();
		/*
		 * for(String elemento : lista) { hashSet.add(elemento); }
		 */
		for(int i=0; i < lista.size(); i++) {
			hashSet.add(lista.get(i));
		}
		return hashSet;
	}

}
