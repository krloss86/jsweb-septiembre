package ar.com.educacionit.domain.clase4.voladores;

public class SuperHeroe extends Volador {

	public SuperHeroe(String nombre) {
		super(nombre);
	}

	@Override
	protected boolean isTurbina() {
		return false;
	}

}
