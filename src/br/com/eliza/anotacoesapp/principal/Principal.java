
package br.com.eliza.anotacoesapp.principal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.eliza.anotacoesapp.gerenciadores.GerenciadorDeAnotacoesJson;
import br.com.eliza.anotacoesapp.menu.Menu;
import br.com.eliza.anotacoesapp.model.Anotacao;

public class Principal {
	public static void main(String[] args ) throws IOException {
//		Menu menu = new Menu();
//		menu.mostrarMenu();
		
		Anotacao anotacao = new Anotacao("tit1", "cor1");
		Anotacao anotacao2 = new Anotacao("tit2", "cor2");
		
		List<Anotacao> anotacoes = new ArrayList<>();
		anotacoes.add(anotacao);
		anotacoes.add(anotacao2);
		
		GerenciadorDeAnotacoesJson gerenciador = new GerenciadorDeAnotacoesJson();
		gerenciador.salvarAnotacoesNoArquivo(anotacoes);
	}
}
