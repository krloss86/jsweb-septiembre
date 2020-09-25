package ar.com.educacionit.domain.clase4.voladores;

public abstract class Volador {

	protected String nombre;
	protected boolean existeFalla;
	
	public Volador(String nombre) {
		this.nombre = nombre;
	}
	
	protected abstract boolean isTurbina();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isExisteFalla() {
		return existeFalla;
	}

	public void setExisteFalla(boolean existeFalla) {
		this.existeFalla = existeFalla;
	}
	
}
