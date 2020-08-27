package br.com.eliza.anotacoesapp.gerenciadores;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import br.com.eliza.anotacoesapp.model.Anotacao;

public class GerenciadorDeAnotacoesJson {
	
	private Gson gson = new Gson();
	private String caminhoArquivoJson;
	
	public GerenciadorDeAnotacoesJson(String caminhoArquivoJson) {
		this.caminhoArquivoJson = caminhoArquivoJson;
	}

	public void criarAnotacao(Anotacao anotacao) throws IOException {		
		List<Anotacao> anotacoes = getTodasAnotacoes();
		
		if(verificarSeAnotacaoExiste(anotacao.getTitulo(), anotacoes)) {			
			System.out.println("Anotacao invalida. Esse titulo [" + anotacao.getTitulo() + "] ja existe.");
		}else {
			anotacoes.add(anotacao);
			salvarAnotacoesNoArquivo(anotacoes);
			System.out.println("Anotacao [" + anotacao.getTitulo() + "] foi adicionada!");
		}
		
	}
	
	public void editarAnotacao(String titulo, String  newcorpo) throws IOException {
		List<Anotacao> anotacoes =  getTodasAnotacoes();
		
		if (verificarSeAnotacaoExiste(titulo, anotacoes)) {
			for(Anotacao anotacao : anotacoes) {
				if (titulo.equals(anotacao.getTitulo())) {
					anotacao.setCorpo(newcorpo);
		           
				}
			
			}
			salvarAnotacoesNoArquivo(anotacoes);
			
		}
		else { 
			System.out.println("Titulo " + titulo + " inexistente");
			
		}
		
	}
	
	public List<Anotacao> getTodasAnotacoes() throws FileNotFoundException {
		if (verificaSeArquivoJsonExiste()) {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(caminhoArquivoJson));
			Type type = new TypeToken<ArrayList<Anotacao>>() {}.getType();
			ArrayList<Anotacao> lista = gson.fromJson(bufferedReader, type);
			return lista;
		} else {
			return new ArrayList<Anotacao>();
		}
	}
	
	public boolean verificaSeArquivoJsonExiste() {
		return Files.exists(Paths.get(caminhoArquivoJson));
	}
	
	private boolean verificarSeAnotacaoExiste(String titulo, List<Anotacao> anotacoes) {
		//JAVA 8
//		long totalDeAnotacoes = anotacoes.stream()
//			.filter(anotacao -> anotacao.getTitulo().equals(titulo))
//			.count();
//		
//		if(totalDeAnotacoes == 0)
//			return false;
//		
//		return true;
		
		//JAVA 7 OU ANTERIOR
		boolean anotacaoExiste = false;
		for(Anotacao anotacao : anotacoes) {
			if(anotacao.getTitulo().equals(titulo)) {
				anotacaoExiste = true;
			}
		}
		
		return anotacaoExiste;
		
	}
	
	public void salvarAnotacoesNoArquivo(List<Anotacao> anotacoes) throws IOException {
		System.out.println("Salvando...");
		Writer writer = new FileWriter(caminhoArquivoJson);
		gson.toJson(anotacoes, writer);
		writer.flush();
		writer.close();
	}
	
	public void listarAnotacoes() throws FileNotFoundException  {
		List<Anotacao> anotacoes = getTodasAnotacoes();
		for (Anotacao anotacao : anotacoes) {
			System.out.println("Anotacao [" + anotacao + "]");
			
		}
	}

}
