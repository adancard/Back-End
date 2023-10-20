package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lista_tarefa")
public class Tarefa_Model {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "id_tarefa")
	private Integer id;
	@Column(name = "titulo")
	private String titulo;
	@Column(name = "descricao")
	private String descricao;
	@Column(name = "data_vencimento")
	private String data_vencimento;
	@Column(name = "prioridade")
	private Enum<Prioridade> prioridade;
	@Column(name = "estado")
	private Enum<Estado> estado;

	public Tarefa_Model() {

	}

	public Tarefa_Model(String titulo, String descricao, String data_vencimento, Enum<Prioridade> prioridade,
			Enum<Estado> estado) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.data_vencimento = data_vencimento;
		this.prioridade = prioridade;
		this.estado = estado;
	}

	public Integer getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getData_vencimento() {
		return data_vencimento;
	}

	public void setData_vencimento(String data_vencimento) {
		this.data_vencimento = data_vencimento;
	}

	public Enum<Prioridade> getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Enum<Prioridade> prioridade) {
		this.prioridade = prioridade;
	}

	public Enum<Estado> getEstado() {
		return estado;
	}

	public void setEstado(Enum<Estado> estado) {
		this.estado = estado;
	}

	public enum Prioridade {

		A("Alta"), M("Media"), B("Baixa");

		private String descricaoPrioridade;

		Prioridade(String descricaoPrioridade) {

			this.descricaoPrioridade = descricaoPrioridade;

		}

		public String getDescricaoPrioridade() {

			return descricaoPrioridade;

		}

	}

	public enum Estado {

		A("A fazer"), E("Em andamento"), C("Concluida");

		private String descricaoEstado;

		Estado(String descricaoEstado) {

			this.descricaoEstado = descricaoEstado;

		}

		public String getDescricaoEstado() {

			return descricaoEstado;

		}

	}

}
