package View;

import Model.Pedido;

public class Pedido_view {
	
	public void exibirPedido(Pedido pedido) {
		
		System.out.println("==== Detalhes do Pedido ====");
		System.out.println("ID: "+pedido.getIdPedido());
		System.out.println("Cliente: "+pedido.getCliente().getNome());
		System.out.println("Produto: "+ pedido.getProduto().getNome());
		System.out.println("Quantidade: "+pedido.getQuantidade());
		System.out.println("Data: "+pedido.getData());
		System.out.println("-----------------------------");
		
	}

}
