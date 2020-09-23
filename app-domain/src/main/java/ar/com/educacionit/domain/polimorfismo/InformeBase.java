package ar.com.educacionit.domain.polimorfismo;

public abstract class InformeBase {

	//atributos
	protected String nombre;
	
	//constructor
	public InformeBase(String nombre) {
		this.nombre = nombre;
	}
	
	public void realizarConversion() {
		
		//runtime = dinamic binding
		String informeHijo = this.convertir();
		
		System.out.println("Generando informe en " + informeHijo);
		
		System.out.println("........");
		
		System.out.println("Se ha generado el informe" + this.nombre);
	}

	//los hijos!!!
	public abstract String convertir();

	//gets/sets
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
