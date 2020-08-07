package br.com.eliza.anotacoesapp.gerenciadores;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

import com.google.gson.Gson;

import br.com.eliza.anotacoesapp.model.Anotacao;

public class GerenciadorDeAnotacoesJson {
	
	private Gson gson = new Gson();
	
	public void salvarAnotacoesNoArquivo(List<Anotacao> anotacoes) throws IOException {
		Writer writer = new FileWriter("C:\\Users\\55119\\eclipse-workspace\\anotacao\\anotacoes\\anotacoes.json");
		gson.toJson(anotacoes, writer);
		writer.flush();
		writer.close();
	}

}
