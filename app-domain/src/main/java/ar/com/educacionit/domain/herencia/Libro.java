package ar.com.educacionit.domain.herencia;

public class Libro extends Articulo {

	private String editorial;
	
	public Libro(String titulo, String autor, Float precio) {
		super(titulo, autor, precio);
		
		this.categoria = 1;
	}

	public Libro(String titulo, String autor, Float precio, String editorial) {
		super(titulo, autor, precio);
		this.editorial = editorial;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	@Override
	public String toString() {
		
		//usar lo que tiene el padre + lo propio
		String toStrinPadre = super.toString();
		
		String miToString = ", editorial = " + this.editorial;
		
		return toStrinPadre + miToString;
	}
}
