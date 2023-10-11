package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.ModelDisciplina;



public class DaoDisciplina {

	private final String url = "jdbc:mysql://localhost:3306/senai_banco_academico";
	private final String usuario = "root";
	private final String senha = "aluno";

	public void adicionarDisciplina(ModelDisciplina diciplinaModel) {

		try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {

			String sql = "insert into disciplina (sigla,nome,ementa) values (?,?,?)";

			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, diciplinaModel.getSiglaDisciplina());
			preparedStatement.setString(2, diciplinaModel.getNome());
			preparedStatement.setString(3, diciplinaModel.getEmenta());
			preparedStatement.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();

		}

	}
	
	public List<ModelDisciplina> exibirDisciplinas() {
		List<ModelDisciplina> listadisciplina = new ArrayList<>();
		try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {

			String sql = "select * from disciplina";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				String sigla = resultSet.getString("sigla");
				String nome = resultSet.getString("nome");
				String ementa = resultSet.getString("ementa");

		

			ModelDisciplina disciplina = new ModelDisciplina(sigla,nome,ementa);

			listadisciplina.add(disciplina);
			
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return listadisciplina;
	}


	public void removeDisciplinas(ModelDisciplina disciplinaModel) {
		try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {
			String sql = "delete from disciplina where sigla = ?";

			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, disciplinaModel.getSiglaDisciplina());
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void editarDiciplina(ModelDisciplina disciplinaModel) {
		try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {
			String sql = "update disciplina set nome = ?, ementa = ? where sigla = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, disciplinaModel.getNome());
			preparedStatement.setString(2, disciplinaModel.getEmenta());
			preparedStatement.setString(3, disciplinaModel.getSiglaDisciplina());
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<ModelDisciplina> listarDisciplina(String sigla) {

		List<ModelDisciplina> listaDiciplina = new ArrayList<>();
		try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {
			String sql = "select * from disciplina where sigla = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, sigla);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				sigla = resultSet.getString("sigla");
				String nome = resultSet.getString("nome");
				String ementa = resultSet.getString("ementa");
				
				
				ModelDisciplina diciplinaModel = new ModelDisciplina(sigla,nome,ementa);

				listaDiciplina.add(diciplinaModel);
				
			}
			
			return listaDiciplina;
			

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;

	}

	

}
