package main;

import java.sql.SQLException;

import controller.Aluno_Controller;

public class Aluno_Main {
	
	public static void main(String[] args) throws SQLException {
		
		Aluno_Controller alunoController = new Aluno_Controller();
		
		alunoController.menu();
		
	}

}
