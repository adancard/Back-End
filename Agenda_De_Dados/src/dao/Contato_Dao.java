package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Contato_Model;

public class Contato_Dao {

	private final String url = "jdbc:mysql://localhost:3306/adan";
	// private final String url = "jdbc:mysql://localhost:3306/PrimeiroBanco";
	private final String usuario = "root";
	// private final String senha = "aluno";
	private final String senha = "Adan7355608!";
	private Connection connection;

	public void adicionarContato(Contato_Model contatoModel) {

		try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {

			String sql = "insert into agenda (id,nome,email,telefone) values (?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, contatoModel.getId());
			preparedStatement.setString(2, contatoModel.getNome());
			preparedStatement.setString(3, contatoModel.getEmail());
			preparedStatement.setInt(4, contatoModel.getTelefone());
			preparedStatement.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();

		}

	}

	public List<Contato_Model> obterListaContato() {
		List<Contato_Model> listaContato = new ArrayList<>();

		try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {

			String sql = "select * from agenda";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				int id = resultSet.getInt("id");
				String nome = resultSet.getString("nome");
				String email = resultSet.getString("email");
				int telefone = resultSet.getInt("telefone");

				Contato_Model contatoModel = new Contato_Model(id, nome, email, telefone);

				listaContato.add(contatoModel);

			}

		} catch (SQLException e) {

			e.printStackTrace();

		}

		return listaContato;

	}

	public void remover(Contato_Model contatoModel) {

		try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {

			String sql = "delete from agenda where nome = ? ";

			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, contatoModel.getNome());
			preparedStatement.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public Contato_Model listaContatoNome(String nome) {

		try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {
			String sql = "select * from agenda where nome = ? ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,nome);
			ResultSet resultSet = preparedStatement.executeQuery();

					if (resultSet.next()) {

						int id = resultSet.getInt("id");
						nome = resultSet.getString("nome");
						String email = resultSet.getString("email");
						int telefone = resultSet.getInt("telefone");

						return new Contato_Model(id, nome, email, telefone);

					}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return null;

	}

	public Contato_Model listaContatoId(int id) {

		try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {
			String sql = "select * from agenda where id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();

					if (resultSet.next()) {

						id = resultSet.getInt("id");
						String nome = resultSet.getString("nome");
						String email = resultSet.getString("email");
						int telefone = resultSet.getInt("telefone");

						return new Contato_Model(id, nome, email, telefone);

					}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return null;

	}

	public void editarContato(Contato_Model contatoModel) {

		try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {
			String sql = "update agenda set nome = ?,email = ?, telefone = ? where id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, contatoModel.getNome());
			preparedStatement.setString(2, contatoModel.getEmail());
			preparedStatement.setInt(3, contatoModel.getTelefone());
			preparedStatement.setInt(4, contatoModel.getId());
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
