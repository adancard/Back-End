package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Professor_Model;

public class Professor_Dao {

	private final String url = "jdbc:mysql://localhost:3306/senai_banco_academico";
	private final String usuario = "root";
	//private final String senha = "aluno";
	private final String senha = "Adan7355608!";
	private Connection connection;

	public void adicionarProfessor(Professor_Model professorModel) {

		try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {

			String sql = "insert into professor (codigo,nome,codigo_disciplina,especialidade,data_admissao) values (?,?,?,?,?)";

			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, professorModel.getCodigo());
			preparedStatement.setString(2, professorModel.getNome());
			preparedStatement.setString(3, professorModel.getCodigo_diciplina());
			preparedStatement.setString(4, professorModel.getEspecialidade());
			preparedStatement.setString(5, professorModel.getData_admissao());
			preparedStatement.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();

		}

	}

	public List<Professor_Model> exibirProfessores() {
		List<Professor_Model> listaProfs = new ArrayList<>();
		try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {

			String sql = "select * from professor";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				String codigo = resultSet.getString("codigo");
				String nome = resultSet.getString("nome");
				String codigo_disciplina = resultSet.getString("codigo_disciplina");
				String especialidade = resultSet.getString("especialidade");
				String data_admissao = resultSet.getString("data_admissao");
		

			Professor_Model prof = new Professor_Model(codigo, nome, codigo_disciplina, especialidade, data_admissao);

			listaProfs.add(prof);
			
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return listaProfs;
	}

	public void removeProfessor(Professor_Model professorModel) {
		try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {
			String sql = "delete from professor where codigo = ?";

			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, professorModel.getCodigo());
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void editarProfessor(Professor_Model professorModel) {
		try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {
			String sql = "update professor set nome = ?, especialidade = ? where codigo = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, professorModel.getNome());
			preparedStatement.setString(2, professorModel.getEspecialidade());
			preparedStatement.setString(3, professorModel.getCodigo());
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Professor_Model> listarProfessor(String codigo) {

		List<Professor_Model> listaProfs = new ArrayList<>();
		try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {
			String sql = "select * from professor where codigo = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, codigo);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				codigo = resultSet.getString("codigo");
				String nome = resultSet.getString("nome");
				String codigo_disciplina = resultSet.getString("codigo_disciplina");
				String especialidade = resultSet.getString("especialidade");
				String data_admissao = resultSet.getString("data_admissao");
				
				
				Professor_Model professroeModel = new Professor_Model(codigo, nome, codigo_disciplina, especialidade, data_admissao);

				listaProfs.add(professroeModel);
				
			}
			
			return listaProfs;
			

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;

	}

	public List<Professor_Model> exibirTI() {

		List<Professor_Model> listaProfs = new ArrayList<>();
		try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {

			String sql = "select distinct * from professor where especialidade like'%Tecnologia da Informa��o%' ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				String codigo = resultSet.getString("codigo");
				String nome = resultSet.getString("nome");
				String codigo_disciplina = resultSet.getString("codigo_disciplina");
				String especialidade = resultSet.getString("especialidade");
				String data_admissao = resultSet.getString("data_admissao");
			
			Professor_Model prof = new Professor_Model(codigo, nome, codigo_disciplina, especialidade, data_admissao);

			listaProfs.add(prof);
			
			}

		} catch (SQLException e) {

			e.printStackTrace();

		}

		return listaProfs;
	}

	public List<Professor_Model> dataAdmissao() {

		List<Professor_Model> listaProfs = new ArrayList<>();
		try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {

			String sql = "select * from professor order by (data_admissao) desc;";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				String codigo = resultSet.getString("codigo");
				String nome = resultSet.getString("nome");
				String codigo_disciplina = resultSet.getString("codigo_disciplina");
				String especialidade = resultSet.getString("especialidade");
				String data_admissao = resultSet.getString("data_admissao");
			
			Professor_Model prof = new Professor_Model(codigo, nome, codigo_disciplina, especialidade, data_admissao);

			listaProfs.add(prof);
			
			}

		} catch (SQLException e) {

			e.printStackTrace();

		}

		return listaProfs;
	}

}
