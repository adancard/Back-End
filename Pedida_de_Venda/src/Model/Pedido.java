package Model;

import java.util.Date;

public class Pedido {

	private int idPedido;
	private int quantidade;
	private Date data;
	private Cliente cliente;
	private Produto produto;

	public Pedido(int idPedido, Cliente cliente, Produto produto, int quantidade, Date data) {

		this.criarPedido(idPedido, cliente, produto, quantidade, data);

	}

	public void criarPedido(int idPedido, Cliente cliente, Produto produto, int quantidade, Date data) {

		this.idPedido = idPedido;
		this.cliente = cliente;
		this.produto = produto;
		this.quantidade = quantidade;
		this.data = data;

	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
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

	public Cliente getCliente() {
		return cliente;
	}

	public Produto getProduto() {
		return produto;
	}

}
