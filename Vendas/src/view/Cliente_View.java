package view;

import java.util.List;

import model.Cliente;

public class Cliente_View {
	
	
	public void ListaC(List<Cliente> clientes) {
		
		System.out.println("=====Lista do Cliente=====");
		
		for(Cliente cliente : clientes) {
			
			
			System.out.println("ID do cliente: "+cliente.getIdCliente()+" Nome do Cliente: "+cliente.getNome()+" Email do cliente: "+cliente.getEmail()+" CPF do cliente: "+cliente.getCPF());
			
			
		}
		
	}

}
