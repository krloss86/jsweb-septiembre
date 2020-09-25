package ar.com.educacionit.domain.clase4.saludadores;

import ar.com.educacionit.domain.clase4.saludadores.interfaces.ISaludable;

public class Chino implements ISaludable {

	//ctrl+space
	@Override
	public void saludar() {
		System.out.println("Nǐ hǎo");
	}
}
