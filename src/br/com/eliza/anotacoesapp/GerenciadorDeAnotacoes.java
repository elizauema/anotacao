package br.com.eliza.anotacoesapp;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class GerenciadorDeAnotacoes {

	List<Anotacao> anotacoes = new ArrayList<>();

	public void criarAnotacao(Anotacao anotacao) {
		anotacoes.add(anotacao);
	}

	public void listarAnotacoes() {
		for (Anotacao anotacao : anotacoes) {
			System.out.println(anotacao);
		}
	}

	public void removerAnotacao(String tituloAnotacao) {
		   ListIterator<Anotacao> 
           iterator = anotacoes.listIterator(); 
		   
		   while (iterator.hasNext() ) { 
			   Anotacao anotacao = iterator.next();
			   if  (anotacao.getTitulo().equals(tituloAnotacao) ) {
				   iterator.remove();
			   };
		   }
       	//iterar(fazer um while) por todos elementos da lista anotacoes, mas usando um ListIterator.
		//vai usar um if para comparar o titulo recebido como argumento com os títulos das anotacoes da lista
		//quando achar o titulo certo, vai remover a anotacao usando o método remove() do ListIterator.
		
		//https://www.geeksforgeeks.org/arraylist-listiterator-method-in-java-with-examples/
	}

	public void mostrarAnotacaoPeloTitulo(String tituloAnotacao) {
		for (int i=0;i< anotacoes.size();i++) {
			if (anotacoes.get(i).getTitulo().equals(tituloAnotacao) ) {
				System.out.println(anotacoes.get(i));
			}
		}
	}
	// iterar(fazer um for, não precisa de Iterator) por todos elementos da lista
	// colocar um if dentro do for e se achar o título certo imprimir a anotação
	// usando syso
	
	//03/07/2020 - licao de casa:
	//colocar uma mensagem caso nao encontre o titulo informado. Exemplo: Anotacao inexistente.
}


