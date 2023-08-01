package Main;

//imports dos pacotes
import java.util.Date;
import Model.Cliente;
import Model.Pedido;
import Model.Produto;
import Controller.Cliente_controller;
import Controller.Pedido_controller;
import Controller.Produto_controller;

public class Loja {

	public static void main(String[] args) {

		// cria objeto produto controller
		Produto_controller produtoC = new Produto_controller();

		// cria objeto criar produto
		Produto produto = produtoC.criarProduto(3, "celular", 999.1);

		// cria objeto cliente controller
		Cliente_controller clienteC = new Cliente_controller();

		// cria o objeto criar pedido
		Cliente cliente = clienteC.criarCliente(2, "joao", "joaoreidelas@gmail.com");

		Date data = new Date();

		// Cria objeto pedido controller
		Pedido_controller pedidoC = new Pedido_controller();

		// Cria objeto pedido
		Pedido pedido = pedidoC.criarPedido(1, cliente, produto, 2, data);

		// Exibir detalhes do pedido
		pedidoC.exibirDetalhesPedido(pedido);

		// exibir detalhes do cliente
		clienteC.exibirDetalhesCliente(cliente);

		// exibir detalhes produto
		produtoC.exibirDetalhesProduto(produto);

	}

}
