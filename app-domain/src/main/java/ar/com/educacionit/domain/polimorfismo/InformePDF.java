package ar.com.educacionit.domain.polimorfismo;

public class InformePDF extends InformeBase {

	public InformePDF(String nombre) {
		super(nombre);
	}

	//polimorfismo con redefinicion
	@Override
	public String convertir() {
		return "PDF";
	}
	
}
