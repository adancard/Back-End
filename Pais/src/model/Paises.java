package model;

public class Paises {

	private String pais;
	private String capital;

	public Paises(String pais, String capital) {

		this.pais = pais;
		this.capital = capital;

	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

}
