package controller;

import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.NoSuchElementException;

import dao.Contato_Dao;
import model.Contato_Model;
import view.Contato_View;

public class Contato_Controller {
	
	private Contato_Dao contatoDao;
	private Contato_View contatoView;
	
	public Contato_Controller() {
		
		contatoDao =  new Contato_Dao();
		contatoView =  new Contato_View();
		
	}
	
	
	public void adicinarContatao(int id, String nome, String email, int telefone) {
		
		Contato_Model contatoModel = new Contato_Model(id,nome,email,telefone);
		
		contatoDao.adicionarTarefa(contatoModel);
		
	}
	
	public void exibirListaContato() {
		
		List<Contato_Model> listaContato = contatoDao.obterListaContato();
		
		contatoView.exibirListaContato(listaContato);
		
	}
	
	
	public void removerPais(String nomeContato) {
		
		
		for(Contato_Model contato : contatoDao.obterListaContato()) {
			
			
			if(contato.getNome().equalsIgnoreCase(nomeContato)) {
				
				contatoDao.remover(contato);
				
				break;
				
			}
			
		}
	}
	
	public void acharNome(){
		
		try {
			
			Contato_Model contato = contatoDao.listaContatoNome();
			
			if(contato == null) {
				
				System.out.println("vazia");
				
			}
			
			contatoView.exibirListaContato(null);
			
		}catch(NoSuchElementException e) {
			
			e.printStackTrace();
			
		}
		
	}

}
