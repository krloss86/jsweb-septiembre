package ar.com.educacionit.domain.clase4.utils;

import ar.com.educacionit.domain.clase4.voladores.Avion;
import ar.com.educacionit.domain.clase4.voladores.Helicoptero;
import ar.com.educacionit.domain.clase4.voladores.SuperMan;
import ar.com.educacionit.domain.clase4.voladores.Volador;

public final class VoladorUtil {

	public static Volador[] contruirVoladores () {
		
		Avion avion = new Avion("747");
		avion.setExisteFalla(true);
		
		Avion avion2 = new Avion("747");
		
		Helicoptero apache = new Helicoptero("Apache");
		Helicoptero apache2 = new Helicoptero("Apache");
		apache.setExisteFalla(true);
		
		SuperMan clark = new SuperMan("Clark Ken");
		
		Volador[] voladores = new  Volador[5];
		
		voladores[0] = avion;
		voladores[1] = avion2;
		voladores[2] = apache;
		voladores[3] = apache2;
		voladores[4] = clark;
		
		return voladores;
	}
}
