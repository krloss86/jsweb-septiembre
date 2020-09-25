package ar.com.educacionit.domain.clase4.saludadores;

import ar.com.educacionit.domain.clase4.saludadores.interfaces.ISaludable;

public class Aleman extends Persona implements ISaludable {

	//contructor, para llamar al padre
	public Aleman(String nombre) {
		super(nombre);
	}
	
	@Override
	public void saludar() {
		System.out.println("hallo");
	}

}
