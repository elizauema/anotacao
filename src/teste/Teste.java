package teste;

import java.util.ArrayList;
import java.util.Arrays;

public class Teste {

	public static void main(String[] args) {
		
		//array
		
		System.out.println(Arrays.deepToString(args));
		
		String[] meuArray = new String[3];
		meuArray[0] = "Texto 1";
		meuArray[1] = "Texto 2";
		
		System.out.println(Arrays.toString(meuArray));
		System.out.println(meuArray[0]);
		System.out.println(meuArray[1]);
		
		int[] numeros = new int[10];
		numeros[0] = 10000;
		System.out.println(Arrays.toString(numeros));
		
		double[][] arrayDeDouble = new double[2][3];
		arrayDeDouble[0][0] = 10.5;
		arrayDeDouble[0][1] = 100.5;
		arrayDeDouble[0][2] = 1000.5;
		arrayDeDouble[1][0] = 10000.5;
		arrayDeDouble[1][1] = 100000.5;
		arrayDeDouble[1][2] = 1000000.5;
		System.out.println(Arrays.deepToString(arrayDeDouble));
		
		//lista
		
		//List<Double> minhaLista = new ArrayList<Double>();
		//ArrayList<Double> minhaLista = new ArrayList<>();
		ArrayList<Double> minhaLista = new ArrayList<Double>();
		minhaLista.add(10.0);
		minhaLista.add(100.0);
		minhaLista.add(1000.0);
		minhaLista.remove(10.0);
		System.out.println(minhaLista);
		
	}

}
