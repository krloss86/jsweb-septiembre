package ar.com.educacionit.domain.herencia;

public class Musica extends Articulo {

	private String selloDiscografico;
	
	public Musica(String titulo, String autor, Float precio, String selloD) {
		super(titulo, autor, precio);
		
		//todas las lineas de codigo que quiero
		
		//es particular de esta clase Musica
		this.categoria = 2;
		
		this.selloDiscografico = selloD;
		
		//acceso a atributos
		//this.precio;
		//super.precio;
		//precio;
	}

	//get/set
	public String getSelloDiscografico() {
		return selloDiscografico;
	}

	public void setSelloDiscografico(String selloDiscografico) {
		this.selloDiscografico = selloDiscografico;
	}
	
	
}
