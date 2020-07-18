package teste;

import java.math.BigDecimal;
import java.util.List;

class Pedido{
	
	public Pedido(List<ItemDoPedido> itens) {
		this.itens = itens;
	}

	private List<ItemDoPedido> itens;

	public List<ItemDoPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemDoPedido> itens) {
		this.itens = itens;
	}
}

class ItemDoPedido{
	
	private String nomeProduto;
	private BigDecimal preco;
	
	public ItemDoPedido(String nomeProduto, BigDecimal preco) {
		this.nomeProduto = nomeProduto;
		this.preco = preco;
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
}

public class ExemploMetodosEncadeados {

	public static void main(String[] args) {
		
		ItemDoPedido livro = new ItemDoPedido("Harry Potter e a pedra filosofal", new BigDecimal("45.00"));
		ItemDoPedido notebook = new ItemDoPedido("notebook Lenovo", new BigDecimal("2500.00"));
		
//		List<ItemDoPedido> itens = new ArrayList<>();
//		itens.add(livro);
//		itens.add(notebook);
		
		List<ItemDoPedido> itens = List.of(livro, notebook);
		
		Pedido pedido = new Pedido(itens);
		
//		System.out.println(pedido.getItens().get(0).getNomeProduto());
//		System.out.println(pedido.getItens().get(0).getPreco());
		
		List<ItemDoPedido> listaDeItens = pedido.getItens();
		ItemDoPedido itemDoPedido = listaDeItens.get(0);
//		ItemDoPedido itemDoPedido2 = listaDeItens.get(1);
		String nomeProduto = itemDoPedido.getNomeProduto();
		System.out.println(nomeProduto);
		BigDecimal preco = itemDoPedido.getPreco();
		System.out.println(preco);
	}

}
