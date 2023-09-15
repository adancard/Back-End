package view;

import java.util.List;

import model.Contato_Model;

public class Contato_View {
	
	public void exibirListaContato(List<Contato_Model> contatoModel) {
		
		System.out.println("====== Lista de Contatos =====");
		
		for(Contato_Model contato : contatoModel) {
			
			System.out.println("Id: "+contato.getId()+
					"Nome: "+contato.getNome()+
					"Email: "+contato.getEmail()+
					"Telefone: "+contato.getTelefone());
		}
		
		System.out.println("================================");
		
	}

}
