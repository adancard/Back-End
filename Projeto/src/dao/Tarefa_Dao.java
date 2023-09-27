package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Tarefa_Model;
import model.Tarefa_Model.Status;

public class Tarefa_Dao {

	private final String url = "jdbc:mysql://localhost:3306/Projeto_Revisao";
	private final String usuario = "root";
	private final String senha = "aluno";
	private Connection connection;

	public void adicionarTarefa(Tarefa_Model tarefaModel) {

		try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {

			String sql = "insert into tarefa (id_tarefa,titulo,descricao,status) values (?,?,?,'A')";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, tarefaModel.getId());
			preparedStatement.setString(2, tarefaModel.getTitulo());
			preparedStatement.setString(3, tarefaModel.getDescricao());
			preparedStatement.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();

		}

	}

	public void editarTarefa(Tarefa_Model tarefaModel) {

		try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {
			String sql = "update tarefa set status = ? where id_tarefa = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, tarefaModel.getStatus().name());
			preparedStatement.setInt(2, tarefaModel.getId());
			preparedStatement.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();

		}

	}

	public void finalizarTarefa(Tarefa_Model tarefaModel) {

		try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {

			String sql = "update tarefa set status = 'C' where id_tarefa = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, tarefaModel.getId());
			preparedStatement.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();

		}

	}

	public List<Tarefa_Model> obterListaTarefa() {
		List<Tarefa_Model> listaTarefa = new ArrayList<>();

		try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {

			String sql = "select * from tarefa";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				int id = resultSet.getInt("id_tarefa");
				String titulo = resultSet.getString("titulo");
				String descricao = resultSet.getString("descricao");

				Tarefa_Model tarefaModel = new Tarefa_Model(id, titulo, descricao,
						Status.valueOf(resultSet.getString("status")));

				listaTarefa.add(tarefaModel);

			}

		} catch (SQLException e) {

			e.printStackTrace();

		}

		return listaTarefa;

	}

	public void remover(Tarefa_Model tarefaModel) {

		try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {

			String sql = "delete from tarefa where id_tarefa = ? ";

			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, tarefaModel.getId());
			preparedStatement.executeUpdate();

		} catch (SQLException e) {

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

			connection = DriverManager.getConnection(url, usuario, senha);

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
