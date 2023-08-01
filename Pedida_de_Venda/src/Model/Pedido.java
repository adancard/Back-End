package Model;

import java.util.Date;

public class Pedido {

	private int idPedido;
	private int quantidade;
	private Cliente cliente;
	private Produto produto;
	private Date data;

	// Construtor de pedido
	public Pedido(int idPedido, Cliente cliente, Produto produto, int quantidade, Date data) {

		this.criarPedido(idPedido, cliente, produto, quantidade, data);

	}

	// Metodo para criarPedido
	public void criarPedido(int idPedido, Cliente cliente, Produto produto, int quantidade, Date data) {

		this.idPedido = idPedido;
		this.cliente = cliente;
		this.produto = produto;
		this.quantidade = quantidade;
		this.data = data;

	}

	// get and sets

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public Date getData() {
		return data;
	}

}
