package teste;

class Pessoa{
	private String nome;

	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}*/
	
	@Override
	public boolean equals(Object obj) {
		Pessoa other = (Pessoa) obj;
		if(other.nome.equals(nome)) {
			return true;
		}else {
			return false;
		}
	}
}

public class Teste2 {
	
	public static void main(String[] args) {
		
		int x = 0;
		int y = 0;
		
		if(x == y) {
			System.out.println("Os números são iguais.");
			System.out.println("Número " + x + " é igual a número " + y);
		}
		
		Pessoa pessoa1 = new Pessoa("Eliza");
		Pessoa pessoa2 = new Pessoa("Eliza");
		Pessoa pessoa3 = pessoa1;
		
		if(pessoa1.equals(pessoa2)) {
			System.out.println("Pessoas são iguais");
		}else {
			System.out.println("Pessoas são diferentes");
		}
		
		if(pessoa1 == pessoa3) {
			System.out.println("Pessoas são iguais");
		}else {
			System.out.println("Pessoas são diferentes");
		}
		
		String nome = "Bruno";
		if("Bruno".equals(nome)) {
			System.out.println("Strings iguais.");
		}
		
	}

}
