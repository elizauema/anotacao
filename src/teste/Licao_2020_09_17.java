package teste;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class Licao_2020_09_17 {
	public static void main(String[] args) {
		fazerCompra();
		todosAlunos();
	}
	
	private static void fazerCompra() {
		
		List<String> listaCompra = new ArrayList<String>();
		listaCompra.add("arroz");
		listaCompra.add("azeite");
		listaCompra.add("vinagre");
		listaCompra.add("leite");
		
		for (String item : listaCompra) {
			System.out.println(item);
		}
		
	}
	
	private static void todosAlunos() {
		Map<String, String> alunos = new HashMap<String, String>();
		alunos.put("Maria", "sorridente");
		alunos.put("Pedro", "falante");
		alunos.put("Mario", "brincalhao");
		alunos.put("Joao", "calmo");
		alunos.put("Aparecida", "impaciente");
		
		for (Entry<String, String> aluno : alunos.entrySet()) {
			System.out.println("Chave:" + aluno.getKey());
			System.out.println("Valor:" + aluno.getValue());
		}
	}
}
