package ar.com.educacionit.domain.clase4.voladores;

import ar.com.educacionit.domain.clase4.dtos.Resultado;
import ar.com.educacionit.domain.clase4.interfaces.Aterrizable;

public class Avion extends Maquina implements Aterrizable {

	public Avion(String nombre) {
		super(nombre);
	}

	@Override
	public Resultado aterrizar() {
		
		Resultado resultado; 
		
		if(super.existeFalla) {
			resultado = new Resultado(true, "Error en :" + getNombre());
		}else {
			resultado = new Resultado(false);
		}
		
		return resultado;
	}

	@Override
	protected boolean isTurbina() {
		return true;
	}

}
