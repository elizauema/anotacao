package teste;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

class Gerenciador{
	
	public void listarAnotacoes() throws IOException, InterruptedException {
		
		Thread.sleep(3000);

		File file = new File("C:\\Users\\55119\\eclipse-workspace\\anotacao\\testes\\anotacoes.txt");
		//File file = new File("C:\\Users\\55119\\eclipse-workspace\\anotacao\\testes\\a.txt"); //nome errado que lança FileNotFoundException
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String linha = "";
		while((linha = br.readLine()) != null) {
			System.out.println(linha);
		}
		
		String[] arrayAnotacoes = {"anotacao 4", "anotacao 5", "anotacao 6"};
		for(int i=0; i < arrayAnotacoes.length; i++) {
			System.out.println(arrayAnotacoes[i]);
		}
		
		boolean condicaoHipotetica = true;
		if(condicaoHipotetica) {
			throw new RuntimeException("Erro em tempo de execução");
		}
		
		System.out.println(arrayAnotacoes[10]); //exceção não checada, abenda em tempo de execução
		
//		List<String> anotacoes = List.of("anotacao1", "anotacao2", "anotacao3");
//		for(String anotacao : anotacoes) {
//			System.out.println(anotacao);
//		}
	}
	
}

public class Exemplo2Exception {

	public static void main(String[] args) {
		
		try {
		
			Gerenciador gerenciador = new Gerenciador();
			gerenciador.listarAnotacoes();
		
		}catch(IOException e) {
			System.out.println("Problema ao ler o arquivo");
		}catch (InterruptedException e) {
			System.out.println("Erro no Thread.sleep");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Acessou posição indevida");
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}

}
