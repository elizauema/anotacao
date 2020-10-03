package teste;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

interface Voador{
	public void voar();
	
	public String getPrincipalAlimento();
}

class BeijaFlor implements Voador{
	
	private String principalAlimento = "nectar da flor";

	@Override
	public void voar() {
		System.out.println("voa rápido");
		
	}
	
	public String getPrincipalAlimento() {
		return principalAlimento;
	}
	
}

class Morcego implements Voador{
	
	private String principalAlimento = "frutas";

	@Override
	public void voar() {
		System.out.println("voa e chupa sangue");
		
	}

	public String getPrincipalAlimento() {
		return principalAlimento;
	}
	
}

public class ExemplosCollections {

	public static void main(String[] args) {
		
		exemploLista();
		
		System.out.println();
		
		exemploMap();
		
		System.out.println();
		
		exemploMap2();
		
		//1-fazer uma lista de compras, pode ser lista de String. Faz um for e mostra todos elementos da lista.
		//2-fazer um HashMap de String, String. Na chave vai ter o nome do aluno, e no valor vai ter uma descrição do aluno. Faz um for e imprime todas as chaves e todos os valores.
	}
	
	private static void exemploLista() {
		//Voador beijaFlor = new BeijaFlor();
		//Voador morcego = new Morcego();
		
		//ArrayList<String> listaTimes = new ArrayList<String>();
		//List<String> lista = new LinkedList<String>();
		
		List<String> listaTimes = new ArrayList<String>();
		
		listaTimes.add("Corinthians");
		listaTimes.add("Palmeiras");
		listaTimes.add("Santos");
		listaTimes.add("São Paulo");
		
		for(String time : listaTimes) {
			System.out.println(time);
		}
	}
	
	private static void exemploMap() {
		Map<String, String> dicionario = new HashMap<String, String>();
		dicionario.put("inconstitucional", "que está em desacordo com a constituição ('conjunto de leis') de um país; que fere a constituição.");
		dicionario.put("paralelismo", "característica ou condição do que é paralelo.");
		dicionario.put("patriota", "que ou aquele que ama a pátria e a ela presta serviços.");
		
		for(Entry<String, String> entrada : dicionario.entrySet()) {
			System.out.println("Chave: " + entrada.getKey());
			System.out.println("Valor: " + entrada.getValue());
		}
		
		String significadoDePatriota = dicionario.get("patriota");
		System.out.println(significadoDePatriota);
	}
	
	private static void exemploMap2() {
		Map<String, Voador> mapaDeVoadores = new HashMap<>();
		
		mapaDeVoadores.put("morcego", new Morcego());
		mapaDeVoadores.put("beija-flor", new BeijaFlor());
		
		for(Entry<String, Voador> entrada : mapaDeVoadores.entrySet()) {
			Voador voador = entrada.getValue();
			voador.voar();
			System.out.println(voador.getPrincipalAlimento());
		}
		
		Voador morcego = mapaDeVoadores.get("morcego");
		System.out.println("chamando o voar do morcego novamente...");
		morcego.voar();
	}

}
