package ar.com.educacionit.domain.polimorfismo;

public class InformeCSV extends InformeBase {

	//alt+shift+s
	public InformeCSV(String nombre) {
		super(nombre);
	}
	
	@Override
	public String convertir() {
		return "CSV";
	}
}
