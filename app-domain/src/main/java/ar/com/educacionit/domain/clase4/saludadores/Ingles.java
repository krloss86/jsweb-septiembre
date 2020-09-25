package ar.com.educacionit.domain.clase4.saludadores;

import ar.com.educacionit.domain.clase4.saludadores.interfaces.ISaludable;

public class Ingles implements ISaludable {

	@Override
	public void saludar() {
		System.out.println("hello");
	}

}
