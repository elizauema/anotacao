
package br.com.eliza.anotacoesapp.principal;

import java.io.IOException;

import br.com.eliza.anotacoesapp.menu.Menu;

public class Principal {
	public static void main(String[] args ) throws IOException {
		
		String caminhoArquivoJson = "C:\\Users\\55119\\eclipse-workspace\\anotacao\\anotacoes\\anotacoes.json";

		Menu menu = new Menu(caminhoArquivoJson);
		menu.mostrarMenu();
		
	}
}
