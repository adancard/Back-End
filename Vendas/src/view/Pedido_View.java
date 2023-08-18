package view;

import java.util.List;

import model.Pedido;

public class Pedido_View {

	public void exibirPedido(List<Pedido> pedido) {

		System.out.println("Lista de pedido");

		for (Pedido pedidos : pedido) {

			System.out.println("Id do pedido: " + pedidos.getIdPedido() + " Data do pedido: " + pedidos.getData()
					+ "Id do pedido: " + pedidos.getProduto().getIdProduto() + "Nome do produto "
					+ pedidos.getProduto().getNome() + " Quantidade " + pedidos.getProduto().getQuantidade()
					+ " preco: " + pedidos.getProduto().getPreco());

		}

	}

}
