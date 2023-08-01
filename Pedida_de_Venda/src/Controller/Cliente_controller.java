package Controller;

import Model.Cliente;
import View.Cliente_view;

public class Cliente_controller {

	private Cliente_view cliente_view;

	// Construtor Cliente controller
	public Cliente_controller() {

		cliente_view = new Cliente_view();

	}

	// metodo para criar um Cliente
	public Cliente criarCliente(int idCliente, String nome, String email) {

		Cliente cliente = new Cliente(idCliente, nome, email);

		return cliente;

	}

	// exibir os detalhes do cliente
	public void exibirDetalhesCliente(Cliente cliente) {

		cliente_view.exibircliente(cliente);
	}

}
