package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Aluno;

public class Aluno_Dao {

	private static final String URL = "jdbc:mysql://localhost:3306/turma";
	private static final String USUARIO = "root";
	private static final String SENHA = "aluno";
	private Connection connection;

	public Aluno_Dao() {

	}

	public void adicionarAluno(Aluno aluno) {

		try (Connection connection = DriverManager.getConnection(URL, USUARIO, SENHA)) {

			String sql = "insert into aluno (id_aluno,nome,idade) values(?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, aluno.getId_aluno());
			preparedStatement.setString(2, aluno.getNome());
			preparedStatement.setInt(3, aluno.getIdade());
			preparedStatement.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();

		}

	}
	
	public List<Aluno> listarAluno() {
		
		List<Aluno> listaAluno = new ArrayList<>();
		
		try(Connection connection = DriverManager.getConnection(URL,USUARIO,SENHA)){
			
			String sql = "select * from aluno";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				
				int id = resultSet.getInt("id_aluno");
				String nome = resultSet.getString("nome");
				int idade = resultSet.getInt("idade");
				
				Aluno alunoModel = new Aluno(id,nome,idade);
				
				listaAluno.add(alunoModel);
				
			}
		
		}catch(SQLException e) {
			
			e.printStackTrace();
		}
		return listaAluno;
		
	}
	
	
	public Aluno listarId(int id) {
		
		try(Connection connection = DriverManager.getConnection(URL,USUARIO,SENHA)){
			
			String sql = "select * from aluno where id_aluno = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				
				id = resultSet.getInt("id_aluno");
				String nome = resultSet.getString("nome");
				int idade = resultSet.getInt("idade");
				
				return new Aluno(id,nome,idade);
				
			}
			
		}catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		
		return null;
		
	}
	
	public void removerAluno(Aluno aluno) {
		
		try(Connection connection = DriverManager.getConnection(URL,USUARIO,SENHA)){
			
			String sql = "delete from aluno where id_aluno = ? ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, aluno.getId_aluno());
			preparedStatement.executeUpdate();
			
			
		}catch(SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	public void editarAluno(Aluno aluno) {
		
		try(Connection connection = DriverManager.getConnection(URL,USUARIO,SENHA)){
			
			String sql = "update aluno set nome = ?,idade = ? where id_aluno = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,aluno.getNome());
			preparedStatement.setInt(2, aluno.getIdade());
			preparedStatement.setInt(3, aluno.getId_aluno());
			preparedStatement.executeUpdate();
			
			
			
		}catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	
	public boolean testaConexao() {

		boolean conectou = abreConexao();

		fechaConexao();

		return conectou;

	}

	public boolean abreConexao() {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection(URL, USUARIO, SENHA);

			if (connection != null) {

				return true;

			} else {

				return false;

			}

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
			return false;

		}

	}

	public void fechaConexao() {

		try {

			if (connection != null) {

				connection.close();
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
