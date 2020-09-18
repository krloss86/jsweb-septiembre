package ar.com.educacionit.domain.herencia;

public class Articulo {

	//para que los hijos lo hereden como private
	protected String titulo;
	
	protected String autor;
	
	protected Float precio;
	
	protected Integer categoria;
	
	//contructor parametrizado
	public Articulo(String titulo, String autor, Float precio) {
		this.autor = autor;
		this.precio = precio;
		this.titulo = titulo;
	}

	//get/set
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public Integer getCategoria() {
		return categoria;
	}

	public void setCategoria(Integer categoria) {
		this.categoria = categoria;
	}
	
	//alt+shift+s
	
}
