package Main;

import java.util.Date;

import Model.Cliente;
import Model.Pedido;
import Model.Produto;
import View.Pedido_view;

public class Loja {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente(1,"jorge", "jorgereidelas@gmail.com");
		
		Produto produto = new Produto(100,"celular",2);
		
		Date data = new Date();
		
		Pedido pedido = new Pedido(1, cliente , produto , 1 , data);
		
		Pedido_view pedidov = new Pedido_view();
		
		pedidov.exibirPedido(pedido);
	
	}
	
}
