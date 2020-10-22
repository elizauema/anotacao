package teste;

public class ExemploStatic {

	public static void main(String[] args) {
		
		JogadorDeFutebol neymar = new JogadorDeFutebol(2000000000, "Neymar");
		System.out.println("Saldo Neymar: " + neymar.getSaldoBancario());
		System.out.println(JogadorDeFutebol.contador);
		neymar.chutarBola();
		
		System.out.println();
		
		JogadorDeFutebol teves = new JogadorDeFutebol(1000000000, "Teves");
		System.out.println("Saldo Teves: " + teves.getSaldoBancario());
		System.out.println(JogadorDeFutebol.contador);
		teves.chutarBola();
		
		System.out.println();
		
		JogadorDeFutebol zico = new JogadorDeFutebol(1000000000, "Zico");
		System.out.println("Saldo Teves: " + zico.getSaldoBancario());
		System.out.println(JogadorDeFutebol.contador);
		zico.chutarBola();
		
		System.out.println();
		
		JogadorDeFutebol.chutarABola();
	}

}

class JogadorDeFutebol{
	
	private String nome;
	private double saldoBancario;
	public static int contador;
	
	public JogadorDeFutebol(double saldoBancario, String nome) {
		this.saldoBancario = saldoBancario;
		this.nome = nome;
		contador++;
	}

	public double getSaldoBancario() {
		return saldoBancario;
	}

	public void setSaldoBancario(double saldoBancario) {
		this.saldoBancario = saldoBancario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void chutarBola() {
		System.out.println("O jogador " + nome + " chutou a bola");
	}
	
	public static void chutarABola(){
		//System.out.println("O jogador " + nome + " chutou a bola"); //não pode usar variável de instância dentro de método static
		System.out.println("O jogador chutou a bola");
	}
	
}
