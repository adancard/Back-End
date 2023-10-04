package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Aluno;
import model.Aluno_Telefone;

public class Aluno_Telefone_Dao {


	private static final String URL = "jdbc:mysql://localhost:3306/turma";
	private static final String USUARIO = "root";
	private static final String SENHA = "aluno";
	private Connection connection;
	
	public Aluno_Telefone_Dao() {
		
	}
	
	public void abreConexao() throws SQLException {
		try {
			// Carrega o driver JDBC especifico (substitua pelo driver do seu banco de
			// dados)
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection(URL, USUARIO, SENHA);
		} catch (ClassNotFoundException | SQLException e) {

			throw new SQLException("Erro ao abrir a conexão com o banco de dados", e);
		}
	}

	public void fechaConexao() {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void adicionarTelefoneAluno(Aluno_Telefone alunoTelefone) {
		
		try(Connection connection = DriverManager.getConnection(URL,USUARIO,SENHA)){
			
			String sql = "insert into aluno_telefone (id_telefone,id_aluno,telefone) values (?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, alunoTelefone.getId_telefone());
			preparedStatement.setInt(2, alunoTelefone.getAluno().getId_aluno());
			preparedStatement.setString(3, alunoTelefone.getTelefone());
			preparedStatement.executeUpdate();
			
			
		}catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		
	}
	
    public Aluno_Telefone buscaTelefonesPorAluno(int idAluno) throws SQLException {
  
	try(Connection connection = DriverManager.getConnection(URL,USUARIO,SENHA)){
			
			String sql = "select * from aluno_telefone where id_aluno = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, idAluno);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				
				int id_telefone = resultSet.getInt("id_telefone");
				Aluno alunoModel = new Aluno(idAluno = resultSet.getInt("id_aluno"),null,0);
				String telefone = resultSet.getString("telefone");
				
				return new Aluno_Telefone(id_telefone,alunoModel,telefone);
				
			}
			
		}catch(SQLException e) {
			
			e.printStackTrace();
			
		}
	
	return null;
    		
    }
    	
 
    
  public void atualizaTelefones(Aluno_Telefone alunoTelefone) throws SQLException {
	  
	  try(Connection connection = DriverManager.getConnection(URL,USUARIO,SENHA)){
			
			String sql = "update aluno_telefone set telefone = ? where id_aluno = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,alunoTelefone.getTelefone());
			preparedStatement.setInt(2, alunoTelefone.getAluno().getId_aluno());
			preparedStatement.executeUpdate();
			
		}catch(SQLException e) {
			
			e.printStackTrace();
			
		}
        
   }
	
}
