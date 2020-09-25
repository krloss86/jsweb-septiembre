package ar.com.educacionit.domain.clase4.saludadores;

import ar.com.educacionit.domain.clase4.saludadores.interfaces.ISaludable;

public class Espanol implements ISaludable {

	@Override
	public void saludar() {
		System.out.println("hola");
	}

}
