package teste;

public class GenericMethodTest {
	   // generic method printArray
	   public static < E > void printArray( E[] inputArray ) {
	      // Display array elements
	      for(E element : inputArray) {
	         System.out.printf("%s ", element);
	      }
	      System.out.println();
	   }

	   public static void main(String args[]) {
	      // Create arrays of Integer, Double and Character
	      Integer[] intArray = { 1, 2, 3, 4, 5 };
	      Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
	      Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

	      System.out.println("Array integerArray contains:");
	      printArray(intArray);   // pass an Integer array

	      System.out.println("\nArray doubleArray contains:");
	      printArray(doubleArray);   // pass a Double array

	      System.out.println("\nArray characterArray contains:");
	      printArray(charArray);   // pass a Character array
	   
	      TimeNBA lakers = new TimeNBA("Los Angeles Lakers", TipoConferencia.CONFERENCIA_OESTE);
	      TimeNBA  miamiHeat = new TimeNBA("Miami Heat", TipoConferencia.CONFERENCIA_LESTE);
	      TimeNBA[] nbaArray = {lakers , miamiHeat};
	      System.out.println("\n\nArray de Times");
	      printArray(nbaArray);
	  
	      //Fazer um array de outra coisa e chamar o método printArray para imprimir os elementos dele
	      
	   }
	   
}

enum TipoConferencia{
	CONFERENCIA_LESTE, CONFERENCIA_OESTE
}

class TimeNBA {
	private String nome;
	private TipoConferencia conferencia;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public TipoConferencia getConferencia() {
		return conferencia;
	}
	public void setConferencia(TipoConferencia conferencia) {
		this.conferencia = conferencia;
	}
	public TimeNBA(String nome, TipoConferencia conferencia) {
		super();
		this.nome = nome;
		this.conferencia = conferencia;
	}
	@Override
	public String toString() {
		return "TimeNBA [nome=" + nome + ", conferencia=" + conferencia + "]";
	}
	
}


