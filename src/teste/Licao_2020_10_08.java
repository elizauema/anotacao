package teste;

public class Licao_2020_10_08 {

			   // generic method printArray
		   public static < E > void printArray( E[] inputArray ) {
		      // Display array elements
		      for(E element : inputArray) {
		         System.out.printf("%s ", element);
		      }
		      System.out.println();
		   }

		   public static void main(String args[]) {
		     		  
		      Camiseta lista1 = new Camiseta("Manga Curta", Tamanho.PP);
		      Camiseta lista2 = new Camiseta("Manga Longa", Tamanho.M);
		      Camiseta lista3 = new Camiseta("Regata", Tamanho.G);
		      Camiseta[] camisetaArray = {lista1, lista2, lista3};
		      System.out.println("\n\nArray de Camisetas");
		      printArray(camisetaArray);
		      
		      //Fazer um array de outra coisa e chamar o método printArray para imprimir os elementos dele
		      
		   }
		   
	}

	enum Tamanho{
		 PP, P, M, G,GG
	}

	class Camiseta {
		private String tipo;
		private Tamanho tamanho;
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		public Tamanho getTamanho() {
			return tamanho;
		}
		public void setTamanho(Tamanho tamanho) {
			this.tamanho = tamanho;
		}
		public Camiseta(String tipo, Tamanho tamanho) {
			super();
			this.tipo = tipo;
			this.tamanho = tamanho;
		}
				@Override
		public String toString() {
			return "Camiseta [tipo=" + tipo + ", tamanho=" + tamanho + "]";
		}
		
	}




