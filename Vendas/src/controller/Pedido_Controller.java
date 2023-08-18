package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Pedido;
import model.Produto;
import view.Pedido_View;

public class Pedido_Controller {

	private List<Produto> listaProduto;
	private List<Pedido> listaPedido;
	private Pedido_View pedidoV;

	public Pedido_Controller() {

		listaPedido = new ArrayList<Pedido>();
		pedidoV = new Pedido_View();

	}

	public void acharProduto(int idProduto, int quantidade) {

		if (listaProduto.isEmpty()) {

			System.out.println("Lista vazia");

		} else {

			for (Produto produtos : listaProduto) {

				if (idProduto == produtos.getIdProduto()) {

					System.out.println("Produto achado");

					if (quantidade < produtos.getQuantidade()) {

						System.out.println("Nao eh possivel fazer o pedido");

					} else {

						produtos.setQuantidade(quantidade - produtos.getQuantidade());
						addPedido(produtos);

					}

				} else {

					System.out.println("ID do produto Incorreto");

				}

			}

		}

	}

	public void addPedido(Produto produto) {

		Pedido pedido = new Pedido(produto);

		listaPedido.add(pedido);

	}

	public void menuProduto() {

		int opcao = 1, id, quanti;
		Scanner entrada = new Scanner(System.in);

		while (opcao == 0) {

			System.out.println("1.addC");
			System.out.println("2.mostraC");

			switch (opcao) {

			case 1:

				System.out.println("id do produto");
				id = entrada.nextInt();

				System.out.println("quanti ");
				quanti = entrada.nextInt();

				acharProduto(id, quanti);
				break;

			case 2:

				pedidoV.exibirPedido(listaPedido);
				break;

			}

		}
		entrada.close();
	}

}
