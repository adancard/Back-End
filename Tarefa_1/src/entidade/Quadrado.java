package entidade;

public class Quadrado {

	private float lado;

	public void add() {

		setLado(lado);

	}

	public float area() {

		return (float) Math.pow(lado, 4);

	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

}
