package ar.com.educacionit.domain.herencia;

public class Pasatiempo extends Articulo {

	private String marca;

	//alt+shift+s
	public Pasatiempo(String titulo, String autor, Float precio) {
		super(titulo, autor, precio);
		this.categoria = 4;
	}

	public Pasatiempo(String titulo, String autor, Float precio, String marca) {
		super(titulo, autor, precio);
		this.marca = marca;
		this.categoria = 4;
	}

	//get/set
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
}
