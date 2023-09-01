package main;

import controller.Fatorial_Controller;

public class Fatorial_Main {
	
	public static void main(String[] args) {
		
		//Importando o pacote controller 
		Fatorial_Controller fatorialController = new Fatorial_Controller();
		
		//chamando o metodo menu para o usuario
		fatorialController.menu();
		
	}

}
