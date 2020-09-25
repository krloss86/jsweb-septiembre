package ar.com.educacionit.domain.clase4.saludadores;

import ar.com.educacionit.domain.clase4.saludadores.interfaces.ISaludable;

public class InterfazSaludableMain {

	public static void main(String[] args) {
		
		//creacion de clases
		Espanol espanol = new Espanol();
		Ingles ingles = new Ingles();
		Aleman aleman = new Aleman("Pachu");
		Chino chino = new Chino();
		
		ISaludable[] saludadores = new ISaludable[4];
		saludadores[0] = espanol;
		saludadores[1] = ingles;
		saludadores[2] = aleman;
		saludadores[3] = chino;
		
		for(ISaludable saludador : saludadores) {

			//es una persona?
			if(saludador instanceof Persona) {
				Persona persona = (Persona)saludador;
				System.out.println(persona.getNombre()) ;
			}
			saludador.saludar();
		}
	}

}
