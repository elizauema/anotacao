package teste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class SuperHeroe{
	
	String nome;

	public SuperHeroe(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "[nome=" + nome + "]";
	}
	
}

public class ExemploGenerics {

	public static void main(String[] args) {
		String[] meuArray = new String[5];
		meuArray[0] = "Hulk";
		meuArray[1] = "Capitão América";
		meuArray[2] = "Homem de Ferro";
		meuArray[3] = "Superman";
		meuArray[4] = "Batman";
		
		List<String> minhaLista = new ArrayList<String>();
		
		System.out.println(minhaLista);
		
		fromArrayToCollection(meuArray, minhaLista);
		
		System.out.println(minhaLista);
		
		//----------------------------------------------
		
		Integer[] arrayDeInteiros = new Integer[3];
		arrayDeInteiros[0] = 10;
		arrayDeInteiros[1] = 20;
		arrayDeInteiros[2] = 30;
		
		List<Integer> minhaListaDeInteiros = new ArrayList<Integer>();
		
		System.out.println(minhaListaDeInteiros);
		
		fromArrayToCollection(arrayDeInteiros, minhaListaDeInteiros);
		
		System.out.println(minhaListaDeInteiros);
		
		//----------------------------------------------
		
		SuperHeroe[] arraySuperHeroe = new SuperHeroe[3];
		arraySuperHeroe[0] = new SuperHeroe("Mulher Maravilha");
		arraySuperHeroe[1] = new SuperHeroe("Aquaman");
		arraySuperHeroe[2] = new SuperHeroe("Homem Aranha");
		
		List<SuperHeroe> listaSuperHeroe = new ArrayList<SuperHeroe>();
		
		System.out.println(listaSuperHeroe);
		
		fromArrayToCollection(arraySuperHeroe, listaSuperHeroe);
		
		System.out.println(listaSuperHeroe);
	}
	
	/*private static void fromArrayToCollection(String[] array, List<String> lista) {
	    for (String elemento : array) {
	        lista.add(elemento);
	    }
	}
	
	private static void fromArrayToCollection(Integer[] array, List<Integer> lista) {
	    for (Integer elemento : array) {
	        lista.add(elemento);
	    }
	}*/
	
	private static <T> void fromArrayToCollection(T[] array, Collection<T> colecao) {
	    for (T elemento : array) { 
	        colecao.add(elemento);
	    }
	}

}
