package dao;

import java.util.ArrayList;
import java.util.List;

import model.Planeta_Model;

public class Planeta_Dao {
	
	private List<Planeta_Model> listaPlanetas;
	
	
	public Planeta_Dao() {
		
		listaPlanetas = new ArrayList<>();
		
	}
	
	
	public void adicionarPlaneta(String nome) {
		
		Planeta_Model planeta = new Planeta_Model(nome);
		
		listaPlanetas.add(planeta);
		
	}
	
	public List<Planeta_Model> obtemListaPlaneta() {
		
		return listaPlanetas;
			
	}
	

}
