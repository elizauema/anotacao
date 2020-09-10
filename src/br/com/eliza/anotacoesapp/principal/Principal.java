
package br.com.eliza.anotacoesapp.principal;

import java.io.FileNotFoundException;
import java.io.IOException;

import br.com.eliza.anotacoesapp.menu.Menu;

public class Principal {
	public static void main(String[] args) {

		try {
			String caminhoArquivoJson = "C:\\Users\\eliza\\eclipse-workspace\\anotacao\\anotacoes\\anotacoes.json";

			Menu menu = new Menu(caminhoArquivoJson);
			menu.mostrarMenu();

		} catch (FileNotFoundException e) {
			System.out.println("Arquivo inexistente");
		} catch (IOException e) {
			System.out.println("Problema no arquivo");
		} catch (Exception e) {
			System.out.println("Ocorreu erro");
		}

	}
}
