package View;

import Model.Cliente;

public class Cliente_view {

	// exibir cliente
	public void exibircliente(Cliente cliente) {

		System.out.println("====Detalhes do Cliente====");
		System.out.println("ID Cliente: " + cliente.getIdCliente());
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("Email: " + cliente.getEmail());
		System.out.println("----------------------------");

	}

}
