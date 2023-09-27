package model;

public class Tarefa_Model {
	
	private int id;
	private String titulo;
	private String descricao;
	private Enum<Status> status;
	
	public Tarefa_Model(int id, String titulo, String descricao, Enum<Status> status) {
		
		this.id=id;
		this.titulo=titulo;
		this.descricao=descricao;
		this.status = status;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	public Enum<Status> getStatus() {
		return status;
	}

	public void setStatus(Enum<Status> status) {
		this.status = status;
	}

	public enum Status {
		
		A("Aberto"),
		P("Pendente"),
		C("Concluido");
		
		
		private String descricao;
		
		
		Status(String descricao){
			
			this.descricao = descricao;
			
		}
		
		
		public String getDescricao() {
			
			return descricao;
			
		}
		
		
	}
	
	
	

}
