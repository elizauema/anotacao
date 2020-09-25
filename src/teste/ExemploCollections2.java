package teste;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Stack;

public class ExemploCollections2 {
	
	public static void main(String[] args) {
		
		exemploDeFila();
		
		exemploDePilha();
		
		verificaSeEhPalindromo("ovo");
	}

	private static void exemploDeFila() {
		try {
		
			Queue<String> queue = new LinkedList<>();
			
			queue.add("Mateus");
			queue.add("Marcos");
			queue.add("Lucas");
			queue.add("João");
			
			String mateus = queue.remove();
			System.out.println(mateus);
			
			String marcos = queue.remove();
			System.out.println(marcos);
			
			String lucas = queue.remove();
			System.out.println(lucas);
			
			String joao = queue.remove();
			System.out.println(joao);
			
			String nulo = queue.poll();
			System.out.println("Nulo porque a fila já está vazia: " + nulo);
			
			queue.remove(); //Lança NoSuchElementException
			
		}catch(NoSuchElementException e) {
			System.out.println("Fila vazia");
		}
	}
	
	private static void exemploDePilha() {
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		System.out.println(stack);
		
		Integer num1 = stack.pop();
		System.out.println(num1);
		
		System.out.println(stack);
		
		Integer num2 = stack.pop();
		System.out.println(num2);
		
		System.out.println(stack);
		
		Integer num3 = stack.pop();
		System.out.println(num3);
		
		System.out.println(stack);
		
		Integer num4 = stack.pop();
		System.out.println(num4);
		
		System.out.println(stack);
		
		Integer num5 = stack.pop();
		System.out.println(num5);
		
		System.out.println(stack);
	}

	private static void verificaSeEhPalindromo(String palavra) {
		
		Stack<Character> pilha = new Stack<>();
		
		System.out.println("Empilhando...");
		for(int i=0; i < palavra.length();i++) {
			char letra = palavra.charAt(i);
			System.out.println(letra);
			pilha.push(letra);
		}
		
		String palavraAoContrario = "";
		System.out.println("Desempilhando...");
		for(int i=0; i < palavra.length();i++) {
			char letra = pilha.pop();
			System.out.println(letra);
			palavraAoContrario = palavraAoContrario + letra;
		}
		
		System.out.println(palavraAoContrario);
		
		if(palavra.equals(palavraAoContrario)) {
			System.out.println("É palíndromo");
		}else {
			System.out.println("Não é palíndromo");
		}
	}
}
