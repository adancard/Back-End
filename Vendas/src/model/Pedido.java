package model;

import java.util.Date;
import java.util.Random;

public class Pedido {

	private Random idPedido;
	private Date data;
	private Produto produto;

	public Pedido(Produto produto) {

		criarPedido(produto);

	}

	public void criarPedido(Produto produto) {

		this.produto = produto;

	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Random getIdPedido() {
		return idPedido;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
