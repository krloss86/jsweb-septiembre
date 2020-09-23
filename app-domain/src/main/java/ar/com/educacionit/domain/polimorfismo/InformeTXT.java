package ar.com.educacionit.domain.polimorfismo;

public class InformeTXT extends InformeBase {

	public InformeTXT(String nombre) {
		super(nombre);
	}

	//no cambia el comportamiento del padre!!!
	@Override
	public String convertir() {
		return "TXT";
	}
}
