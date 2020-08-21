package teste;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExemploExeption {

	public static void main(String[] args){
		
		new ExemploExeption().lerArquivo();
		
	}
	
	public void lerArquivo(){
		
		try {
		
			File file = new File("C:\\Users\\55119\\eclipse-workspace\\anotacao\\testes\\texto.txt");
			
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			
			String linha = "";
			while((linha = br.readLine()) != null) {
				System.out.println(linha);
			}
		
		}catch(Exception e) {
			System.out.println("imagine um tratamento aqui");			
		}
	}
	
}
