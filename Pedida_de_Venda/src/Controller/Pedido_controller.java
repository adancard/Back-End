package Controller;

import java.util.Date;

import Model.Cliente;
import Model.Pedido;
import Model.Produto;
import View.Pedido_view;

public class Pedido_controller {

	private Pedido_view pedidoview;

	// Construtor pedido controller
	public Pedido_controller() {

		pedidoview = new Pedido_view();

	}

	// Medodo para criar um pedido
	public Pedido criarPedido(int idPedido, Cliente cliente, Produto produto, int quantidade, Date data) {

		Pedido pedido = new Pedido(idPedido, cliente, produto, quantidade, data);

		return pedido;

	}

	// Mostrar os detalhes do pedido
	public void exibirDetalhesPedido(Pedido pedido) {

		pedidoview.exibirPedido(pedido);

	}

}
