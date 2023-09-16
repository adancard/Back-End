package view;

import java.util.List;

import model.Contato_Model;

public class Contato_View {
	
	public void exibirListaContato(List<Contato_Model> contatoModel) {
		
		System.out.println("====== Lista de Contatos =====");
		
		for(Contato_Model contato : contatoModel) {
			
			System.out.println("Id: "+contato.getId()+"\n"+
					"Nome: "+contato.getNome()+"\n"+
					"Email: "+contato.getEmail()+"\n"+
					"Telefone: "+contato.getTelefone());
			
			System.out.println("================================");
		}
		
	}
	
	public void exibirContato(Contato_Model contatoModel) {
		
		System.out.println("====== Contato ======");
		System.out.println("Id:"+contatoModel.getId()+"\n"+
				"Nome: "+contatoModel.getNome()+"\n"+
				"Telefone: "+contatoModel.getTelefone()+"\n"+
				"Email: "+contatoModel.getEmail());
		
		System.out.println("======================");
		
	}
	
	public void exibirMensagem(String msg) {
		
		
		System.out.println(msg);
		
	}

}
