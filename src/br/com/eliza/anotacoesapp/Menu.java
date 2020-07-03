package br.com.eliza.anotacoesapp;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		byte opcaoDigitada = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		GerenciadorDeAnotacoes gerenciador = new GerenciadorDeAnotacoes();
		
		while(opcaoDigitada != 6) {
			
			System.out.println("\nSelecione uma opção:");
			System.out.println("1 - Criar anotacao");
			System.out.println("2 - Remover anotacao");
			System.out.println("3 - Editar anotação");
			System.out.println("4 - Listar anotacoes");
			System.out.println("5 - Mostrar anotação pelo título");
			System.out.println("6 - Sair");
			
			opcaoDigitada = scanner.nextByte();
			
			limparTela();
			
			switch(opcaoDigitada) {
			case 1:
				scanner.nextLine();
				System.out.println("Digite o titulo da anotacao");
				String titulo = scanner.nextLine();
				System.out.println("Digite o corpo da anotacao");
				String corpo = scanner.nextLine();
				Anotacao anotacao = new Anotacao(titulo, corpo);
				gerenciador.criarAnotacao(anotacao);
				System.out.println("Anotacao criada");
				break;
			case 2:
				System.out.println("Foi digitada a opcao 2");
				scanner.nextLine();
				System.out.println("Digite o titulo da anotacao");
				String titulo2 = scanner.nextLine();
				gerenciador.removerAnotacao(titulo2);
				break;
			case 3:
				System.out.println("Foi digitada a opcao 3");
				break;
			case 4:
				System.out.println("Lista de anotacoes:");
				gerenciador.listarAnotacoes();
				break;
			case 5:
				System.out.println("Foi digitada a opcao 5");
				break;
			case 6:
				System.out.println("Foi digitada a opcao 6");
				break;
			default:
				System.out.println("Opcao invalida");
			}
			
		}
		
		scanner.close();

	}
	
	private static void limparTela() {
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
	}

}
