package ar.com.educacionit.domain;

public class Producto {

	private Long id;
	
	private String titulo;
	
	private Float precio;
	
	private String codigo;

	public Producto(Long id, String titulo, Float precio, String codigo) {
		this.id = id;
		this.titulo = titulo;
		this.precio = precio;
		this.codigo = codigo;
	}

	public Producto(String titulo, Float precio, String codigo) {
		this.titulo = titulo;
		this.precio = precio;
		this.codigo = codigo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", titulo=" + titulo + ", precio=" + precio + ", codigo=" + codigo + "]";
	}
	
}
