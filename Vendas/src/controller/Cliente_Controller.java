package controller;

import java.util.ArrayList;
import java.util.List;

import model.Cliente;
import view.Cliente_View;

public class Cliente_Controller {

	private List<Cliente> clienteL;
	private Pedido_Controller pedidoC;

	public Cliente_Controller() {

		clienteL = new ArrayList<Cliente>();
		pedidoC = new Pedido_Controller();

	}

	public void addC(int idCliente, String nome, String email, int cpf) {

		Cliente clientes = new Cliente(idCliente, nome, email, cpf);

		clienteL.add(clientes);

	}

	public void validadrCpf(int cpf) {

		if (clienteL.isEmpty()) {

			System.out.println("Lista esta vazia");

		} else {

			for (Cliente cliente : clienteL) {

				if (cpf == cliente.getCPF()) {

					System.out.println("Bem vindo " + cliente.getNome());
					pedidoC.menuProduto();

				} else {

					System.out.println("CPF Incorreto");

				}

			}

		}

	}

}
