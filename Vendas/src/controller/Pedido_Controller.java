package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Pedido;
import model.Produto;
import view.Pedido_View;

public class Pedido_Controller {

	private Produto_Controller produtoC;
	private List<Pedido> listaPedido;

	public Pedido_Controller() {

		listaPedido = new ArrayList<Pedido>();
		produtoC = new Produto_Controller();

	}

	public void addPedido(Produto produto) {

		Pedido pedido = new Pedido(produto);

		listaPedido.add(pedido);

	}

	public void menuProduto() {

		int opcao = 1, id, quanti;
		Scanner entrada = new Scanner(System.in);

		while (opcao != 0) {

			System.out.println("1.addC");
			System.out.println("2.mostraC");
			opcao = entrada.nextInt();

			switch (opcao) {

			case 1:

				System.out.println("id do produto");
				id = entrada.nextInt();

				System.out.println("quanti ");
				quanti = entrada.nextInt();

				produtoC.acharProduto(id, quanti);
				break;

			case 2:

				produtoC.mostrarProduto();
				break;

			}

		}
		entrada.close();
	}

}
